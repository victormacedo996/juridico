package br.senac.juridico.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.RequisitoTemplate;
import br.senac.juridico.model.TipoSolicitacao;
import br.senac.juridico.repository.AnaliseJuridicoRepository;
import br.senac.juridico.repository.RequisitoTemplateRepository;
import br.senac.juridico.repository.TipoSolicitacaoRepository;

@Service
public class AnaliseJuridicoService {
	private final AnaliseJuridicoRepository analiseJuridicoRepository; 
	private final TipoSolicitacaoRepository tipoSolicitacaoRepository;
	private final RequisitoTemplateRepository requisitoTemplateRepository;
	
	@Autowired
	public AnaliseJuridicoService
	(
			AnaliseJuridicoRepository analiseJuridicoRepository,
			TipoSolicitacaoRepository tipoSolicitacaoRepository,
			RequisitoTemplateRepository requisitoTemplateRepository
	) 
	{
		this.analiseJuridicoRepository = analiseJuridicoRepository;
		this.tipoSolicitacaoRepository = tipoSolicitacaoRepository;
		this.requisitoTemplateRepository = requisitoTemplateRepository;
	}

	public AnaliseJuridico salvarAnalise(AnaliseJuridico analiseJuridico) {
		return analiseJuridicoRepository.save(analiseJuridico);
	}

	public List<AnaliseJuridico> listarAnalises() {
		return analiseJuridicoRepository.listarTodosRegistros();
	}
}
