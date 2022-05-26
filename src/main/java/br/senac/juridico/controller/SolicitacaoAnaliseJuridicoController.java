package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller;
>>>>>>> master
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;
=======
>>>>>>> master

import br.senac.juridico.model.SolicitacaoAnaliseJuridico;
import br.senac.juridico.service.SolicitacaoAnaliseJuridicoService;

<<<<<<< HEAD
@RestController
@RequestMapping("api/SolicitacaoAnaliseJuridico")
public class SolicitacaoAnaliseJuridicoController {
=======
@Controller
@RequestMapping("api/solicitacaoAnaliseJuridico")
public class SolicitacaoAnaliseJuridicoController {

>>>>>>> master
	private final SolicitacaoAnaliseJuridicoService solicitacaoAnaliseJuridicoService;

	@Autowired
	public SolicitacaoAnaliseJuridicoController(SolicitacaoAnaliseJuridicoService solicitacaoAnaliseJuridicoService) {
		this.solicitacaoAnaliseJuridicoService = solicitacaoAnaliseJuridicoService;
	}
	
	@GetMapping
<<<<<<< HEAD
	public ResponseEntity<List<SolicitacaoAnaliseJuridico>> obterSolicitacaoAnaliseJuridicos(){
		List<SolicitacaoAnaliseJuridico> solicitacaoAnaliseJuridicos = solicitacaoAnaliseJuridicoService.buscaSolicitacaoAnaliseJuridicoAtivas();
		return new ResponseEntity<>(solicitacaoAnaliseJuridicos, HttpStatus.OK);
=======
	public ResponseEntity<List<SolicitacaoAnaliseJuridico>> obterSolicitacaoAnaliseJuridico(){
		List<SolicitacaoAnaliseJuridico> solicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.buscarSolicitacaoAnaliseJuridicoAtivos();
		return new ResponseEntity<>(solicitacaoAnaliseJuridico, HttpStatus.OK);
>>>>>>> master
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<SolicitacaoAnaliseJuridico> obterSolicitacaoAnaliseJuridicoPorId(@PathVariable("id") Integer id){
<<<<<<< HEAD
		SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.buscaSolicitacaoAnaliseJuridicoById(id);
		return new ResponseEntity<>(solicitacaoAnaliseJuridico, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
=======
		SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico = solicitacaoAnaliseJuridicoService.buscaSolicitacaoAnaliseJuridicobyId(id);
		return new ResponseEntity<>(solicitacaoAnaliseJuridico, HttpStatus.OK);
	}
	
	@PostMapping("/inserir")
>>>>>>> master
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
<<<<<<< HEAD
	public ResponseEntity<?> apagarSolicitacaoAnaliseJuridico(@PathVariable("id") Integer id){
		solicitacaoAnaliseJuridicoService.apagarSolicitacaoAnaliseJuridico(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
=======
	public ResponseEntity<?> excluirSolicitacaoAnaliseJuridico(@PathVariable("id") Integer id){
		solicitacaoAnaliseJuridicoService.excluirSolicitacaoAnaliseJuridico(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
>>>>>>> master
