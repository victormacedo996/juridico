package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.SolicitacaoPrioridadeNotFoundException;
import br.senac.juridico.model.SolicitacaoPrioridade;
import br.senac.juridico.repository.SolicitacaoPrioridadeRepository;

@Service
public class SolicitacaoPrioridadeService {
<<<<<<< HEAD
=======

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
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
	
<<<<<<< HEAD
	public void apagarSolicitacaoPrioridade(int id) {
		solicitacaoPrioridadeRepository.apagarSolicitacaoPrioridadePorId(id);
=======
	public void excluirSolicitacaoPrioridade(int id) {
		solicitacaoPrioridadeRepository.excluirSolicitacaoPrioridadePorId(id);
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	}
	
	public SolicitacaoPrioridade buscaSolicitacaoPrioridadebyId(int id) {
		return solicitacaoPrioridadeRepository.buscarSolicitacaoPrioridadeAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoPrioridadeNotFoundException ("SolicitacaoPrioridade id "+ id + "não foi encontrada!"));
	}
	
	public List<SolicitacaoPrioridade> buscarSolicitacaoPrioridadeAtivas(){
		return solicitacaoPrioridadeRepository.buscarSolicitacaoPrioridadeAtivas();
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
