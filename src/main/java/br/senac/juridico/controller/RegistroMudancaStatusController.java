package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.RegistroMudancaStatus;
import br.senac.juridico.service.RegistroMudancaStatusService;

@RestController
@RequestMapping("api/registroMudancaStatus")
public class RegistroMudancaStatusController {
	private final RegistroMudancaStatusService registroMudancaStatusService;

	@Autowired
	public RegistroMudancaStatusController(RegistroMudancaStatusService registroMudancaStatusService) {
		this.registroMudancaStatusService = registroMudancaStatusService;
	}
	
	@GetMapping
	public ResponseEntity<List<RegistroMudancaStatus>> obterRegistroMudancaStatus(){
		List<RegistroMudancaStatus> registroMudancaStatus = registroMudancaStatusService.buscarRegistroMudancaStatus();
		return new ResponseEntity<>(registroMudancaStatus, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<RegistroMudancaStatus> obterRegistroMudancaStatusPorId(@PathVariable("id") Integer id){
		RegistroMudancaStatus registroMudancaStatus = registroMudancaStatusService.buscaRegistroMudancaStatusbyId(id);
		return new ResponseEntity<>(registroMudancaStatus, HttpStatus.OK);
	}
	

}
