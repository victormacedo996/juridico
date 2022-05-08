package br.senac.juridico.controller;

import java.util.List;

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

import br.senac.juridico.model.SolicitacaoAlocacao;
import br.senac.juridico.service.SolicitacaoAlocacaoService;

@RestController
@RequestMapping("api/SolicitacaoAlocacao")
public class SolicitacaoAlocacaoController {
	private final SolicitacaoAlocacaoService solicitacaoAlocacaoService;

	@Autowired
	public SolicitacaoAlocacaoController(SolicitacaoAlocacaoService solicitacaoAlocacaoService) {
		this.solicitacaoAlocacaoService = solicitacaoAlocacaoService;
	}
	
	@GetMapping
	public ResponseEntity<List<SolicitacaoAlocacao>> obterSolicitacaoAlocacaos(){
		List<SolicitacaoAlocacao> solicitacaoAlocacaos = solicitacaoAlocacaoService.buscaSolicitacaoAlocacaoAtivas();
		return new ResponseEntity<>(solicitacaoAlocacaos, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<SolicitacaoAlocacao> obterSolicitacaoAlocacaoPorId(@PathVariable("id") Integer id){
		SolicitacaoAlocacao solicitacaoAlocacao = solicitacaoAlocacaoService.buscaSolicitacaoAlocacaoById(id);
		return new ResponseEntity<>(solicitacaoAlocacao, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<SolicitacaoAlocacao> adicionarSolicitacaoAlocacao(@RequestBody SolicitacaoAlocacao solicitacaoAlocacao){
		SolicitacaoAlocacao novaSolicitacaoAlocacao = solicitacaoAlocacaoService.adicionarSolicitacaoAlocacao(solicitacaoAlocacao);
		return new ResponseEntity<>(novaSolicitacaoAlocacao, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<SolicitacaoAlocacao> atualizarSolicitacaoAlocacao(@RequestBody SolicitacaoAlocacao solicitacaoAlocacao){		
		SolicitacaoAlocacao atualizarSolicitacaoAlocacao = solicitacaoAlocacaoService.atualizarSolicitacaoAlocacao(solicitacaoAlocacao);
		return new ResponseEntity<>(atualizarSolicitacaoAlocacao, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarSolicitacaoAlocacao(@PathVariable("id") Integer id){
		solicitacaoAlocacaoService.apagarSolicitacaoAlocacao(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
