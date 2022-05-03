package br.senac.juridico.controller;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.AtendimentoRegistro;
import br.senac.juridico.service.AtendimentoRegistroService;



@RestController
@RequestMapping("/api/registro")
public class AtendimentoRegistroController {
	
	@Autowired
	private AtendimentoRegistroService registroService;

	@GetMapping
	public ResponseEntity<List<AtendimentoRegistro>> listarTodosRegistros(){
		List<AtendimentoRegistro> registros = registroService.listarTodosRegistros();
		return ResponseEntity.ok().body(registros);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<AtendimentoRegistro> buscarRegistroPorID(@PathVariable Integer id) throws ObjectNotFoundException{
		AtendimentoRegistro registro = registroService.buscarRegistroPorID(id);
		return ResponseEntity.ok().body(registro);
	}
	
	@PostMapping("/inserir")
	public ResponseEntity<AtendimentoRegistro> inserirRegistro (@RequestBody AtendimentoRegistro registro){
		AtendimentoRegistro novoRegistro = registroService.adicionarRegistro(registro);
		return new ResponseEntity<>(novoRegistro, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Void> alterarRegistro(@RequestBody AtendimentoRegistro atualizarRegistro, @PathVariable Integer id){
		atualizarRegistro.setId(id);
		registroService.alterar(atualizarRegistro);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<Void> excluirRegistro(@PathVariable("id") Integer id){
		registroService.excluirRegistro(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
}
