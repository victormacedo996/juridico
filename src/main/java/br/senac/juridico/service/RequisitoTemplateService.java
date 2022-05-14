package br.senac.juridico.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.senac.juridico.model.RequisitoTemplate;
import br.senac.juridico.repository.RequisitoTemplateRepository;

@Service
public class RequisitoTemplateService {
	private final RequisitoTemplateRepository requisitoTemplateRepository;
	
	RequisitoTemplateService(RequisitoTemplateRepository requisitoTemplateRepository){
		this.requisitoTemplateRepository = requisitoTemplateRepository;
	}
	
	public List<RequisitoTemplate> buscarRequisitos(){
		List<RequisitoTemplate> requisitoTemplate = requisitoTemplateRepository.buscarRequisitoTemplates();
		return requisitoTemplate;
	}
}
