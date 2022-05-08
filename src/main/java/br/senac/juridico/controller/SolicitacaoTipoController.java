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

import br.senac.juridico.model.SolicitacaoTipo;
import br.senac.juridico.service.SolicitacaoTipoService;

@RestController
@RequestMapping("api/SolicitacaoTipo")
public class SolicitacaoTipoController {
	private final SolicitacaoTipoService solicitacaoTipoService;

	@Autowired
	public SolicitacaoTipoController(SolicitacaoTipoService solicitacaoTipoService) {
		this.solicitacaoTipoService = solicitacaoTipoService;
	}
	
	@GetMapping
	public ResponseEntity<List<SolicitacaoTipo>> obterSolicitacaoTipos(){
		List<SolicitacaoTipo> solicitacaoTipos = solicitacaoTipoService.buscarSolicitacaoTiposAtivas();
		return new ResponseEntity<>(solicitacaoTipos, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<SolicitacaoTipo> obterSolicitacaoTipoPorId(@PathVariable("id") Integer id){
		SolicitacaoTipo solicitacaoTipo = solicitacaoTipoService.buscarSolicitacaoTipobyId(id);
		return new ResponseEntity<>(solicitacaoTipo, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<SolicitacaoTipo> adicionarSolicitacaoTipo(@RequestBody SolicitacaoTipo solicitacaoTipo){
		SolicitacaoTipo novaSolicitacaoTipo = solicitacaoTipoService.adicionarSolicitacaoTipo(solicitacaoTipo);
		return new ResponseEntity<>(novaSolicitacaoTipo, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<SolicitacaoTipo> atualizarSolicitacaoTipo(@RequestBody SolicitacaoTipo solicitacaoTipo){		
		SolicitacaoTipo atualizarSolicitacaoTipo = solicitacaoTipoService.atualizarSolicitacaoTipo(solicitacaoTipo);
		return new ResponseEntity<>(atualizarSolicitacaoTipo, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarSolicitacaoTipo(@PathVariable("id") Integer id){
		solicitacaoTipoService.apagarSolicitacaoTipo(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
