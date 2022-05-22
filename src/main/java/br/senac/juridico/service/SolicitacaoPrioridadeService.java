package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.SolicitacaoPrioridadeNotFoundException;
import br.senac.juridico.model.SolicitacaoPrioridade;
import br.senac.juridico.repository.SolicitacaoPrioridadeRepository;

@Service
public class SolicitacaoPrioridadeService {

	private final SolicitacaoPrioridadeRepository solicitacaoPrioridadeRepository;

	@Autowired
	public SolicitacaoPrioridadeService(SolicitacaoPrioridadeRepository solicitacaoPrioridadeRepository) {
		this.solicitacaoPrioridadeRepository = solicitacaoPrioridadeRepository;
	}
	
	public SolicitacaoPrioridade adicionarSolicitacaoPrioridade(SolicitacaoPrioridade solicitacaoPrioridade) {
		return solicitacaoPrioridadeRepository.save(solicitacaoPrioridade);
	}
	
	public SolicitacaoPrioridade atualizarSolicitacaoPrioridade(SolicitacaoPrioridade solicitacaoPrioridade) {
		return solicitacaoPrioridadeRepository.save(solicitacaoPrioridade);
	}
	
	public void excluirSolicitacaoPrioridade(int id) {
		solicitacaoPrioridadeRepository.excluirSolicitacaoPrioridadePorId(id);
	}
	
	public SolicitacaoPrioridade buscaSolicitacaoPrioridadebyId(int id) {
		return solicitacaoPrioridadeRepository.buscarSolicitacaoPrioridadeAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoPrioridadeNotFoundException ("SolicitacaoPrioridade id "+ id + "não foi encontrada!"));
	}
	
	public List<SolicitacaoPrioridade> buscarSolicitacaoPrioridadeAtivas(){
		return solicitacaoPrioridadeRepository.buscarSolicitacaoPrioridadeAtivas();
	}
}
