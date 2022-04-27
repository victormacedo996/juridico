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

import br.senac.juridico.model.Empresa;
import br.senac.juridico.service.EmpresaService;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {
	private final EmpresaService empresaService;

	@Autowired
	public EmpresaController(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
	
	@GetMapping
	public ResponseEntity<List<Empresa>> obterEmpresas(){
		List<Empresa> empresas = empresaService.buscarEmpresasAtivas();
		return new ResponseEntity<>(empresas, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Empresa> obterEmpresaPorId(@PathVariable("id") Integer id){
		Empresa empresa = empresaService.buscaEmpresabyId(id);
		return new ResponseEntity<>(empresa, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Empresa> adicionarEmpresa(@RequestBody Empresa empresa){
		Empresa novaEmpresa = empresaService.adicionarEmpresa(empresa);
		return new ResponseEntity<>(novaEmpresa, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Empresa> atualizarEmpresa(@RequestBody Empresa empresa){		
		Empresa atualizarEmpresa = empresaService.atualizarEmpresa(empresa);
		return new ResponseEntity<>(atualizarEmpresa, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarEmpresa(@PathVariable("id") Integer id){
		empresaService.apagarEmpresa(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
