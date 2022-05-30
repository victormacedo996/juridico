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

import br.senac.juridico.model.StatusSolicitacaoAnalise;
import br.senac.juridico.service.StatusSolicitacaoAnaliseService;

@RestController
@RequestMapping("api/statusSolicitacaoAnalise")
public class StatusSolicitacaoAnaliseController {
	private final StatusSolicitacaoAnaliseService statusSolicitacaoAnaliseService;

	@Autowired
	public StatusSolicitacaoAnaliseController(StatusSolicitacaoAnaliseService statusSolicitacaoAnaliseService) {
		this.statusSolicitacaoAnaliseService = statusSolicitacaoAnaliseService;
	}

	@GetMapping
	public ResponseEntity<List<StatusSolicitacaoAnalise>> obterStatusSolicitacaoAnalise(){
		List<StatusSolicitacaoAnalise> statusSolicitacaoAnalise = statusSolicitacaoAnaliseService.buscarStatusSolicitacaoAnaliseAtivas();
		return new ResponseEntity<>(statusSolicitacaoAnalise, HttpStatus.OK);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<StatusSolicitacaoAnalise> obterStatusSolicitacaoAnalisePorId(@PathVariable("id") Integer id){
		StatusSolicitacaoAnalise statusSolicitacaoAnalise = statusSolicitacaoAnaliseService.buscaStatusSolicitacaoAnalisebyId(id);
		return new ResponseEntity<>(statusSolicitacaoAnalise, HttpStatus.OK);
	}

	@PostMapping("/adicionar")
	public ResponseEntity<StatusSolicitacaoAnalise> adicionarStatusSolicitacaoAnalise(@RequestBody StatusSolicitacaoAnalise statusSolicitacaoAnalise){
		StatusSolicitacaoAnalise novaStatusSolicitacaoAnalise = statusSolicitacaoAnaliseService.adicionarStatusSolicitacaoAnalise(statusSolicitacaoAnalise);
		return new ResponseEntity<>(novaStatusSolicitacaoAnalise, HttpStatus.CREATED);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<StatusSolicitacaoAnalise> atualizarStatusSolicitacaoAnalise(@RequestBody StatusSolicitacaoAnalise statusSolicitacaoAnalise){		
		StatusSolicitacaoAnalise atualizarStatusSolicitacaoAnalise = statusSolicitacaoAnaliseService.atualizarStatusSolicitacaoAnalise(statusSolicitacaoAnalise);
		return new ResponseEntity<>(atualizarStatusSolicitacaoAnalise, HttpStatus.OK);
	}

	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarStatusSolicitacaoAnalise(@PathVariable("id") Integer id){
		statusSolicitacaoAnaliseService.apagarStatusSolicitacaoAnalise(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}