package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import br.senac.juridico.model.SolicitacaoAnaliseJuridico;
import br.senac.juridico.exception.*;
=======
import br.senac.juridico.exception.SolicitacaoAnaliseJuridicoNotFoundException;
import br.senac.juridico.model.SolicitacaoAnaliseJuridico;
>>>>>>> master
import br.senac.juridico.repository.SolicitacaoAnaliseJuridicoRepository;

@Service
public class SolicitacaoAnaliseJuridicoService {
<<<<<<< HEAD
=======

>>>>>>> master
	private final SolicitacaoAnaliseJuridicoRepository solicitacaoAnaliseJuridicoRepository;

	@Autowired
	public SolicitacaoAnaliseJuridicoService(SolicitacaoAnaliseJuridicoRepository solicitacaoAnaliseJuridicoRepository) {
		this.solicitacaoAnaliseJuridicoRepository = solicitacaoAnaliseJuridicoRepository;
	}
	
	public SolicitacaoAnaliseJuridico adicionarSolicitacaoAnaliseJuridico(SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico) {
		return solicitacaoAnaliseJuridicoRepository.save(solicitacaoAnaliseJuridico);
	}
	
	public SolicitacaoAnaliseJuridico atualizarSolicitacaoAnaliseJuridico(SolicitacaoAnaliseJuridico solicitacaoAnaliseJuridico) {
		return solicitacaoAnaliseJuridicoRepository.save(solicitacaoAnaliseJuridico);
	}
	
<<<<<<< HEAD
	public void apagarSolicitacaoAnaliseJuridico(int id) {
		solicitacaoAnaliseJuridicoRepository.apagarSolicitacaoAnaliseJuridicoPorId(id);
	}
	
	public SolicitacaoAnaliseJuridico buscaSolicitacaoAnaliseJuridicoById(int id) {
		return solicitacaoAnaliseJuridicoRepository.buscarSolicitacaoAnaliseJuridicoAtivasPorId(id)
			.orElseThrow(() -> new SolicitacaoAnaliseJuridicoNotFoundException ("SolicitacaoAnaliseJuridico id "+ id + "não foi encontrada!"));
	}
	
	public List<SolicitacaoAnaliseJuridico> buscaSolicitacaoAnaliseJuridicoAtivas(){
		return solicitacaoAnaliseJuridicoRepository.buscarSolicitacaoAnaliseJuridicoAtivas();
	}
}
=======
	public void excluirSolicitacaoAnaliseJuridico(int id) {
		solicitacaoAnaliseJuridicoRepository.apagarSolicitacaoAnaliseJuridicoPorId(id);
	}
	
	public SolicitacaoAnaliseJuridico buscaSolicitacaoAnaliseJuridicobyId(int id) {
		return solicitacaoAnaliseJuridicoRepository.buscarSolicitacaoAnaliseJuridicoAtivosPorId(id)
			.orElseThrow(() -> new SolicitacaoAnaliseJuridicoNotFoundException ("SolicitacaoAnaliseJuridico id "+ id + "não foi encontrado!"));
	}

	public List<SolicitacaoAnaliseJuridico> buscarSolicitacaoAnaliseJuridicoAtivos(){
		return solicitacaoAnaliseJuridicoRepository.buscarSolicitacaoAnaliseJuridicoAtivos();
	}
}
>>>>>>> master
