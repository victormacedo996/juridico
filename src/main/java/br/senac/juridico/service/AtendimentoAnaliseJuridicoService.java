package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.AtendimentoAnaliseJuridicoNotFoundException;
import br.senac.juridico.model.AtendimentoAnaliseJuridico;
import br.senac.juridico.repository.AtendimentoAnaliseJuridicoRepository;

@Service
public class AtendimentoAnaliseJuridicoService {

	private final AtendimentoAnaliseJuridicoRepository atendimentoAnaliseJuridicoRepository;

	@Autowired
	public AtendimentoAnaliseJuridicoService(AtendimentoAnaliseJuridicoRepository atendimentoAnaliseJuridicoRepository) {
		this.atendimentoAnaliseJuridicoRepository = atendimentoAnaliseJuridicoRepository;
	}
	
	public AtendimentoAnaliseJuridico adicionarAtendimentoAnaliseJuridico(AtendimentoAnaliseJuridico atendimentoAnaliseJuridico) {
		return atendimentoAnaliseJuridicoRepository.save(atendimentoAnaliseJuridico);
	}
	
	public AtendimentoAnaliseJuridico atualizarAtendimentoAnaliseJuridico(AtendimentoAnaliseJuridico atendimentoAnaliseJuridico) {
		return atendimentoAnaliseJuridicoRepository.save(atendimentoAnaliseJuridico);
	}
	
	public void apagarAtendimentoAnaliseJuridico(int id) {
		atendimentoAnaliseJuridicoRepository.apagarAtendimentoAnaliseJuridicoPorId(id);
	}
	
	public AtendimentoAnaliseJuridico buscaAtendimentoAnaliseJuridicobyId(int id) {
		return atendimentoAnaliseJuridicoRepository.buscarAtendimentoAnaliseJuridicoAtivosPorId(id)
			.orElseThrow(() -> new AtendimentoAnaliseJuridicoNotFoundException ("AtendimentoAnaliseJuridico id "+ id + "não foi encontrado!"));
	}

	public List<AtendimentoAnaliseJuridico> buscarAtendimentoAnaliseJuridicoAtivos(){
		return atendimentoAnaliseJuridicoRepository.buscarAtendimentoAnaliseJuridicoAtivos();
	}
}
