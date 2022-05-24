package br.senac.juridico.service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.AtendimentoRegistro;
import br.senac.juridico.repository.AtendimentoRegistroRepository;

@Service
public class AtendimentoRegistroService {
	
	private final AtendimentoRegistroRepository registroRepository;

	@Autowired
	public AtendimentoRegistroService (AtendimentoRegistroRepository registroRepository) {
		this.registroRepository = registroRepository;
	}
	
	public List<AtendimentoRegistro> listarTodosRegistrosAtivos(){

		return registroRepository.listarTodosRegistrosAtivos();
	}
	
	public AtendimentoRegistro buscarAtendimentoRegistroPorID(int id) {
		return registroRepository.buscarRegistroPorID(id)
				.orElseThrow(() -> new ObjectNotFoundException(id, "Registro não encontrado"));
		
	}
	

	public AtendimentoRegistro adicionarRegistro(AtendimentoRegistro registro) {
		return registroRepository.save(registro);
	}

	public AtendimentoRegistro alterar(AtendimentoRegistro registroAtend) {
		AtendimentoRegistro registro = buscarAtendimentoRegistroPorID(registroAtend.getId());
		registro.setObservacao(registroAtend.getObservacao());
		registro.setDataRegistro(registroAtend.getDataRegistro());
		registro.setStatus(1);
		registro.setAtendimentoAnaliseJuridico(registroAtend.getAtendimentoAnaliseJuridico());
		registro.setUsuario(registroAtend.getUsuario());
		return adicionarRegistro(registro);
	}

	public void excluirAtendimentoRegistro(int id) {
		registroRepository.excluirAtendimentoRegistroPorID(id);
	}

}