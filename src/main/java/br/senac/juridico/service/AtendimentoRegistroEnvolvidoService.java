package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.AtendimentoRegistroEnvolvidoNotFoundException;
import br.senac.juridico.model.AtendimentoRegistroEnvolvido;
import br.senac.juridico.repository.AtendimentoRegistroEnvolvidoRepository;

@Service
public class AtendimentoRegistroEnvolvidoService {

	private final AtendimentoRegistroEnvolvidoRepository atendimentoRegistroEnvolvidoRepository;
	
	@Autowired
	public AtendimentoRegistroEnvolvidoService (AtendimentoRegistroEnvolvidoRepository atendimentoRegistroEnvolvidoRepository) {
		this.atendimentoRegistroEnvolvidoRepository = atendimentoRegistroEnvolvidoRepository;
	}
	
	public List<AtendimentoRegistroEnvolvido> listarTodosRegistrosEnvolvidosAtivos(){
		return atendimentoRegistroEnvolvidoRepository.listarTodosRegistrosEnvolvidoAtivos();
	}
	
	public AtendimentoRegistroEnvolvido buscarRegistroEnvolvidoPorId(int id) {
		return atendimentoRegistroEnvolvidoRepository.buscarAtendimentoRegistroEnvolvidoPorID().orElseThrow(() -> new AtendimentoRegistroEnvolvidoNotFoundException ("Atendimento Registro Envolvido id" + id +" nã foi encontrado!o"));
	}
	
	public AtendimentoRegistroEnvolvido adicionarRegistroEnvolvido(AtendimentoRegistroEnvolvido atendimentoRegistroEnvolvido) {
		return atendimentoRegistroEnvolvidoRepository.save(atendimentoRegistroEnvolvido);
	}
	
	public AtendimentoRegistroEnvolvido alterarRegistroEnvolvido(AtendimentoRegistroEnvolvido registroEnvolvido) {
		AtendimentoRegistroEnvolvido envolvido = buscarRegistroEnvolvidoPorId(registroEnvolvido.getId());
		envolvido.setNome(registroEnvolvido.getNome());
		envolvido.setEmail(registroEnvolvido.getEmail());
		envolvido.setStatus(registroEnvolvido.getStatus());
		return adicionarRegistroEnvolvido(envolvido);	
	}
	
	public void excluirAtendimentoRegistroEnvolvido(int id) {
		atendimentoRegistroEnvolvidoRepository.excluirAtendimentoRegistroEnvolvidoPorID(id);
	}
}
