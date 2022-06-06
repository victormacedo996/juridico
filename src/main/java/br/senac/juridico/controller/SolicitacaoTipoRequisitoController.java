package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.SolicitacaoTipoRequisito;
import br.senac.juridico.service.SolicitacaoTipoRequisitoService;

@RestController
@RequestMapping("api/solicitaoTipoRequisito")
public class SolicitacaoTipoRequisitoController {
	private final SolicitacaoTipoRequisitoService solicitacaoTipoRequisitoService;

	@Autowired
	public SolicitacaoTipoRequisitoController(SolicitacaoTipoRequisitoService solicitacaoTipoRequisitoService) {
		this.solicitacaoTipoRequisitoService = solicitacaoTipoRequisitoService;
	}
	
	@GetMapping
	public ResponseEntity<List<SolicitacaoTipoRequisito>> obterEmpresas(){
		List<SolicitacaoTipoRequisito> solicitacaoesTipoRequisito = solicitacaoTipoRequisitoService.SolicitacaoTipoRequisitoAtivas();
		return new ResponseEntity<>(solicitacaoesTipoRequisito, HttpStatus.OK);
	}
	
}