package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.SolicitacaoAnaliseJuridicoNotFoundException;
import br.senac.juridico.model.SolicitacaoAnaliseJuridico;
import br.senac.juridico.repository.SolicitacaoAnaliseJuridicoRepository;

@Service
public class SolicitacaoAnaliseJuridicoService {
<<<<<<< HEAD
=======

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
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
=======
	public void excluirSolicitacaoAnaliseJuridico(int id) {
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
		solicitacaoAnaliseJuridicoRepository.apagarSolicitacaoAnaliseJuridicoPorId(id);
	}
	
	public SolicitacaoAnaliseJuridico buscaSolicitacaoAnaliseJuridicobyId(int id) {
		return solicitacaoAnaliseJuridicoRepository.buscarSolicitacaoAnaliseJuridicoAtivosPorId(id)
			.orElseThrow(() -> new SolicitacaoAnaliseJuridicoNotFoundException ("SolicitacaoAnaliseJuridico id "+ id + "não foi encontrado!"));
	}

	public List<SolicitacaoAnaliseJuridico> buscarSolicitacaoAnaliseJuridicoAtivos(){
		return solicitacaoAnaliseJuridicoRepository.buscarSolicitacaoAnaliseJuridicoAtivos();
	}
<<<<<<< HEAD

}
=======
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
