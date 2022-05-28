package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.senac.juridico.model.AtendimentoRegistroEnvolvido;
import br.senac.juridico.service.AtendimentoRegistroEnvolvidoService;

@Controller
@RequestMapping("api/registroEnvolvido")
public class AtendimentoRegistroEnvolvidoController {

	private final AtendimentoRegistroEnvolvidoService atendimentoRegistroEnvolvidoService;
	
	@Autowired
	public AtendimentoRegistroEnvolvidoController(AtendimentoRegistroEnvolvidoService atendimentoRegistroEnvolvidoService) {
		this.atendimentoRegistroEnvolvidoService = atendimentoRegistroEnvolvidoService;
	}
	
	@GetMapping
	public ResponseEntity<List<AtendimentoRegistroEnvolvido>> listarTodosRegistrosEnvolvidos(){
		List<AtendimentoRegistroEnvolvido> registrosEnvolvidos = atendimentoRegistroEnvolvidoService.listarTodosRegistrosEnvolvidosAtivos();
		return new ResponseEntity<>(registrosEnvolvidos, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<AtendimentoRegistroEnvolvido> buscarAtendimentoRegistroEnvolvidoPorId(@PathVariable ("id") Integer id){
		AtendimentoRegistroEnvolvido registroEnvolvido = atendimentoRegistroEnvolvidoService.buscarRegistroEnvolvidoPorId(id);
		return new ResponseEntity<>(registroEnvolvido, HttpStatus.OK);
	}
	
	@PostMapping("/inserir")
	public ResponseEntity<AtendimentoRegistroEnvolvido> inserirRegistroEnvolvido(@RequestBody AtendimentoRegistroEnvolvido registroEnvolvido){
		AtendimentoRegistroEnvolvido novoRegistroEnvolvido = atendimentoRegistroEnvolvidoService.adicionarRegistroEnvolvido(registroEnvolvido);
		return new ResponseEntity<> (novoRegistroEnvolvido, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/atualizar", method=RequestMethod.PUT)
	public ResponseEntity<AtendimentoRegistroEnvolvido> alterarRegistroEnvolvido(@RequestBody AtendimentoRegistroEnvolvido registroEnvolvido){
		AtendimentoRegistroEnvolvido atualizarRegistroEnvolvido = atendimentoRegistroEnvolvidoService.alterarRegistroEnvolvido(registroEnvolvido);
		return new ResponseEntity<>(atualizarRegistroEnvolvido, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> excluirRegistroEnvolvido(@PathVariable("id") Integer id){
		atendimentoRegistroEnvolvidoService.excluirAtendimentoRegistroEnvolvido(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
