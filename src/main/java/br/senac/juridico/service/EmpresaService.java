package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.model.Empresa;
import br.senac.juridico.exception.*;
import br.senac.juridico.repository.EmpresaRepository;

@Service
public class EmpresaService {
	private final EmpresaRepository empresaRepository;

	@Autowired
	public EmpresaService(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}
	
	public Empresa adicionarEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	public Empresa atualizarEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	public void apagarEmpresa(int id) {
		empresaRepository.apagarEmpresaPorId(id);
	}
	
	public Empresa buscaEmpresabyId(int id) {
		return empresaRepository.buscarEmpresaAtivasPorId(id)
			.orElseThrow(() -> new EmpresaNotFoundException ("Empresa id "+ id + "não foi encontrada!"));
	}
	
	public List<Empresa> buscarEmpresasAtivas(){
		return empresaRepository.buscarEmpresasAtivas();
	}
}
