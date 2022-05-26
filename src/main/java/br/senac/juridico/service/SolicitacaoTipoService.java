package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import br.senac.juridico.model.SolicitacaoTipo;
import br.senac.juridico.exception.*;
=======
import br.senac.juridico.exception.SolicitacaoTipoNotFoundException;
import br.senac.juridico.model.SolicitacaoTipo;
>>>>>>> master
import br.senac.juridico.repository.SolicitacaoTipoRepository;

@Service
public class SolicitacaoTipoService {
<<<<<<< HEAD
=======

>>>>>>> master
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
		solicitacaoTipoRepository.apagarSolicitacaoTipoPorId(id);
	}
	
	public SolicitacaoTipo buscarSolicitacaoTipobyId(int id) {
=======
	public void excluirSolicitacaoTipo(int id) {
		solicitacaoTipoRepository.apagarSolicitacaoTipoPorId(id);
	}
	
	public SolicitacaoTipo buscaSolicitacaoTipobyId(int id) {
>>>>>>> master
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoTipoNotFoundException ("SolicitacaoTipo id "+ id + "não foi encontrada!"));
	}
	
<<<<<<< HEAD
	public List<SolicitacaoTipo> buscarSolicitacaoTiposAtivas(){
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivas();
	}
}
=======
	public List<SolicitacaoTipo> buscarSolicitacaoTipoAtivas(){
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivas();
	}
}
>>>>>>> master
