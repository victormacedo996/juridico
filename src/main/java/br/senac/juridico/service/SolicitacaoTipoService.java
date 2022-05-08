package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.SolicitacaoTipo;
import br.senac.juridico.exception.*;
import br.senac.juridico.repository.SolicitacaoTipoRepository;

@Service
public class SolicitacaoTipoService {
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
	
	public void apagarSolicitacaoTipo(int id) {
		solicitacaoTipoRepository.apagarSolicitacaoTipoPorId(id);
	}
	
	public SolicitacaoTipo buscarSolicitacaoTipobyId(int id) {
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoTipoNotFoundException ("SolicitacaoTipo id "+ id + "não foi encontrada!"));
	}
	
	public List<SolicitacaoTipo> buscarSolicitacaoTiposAtivas(){
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivas();
	}
}
