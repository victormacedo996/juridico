package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.RequisitoTemplate;
import br.senac.juridico.model.TipoSolicitacao;
import br.senac.juridico.service.RequisitoTemplateService;

@RestController
@RequestMapping("api/requisitoTemplate")
public class RequisitoTemplateController {
	private final RequisitoTemplateService requisitoTemplateService;
	
	@Autowired
	RequisitoTemplateController(RequisitoTemplateService requisitoTemplateService){
		this.requisitoTemplateService = requisitoTemplateService;
	}
	@GetMapping()
	public ResponseEntity<List<RequisitoTemplate>> buscarRequisitoTemplates(){
		List<RequisitoTemplate> requisitoTemplate = requisitoTemplateService.buscarRequisitos();
		return new ResponseEntity<>(requisitoTemplate, HttpStatus.OK);
	}
	
}
