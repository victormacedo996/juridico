package br.senac.juridico.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.TipoSolicitacao;
import br.senac.juridico.model.modelToView.ParametrosRequisicao;
import br.senac.juridico.repository.AnaliseJuridicoRepository;
import br.senac.juridico.repository.TipoSolicitacaoRepository;

@Service
public class AnaliseJuridicoService {
	private final AnaliseJuridicoRepository analiseJuridicoRepository; 
	private final TipoSolicitacaoRepository tipoSolicitacaoRepository;
	
	@Autowired
	public AnaliseJuridicoService(AnaliseJuridicoRepository analiseJuridicoRepository,
			TipoSolicitacaoRepository tipoSolicitacaoRepository) {
		this.analiseJuridicoRepository = analiseJuridicoRepository;
		this.tipoSolicitacaoRepository = tipoSolicitacaoRepository;
	}
	
	public AnaliseJuridico salvarAnalise(AnaliseJuridico analiseJuridico) {
		return analiseJuridicoRepository.save(analiseJuridico);
	}
	//Serviço responsavel por coletar todos os objetos necessários
	//para carregar o front end de registro de solicitacao
	public ParametrosRequisicao buscarParametros() { 
		List<TipoSolicitacao> tipo = tipoSolicitacaoRepository.buscarTipoSolicitacao();
		ParametrosRequisicao parametros = new ParametrosRequisicao();
		parametros.setTipoSolicitacao(tipo);
		return parametros;
	}
}
