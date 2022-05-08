package br.senac.juridico.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import br.senac.juridico.model.AtendimentoRegistro;
import br.senac.juridico.repository.AtendimentoRegistroRepository;

public class AtendimentoRegistroService {

	@Autowired
	private AtendimentoRegistroRepository registroRepository;
<<<<<<< HEAD
	
	
	
	public List<AtendimentoRegistro> listarTodosRegistros(){
		
		return registroRepository.findAll();
	}
	
=======


	public List<AtendimentoRegistro> listarTodosRegistros(){

		return registroRepository.findAll();
	}

>>>>>>> temp
	public AtendimentoRegistro buscarRegistroPorID(Integer id) {
		Optional<AtendimentoRegistro> registro = registroRepository.buscarRegistroPorID();
		return registro.orElseThrow(() -> new ObjectNotFoundException(id, "Registro não encontrado"));
	}
<<<<<<< HEAD
	
	public AtendimentoRegistro adicionarRegistro(AtendimentoRegistro registro) {
		return registroRepository.save(registro);
	}
	
=======

	public AtendimentoRegistro adicionarRegistro(AtendimentoRegistro registro) {
		return registroRepository.save(registro);
	}

>>>>>>> temp
	public AtendimentoRegistro alterar(AtendimentoRegistro registroAtend) {
		AtendimentoRegistro  registro = buscarRegistroPorID(registroAtend.getId());
		registro.setObservacao(registroAtend.getObservacao());
		registro.setDataRegistro(registroAtend.getDataRegistro());
		registro.setStatus(1);
		return adicionarRegistro(registro);
	}
<<<<<<< HEAD
	
	public void excluirRegistro(Integer id) {
		registroRepository.deleteById(id);
	}
	
}
=======

	public void excluirRegistro(Integer id) {
		registroRepository.deleteById(id);
	}

}
>>>>>>> temp
