package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.SolicitacaoTipoRequisito;
import br.senac.juridico.repository.SolicitacaoTipoRequisitoRepository;

@Service
public class SolicitacaoTipoRequisitoService {
	private final SolicitacaoTipoRequisitoRepository solicitacaoTipoRequisitoRepository;
	
	@Autowired
	public SolicitacaoTipoRequisitoService(SolicitacaoTipoRequisitoRepository solicitacaoTipoRequisitoRepository) {
		this.solicitacaoTipoRequisitoRepository = solicitacaoTipoRequisitoRepository;
	}
	
	public SolicitacaoTipoRequisito adicionarSolicitacaoTipoRequisito(SolicitacaoTipoRequisito solicitacaoTipoRequisito) {
		return solicitacaoTipoRequisitoRepository.save(solicitacaoTipoRequisito);
	}
	
	public SolicitacaoTipoRequisito atualizarSolicitacaoTipoRequisito(SolicitacaoTipoRequisito solicitacaoTipoRequisito) {
		return solicitacaoTipoRequisitoRepository.save(solicitacaoTipoRequisito);
	}
	
	public List<SolicitacaoTipoRequisito> SolicitacaoTipoRequisitoAtivas(){
		return solicitacaoTipoRequisitoRepository.buscarSolicitacaoTipoRequisito();
	}
}
