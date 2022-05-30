package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.RegistroMudancaStatusNotFoundException;
import br.senac.juridico.model.RegistroMudancaStatus;
import br.senac.juridico.repository.RegistroMudancaStatusRepository;

@Service
public class RegistroMudancaStatusService {
	private final RegistroMudancaStatusRepository registroMudancaStatusRepository;

	@Autowired
	public RegistroMudancaStatusService(RegistroMudancaStatusRepository registroMudancaStatusRepository) {
		this.registroMudancaStatusRepository = registroMudancaStatusRepository;
	}

	public RegistroMudancaStatus buscaRegistroMudancaStatusbyId(int id) {
		return registroMudancaStatusRepository.buscarRegistroMudancaStatusPorId(id)
			.orElseThrow(() -> new RegistroMudancaStatusNotFoundException ("RegistroMudancaStatus id "+ id + "não foi encontrado!"));
	}

	public List<RegistroMudancaStatus> buscarRegistroMudancaStatus(){
		return registroMudancaStatusRepository.buscarRegistroMudancaStatus();
	}
}