package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.StatusSolicitacaoAnaliseNotFoundException;
import br.senac.juridico.model.StatusSolicitacaoAnalise;
import br.senac.juridico.repository.StatusSolicitacaoAnaliseRepository;

@Service
public class StatusSolicitacaoAnaliseService {
	private final StatusSolicitacaoAnaliseRepository statusSolicitacaoAnaliseRepository;

	@Autowired
	public StatusSolicitacaoAnaliseService(StatusSolicitacaoAnaliseRepository statusSolicitacaoAnaliseRepository) {
		this.statusSolicitacaoAnaliseRepository = statusSolicitacaoAnaliseRepository;
	}

	public StatusSolicitacaoAnalise adicionarStatusSolicitacaoAnalise(StatusSolicitacaoAnalise statusSolicitacaoAnalise) {
		return statusSolicitacaoAnaliseRepository.save(statusSolicitacaoAnalise);
	}

	public StatusSolicitacaoAnalise atualizarStatusSolicitacaoAnalise(StatusSolicitacaoAnalise statusSolicitacaoAnalise) {
		return statusSolicitacaoAnaliseRepository.save(statusSolicitacaoAnalise);
	}

	public void apagarStatusSolicitacaoAnalise(int id) {
		statusSolicitacaoAnaliseRepository.apagarStatusSolicitacaoAnalisePorId(id);
	}

	public StatusSolicitacaoAnalise buscaStatusSolicitacaoAnalisebyId(int id) {
		return statusSolicitacaoAnaliseRepository.buscarStatusSolicitacaoAnaliseAtivasPorId(id)
			.orElseThrow(() -> new StatusSolicitacaoAnaliseNotFoundException ("StatusSolicitacaoAnalise id "+ id + "não foi encontrada!"));
	}

	public List<StatusSolicitacaoAnalise> buscarStatusSolicitacaoAnaliseAtivas(){
		return statusSolicitacaoAnaliseRepository.buscarStatusSolicitacaoAnaliseAtivas();
	}
}