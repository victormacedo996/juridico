package br.senac.juridico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.repository.AnaliseJuridicoRepository;

@Service
public class AnaliseJuridicoService {
	private final AnaliseJuridicoRepository analiseJuridicoRepository; 
	
	@Autowired
	public AnaliseJuridicoService(AnaliseJuridicoRepository analiseJuridicoRepository) {
		this.analiseJuridicoRepository = analiseJuridicoRepository;
	}
	
	public AnaliseJuridico salvarAnalise(AnaliseJuridico analiseJuridico) {
		return analiseJuridicoRepository.save(analiseJuridico);
	}
}
