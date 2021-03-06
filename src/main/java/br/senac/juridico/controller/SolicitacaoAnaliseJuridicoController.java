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

import br.senac.juridico.model.SolicitacaoAnaliseJuridico;
import br.senac.juridico.service.SolicitacaoAnaliseJuridicoService;

@RestController
@RequestMapping("api/solicitacaoAnaliseJuridico")
public class SolicitacaoAnaliseJuridicoController {

	private final SolicitacaoAnaliseJuridicoService solicitacaoAnaliseJuridicoService;

	@Autowired
	public SolicitacaoAnaliseJuridicoController(SolicitacaoAnaliseJuridicoService solicitacaoAnaliseJuridicoService) {
		this.solicitacaoAnaliseJuridicoService = solicitacaoAnaliseJuridicoService;
	}
	
	@GetMapping
	public ResponseEntity<List<SolicitacaoAnaliseJuridico>> obterSolicitacaoAnaliseJuridico(){
		List<SolicitacaoAnaliseJuridico> solicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.buscarSolicitacaoAnaliseJuridicoAtivos();
		return new ResponseEntity<>(solicitacaoAnaliseJuridico, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<SolicitacaoAnaliseJuridico> obterSolicitacaoAnaliseJuridicoPorId(@PathVariable("id") Integer id){
		SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.buscaSolicitacaoAnaliseJuridicobyId(id);
		return new ResponseEntity<>(solicitacaoAnaliseJuridico, HttpStatus.OK);
	}
	
	@PostMapping("/inserir")
	public ResponseEntity<SolicitacaoAnaliseJuridico> adicionarSolicitacaoAnaliseJuridico(@RequestBody SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico){
		SolicitacaoAnaliseJuridico novaSolicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.adicionarSolicitacaoAnaliseJuridico(solicitacaoAnaliseJuridico);
		return new ResponseEntity<>(novaSolicitacaoAnaliseJuridico, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<SolicitacaoAnaliseJuridico> atualizarSolicitacaoAnaliseJuridico(@RequestBody SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico){		
		SolicitacaoAnaliseJuridico atualizarSolicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.atualizarSolicitacaoAnaliseJuridico(solicitacaoAnaliseJuridico);
		return new ResponseEntity<>(atualizarSolicitacaoAnaliseJuridico, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> excluirSolicitacaoAnaliseJuridico(@PathVariable("id") Integer id){
		solicitacaoAnaliseJuridicoService.excluirSolicitacaoAnaliseJuridico(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}