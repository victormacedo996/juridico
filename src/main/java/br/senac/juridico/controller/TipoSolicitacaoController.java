package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.TipoSolicitacao;
import br.senac.juridico.service.TipoSolicitacaoService;

@RestController
@RequestMapping("api/tipoSolicitacao")
public class TipoSolicitacaoController {
	private final TipoSolicitacaoService tipoSolicitacaoService;
	
	@Autowired
	TipoSolicitacaoController(TipoSolicitacaoService tipoSolicitacaoService){
		this.tipoSolicitacaoService = tipoSolicitacaoService;
	}
	@GetMapping()
	public ResponseEntity<List<TipoSolicitacao>> buscarTipoSolicitacoes(){
		List<TipoSolicitacao> tipoSolicitacao = tipoSolicitacaoService.buscarTipoSolicitacoes();
		return new ResponseEntity<>(tipoSolicitacao, HttpStatus.OK);
	}
}
