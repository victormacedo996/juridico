package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.SolicitacaoAlocacao;
import br.senac.juridico.exception.*;
import br.senac.juridico.repository.SolicitacaoAlocacaoRepository;

@Service
public class SolicitacaoAlocacaoService {
	private final SolicitacaoAlocacaoRepository solicitacaoAlocacaoRepository;

	@Autowired
	public SolicitacaoAlocacaoService(SolicitacaoAlocacaoRepository solicitacaoAlocacaoRepository) {
		this.solicitacaoAlocacaoRepository = solicitacaoAlocacaoRepository;
	}

	public SolicitacaoAlocacao adicionarSolicitacaoAlocacao(SolicitacaoAlocacao solicitacaoAlocacao) {
		return solicitacaoAlocacaoRepository.save(solicitacaoAlocacao);
	}

	public SolicitacaoAlocacao atualizarSolicitacaoAlocacao(SolicitacaoAlocacao solicitacaoAlocacao) {
		return solicitacaoAlocacaoRepository.save(solicitacaoAlocacao);
	}

	public void apagarSolicitacaoAlocacao(int id) {
		solicitacaoAlocacaoRepository.apagarSolicitacaoAlocacaoPorId(id);
	}

	public SolicitacaoAlocacao buscaSolicitacaoAlocacaoById(int id) {
		return solicitacaoAlocacaoRepository.buscarSolicitacaoAlocacaoAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoAlocacaoNotFoundException ("SolicitacaoAlocacao id "+ id + "não foi encontrada!"));
	}

	public List<SolicitacaoAlocacao> buscaSolicitacaoAlocacaoAtivas(){
		return solicitacaoAlocacaoRepository.buscarSolicitacaoAlocacaoAtivas();
	}
}