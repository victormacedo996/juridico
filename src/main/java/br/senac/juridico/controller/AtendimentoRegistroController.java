package br.senac.juridico.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.juridico.model.AtendimentoRegistro;
import br.senac.juridico.service.AtendimentoRegistroService;


@Controller
@RequestMapping("/api/registro")
public class AtendimentoRegistroController {
	private final AtendimentoRegistroService registroService;
	
	@Autowired
	public AtendimentoRegistroController(AtendimentoRegistroService registroService) {
		this.registroService = registroService;
	}

	@GetMapping
	public ResponseEntity<List<AtendimentoRegistro>> listarTodosRegistros(){
		List<AtendimentoRegistro> registros = registroService.listarTodosRegistrosAtivos();
		return new ResponseEntity<>(registros, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<AtendimentoRegistro> buscarRegistroPorID(@PathVariable("id") Integer id) {
		AtendimentoRegistro registro = registroService.buscarAtendimentoRegistroPorID(id);
		return new ResponseEntity<>(registro, HttpStatus.OK);
	}
	
	@PostMapping("/inserir")
	public ResponseEntity<AtendimentoRegistro> inserirRegistro (@RequestBody AtendimentoRegistro registro){
		AtendimentoRegistro novoRegistro = registroService.adicionarRegistro(registro);
		return new ResponseEntity<>(novoRegistro, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/atualizar")
	public ResponseEntity<AtendimentoRegistro> atualizarRegistro(@RequestBody AtendimentoRegistro registro){
		AtendimentoRegistro atualizarRegistro = registroService.alterar(registro);
		return new ResponseEntity<>(atualizarRegistro, HttpStatus.OK);
	}
	
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> excluirRegistro(@PathVariable("id") Integer id){
		registroService.excluirAtendimentoRegistro(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
