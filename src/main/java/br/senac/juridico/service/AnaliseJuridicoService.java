package br.senac.juridico.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.TipoSolicitacao;
import br.senac.juridico.model.modelToView.ParametrosRequisicao;
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
	//Serviço responsavel por coletar todos os objetos necessários
	//para carregar o front end de registro de solicitacao
	public ParametrosRequisicao buscarParametros() { 
		List<TipoSolicitacao> tipo = analiseJuridicoRepository.buscarTipoSolicitacao();
		ParametrosRequisicao parametros = new ParametrosRequisicao();
		parametros.setTipoSolicitacao(tipo);
		return parametros;
	}
}
