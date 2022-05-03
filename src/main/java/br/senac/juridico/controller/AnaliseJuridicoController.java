package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.Empresa;
import br.senac.juridico.service.AnaliseJuridicoService;
import br.senac.juridico.service.EmpresaService;

@RestController
@RequestMapping("api/analiseJuridico")
public class AnaliseJuridicoController {
	private final AnaliseJuridicoService analiseJuridicoService;
	
	@Autowired
	public AnaliseJuridicoController(AnaliseJuridicoService analiseJuridico) {
		this.analiseJuridicoService = analiseJuridico;
	}
	
	@GetMapping
	public ResponseEntity<List<AnaliseJuridico>> obterAnalises(){
		List<AnaliseJuridico> analises = analiseJuridicoService.buscarAnalisesJuridicasAtivasAtivas();
		return new ResponseEntity<>(analises, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<AnaliseJuridico> obterAnalisePorId(@PathVariable("id") Integer id){
		AnaliseJuridico analise = analiseJuridicoService.buscaAnaliseJuridicobyId(id);
		return new ResponseEntity<>(analise, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<AnaliseJuridico> adicionarAnalise(@RequestBody AnaliseJuridico analise){
		AnaliseJuridico novaAnalise = analiseJuridicoService.adicionarAnaliseJuridico(analise);
		return new ResponseEntity<>(novaAnalise, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<AnaliseJuridico> atualizarAnalise(@RequestBody AnaliseJuridico analise){		
		AnaliseJuridico novaAnalise = analiseJuridicoService.atualizarAnaliseJuridico(analise);
		return new ResponseEntity<>(novaAnalise, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarAnalise(@PathVariable("id") Integer id){
		analiseJuridicoService.apagarAnaliseJuridico(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
