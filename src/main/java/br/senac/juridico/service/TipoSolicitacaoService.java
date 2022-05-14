package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.TipoSolicitacao;
import br.senac.juridico.repository.TipoSolicitacaoRepository;

@Service
public class TipoSolicitacaoService {
	private final TipoSolicitacaoRepository tipoSolicitacaoRepository;
	
	@Autowired
	public TipoSolicitacaoService(TipoSolicitacaoRepository tipoSolicitacaoRepository) {
		this.tipoSolicitacaoRepository = tipoSolicitacaoRepository;
	}
	
	public List<TipoSolicitacao> buscarTipoSolicitacoes(){
		List<TipoSolicitacao> tipoSolicitacao = tipoSolicitacaoRepository.buscarTipoSolicitacao();
		return tipoSolicitacao;
	}
	
}
