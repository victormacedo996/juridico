package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.SolicitacaoTipoNotFoundException;
import br.senac.juridico.model.SolicitacaoTipo;
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
	
	public void excluirSolicitacaoTipo(int id) {
		solicitacaoTipoRepository.apagarSolicitacaoTipoPorId(id);
	}
	
	public SolicitacaoTipo buscaSolicitacaoTipobyId(int id) {
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoTipoNotFoundException ("SolicitacaoTipo id "+ id + "não foi encontrada!"));
	}
	
	public List<SolicitacaoTipo> buscarSolicitacaoTipoAtivas(){
		return solicitacaoTipoRepository.buscarSolicitacaoTipoAtivas();
	}
}
