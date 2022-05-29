package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.SolicitacaoTipoNotFoundException;
import br.senac.juridico.model.SolicitacaoTipo;
import br.senac.juridico.repository.SolicitacaoTipoRepository;

@Service
public class SolicitacaoTipoService {
<<<<<<< HEAD
=======

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	private final SolicitacaoTipoRepository solicitacaoTipoRepository;

	@Autowired
	public SolicitacaoTipoService(SolicitacaoTipoRepository solicitacaoTipoRepository) {
		this.solicitacaoTipoRepository = solicitacaoTipoRepository;
	}
	
	public SolicitacaoTipo adicionarSolicitacaoTipo(SolicitacaoTipo solicitacaoTipo) {
		return solicitacaoTipoRepository.save(solicitacaoTipo);
	}
	
	public SolicitacaoTipo atualizarSolicitacaoTipo(SolicitacaoTipo solicitacaoTipo) {
		return solicitacaoTipoRepository.save(solicitacaoTipo);
	}
	
<<<<<<< HEAD
	public void apagarSolicitacaoTipo(int id) {
=======
	public void excluirSolicitacaoTipo(int id) {
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
		solicitacaoTipoRepository.apagarSolicitacaoTipoPorId(id);
	}
	
	public SolicitacaoTipo buscaSolicitacaoTipobyId(int id) {
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoTipoNotFoundException ("SolicitacaoTipo id "+ id + "não foi encontrada!"));
	}
	
	public List<SolicitacaoTipo> buscarSolicitacaoTipoAtivas(){
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivas();
	}
<<<<<<< HEAD
	
}
=======
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
