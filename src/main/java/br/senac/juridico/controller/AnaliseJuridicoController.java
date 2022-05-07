package br.senac.juridico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.service.AnaliseJuridicoService;

@RestController
@RequestMapping("api/analiseJuridico")
public class AnaliseJuridicoController {
	
	private final AnaliseJuridicoService analiseJuridicoService;
	
	@Autowired
	public AnaliseJuridicoController(AnaliseJuridicoService analiseJuridicoService) {
		this.analiseJuridicoService = analiseJuridicoService;
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<AnaliseJuridico> adicionarAnaliseJuridico(@RequestBody AnaliseJuridico analise){
		AnaliseJuridico analiseJuridico = analiseJuridicoService.adicionarAnaliseJuridico(analise);
		return new ResponseEntity<>(analiseJuridico, HttpStatus.CREATED);
	}
}
