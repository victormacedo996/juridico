package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller;
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
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
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629

import br.senac.juridico.model.SolicitacaoPrioridade;
import br.senac.juridico.service.SolicitacaoPrioridadeService;

<<<<<<< HEAD
@RestController
@RequestMapping("api/solicitacaoPrioridade")
public class SolicitacaoPrioridadeController {
=======
@Controller
@RequestMapping("api/solicitacaoPrioridade")
public class SolicitacaoPrioridadeController {

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	private final SolicitacaoPrioridadeService solicitacaoPrioridadeService;

	@Autowired
	public SolicitacaoPrioridadeController(SolicitacaoPrioridadeService solicitacaoPrioridadeService) {
		this.solicitacaoPrioridadeService = solicitacaoPrioridadeService;
	}
	
	@GetMapping
	public ResponseEntity<List<SolicitacaoPrioridade>> obterSolicitacaoPrioridade(){
		List<SolicitacaoPrioridade> solicitacaoPrioridade = solicitacaoPrioridadeService.buscarSolicitacaoPrioridadeAtivas();
		return new ResponseEntity<>(solicitacaoPrioridade, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<SolicitacaoPrioridade> obterSolicitacaoPrioridadePorId(@PathVariable("id") Integer id){
		SolicitacaoPrioridade solicitacaoPrioridade = solicitacaoPrioridadeService.buscaSolicitacaoPrioridadebyId(id);
		return new ResponseEntity<>(solicitacaoPrioridade, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<SolicitacaoPrioridade> adicionarSolicitacaoPrioridade(@RequestBody SolicitacaoPrioridade solicitacaoPrioridade){
		SolicitacaoPrioridade novaSolicitacaoPrioridade = solicitacaoPrioridadeService.adicionarSolicitacaoPrioridade(solicitacaoPrioridade);
		return new ResponseEntity<>(novaSolicitacaoPrioridade, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<SolicitacaoPrioridade> atualizarSolicitacaoPrioridade(@RequestBody SolicitacaoPrioridade solicitacaoPrioridade){		
		SolicitacaoPrioridade atualizarSolicitacaoPrioridade = solicitacaoPrioridadeService.atualizarSolicitacaoPrioridade(solicitacaoPrioridade);
		return new ResponseEntity<>(atualizarSolicitacaoPrioridade, HttpStatus.OK);
	}
	
<<<<<<< HEAD
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarSolicitacaoPrioridade(@PathVariable("id") Integer id){
		solicitacaoPrioridadeService.apagarSolicitacaoPrioridade(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
=======
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> excluirSolicitacaoPrioridade(@PathVariable("id") Integer id){
		solicitacaoPrioridadeService.excluirSolicitacaoPrioridade(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
