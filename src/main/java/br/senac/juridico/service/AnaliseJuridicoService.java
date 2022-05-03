package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.EmpresaNotFoundException;
import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.Empresa;
import br.senac.juridico.repository.AnaliseJuridicoRepository;
import br.senac.juridico.repository.EmpresaRepository;

@Service
public class AnaliseJuridicoService {
	private final AnaliseJuridicoRepository analiseJuridicoRepository;

	@Autowired
	public AnaliseJuridicoService(AnaliseJuridicoRepository analiseJuridicoRepository) {
		this.analiseJuridicoRepository = analiseJuridicoRepository;
	}
	
	public AnaliseJuridico adicionarAnaliseJuridico(AnaliseJuridico analiseJuridico) {
		return analiseJuridicoRepository.save(analiseJuridico);
	}
	
	public AnaliseJuridico atualizarAnaliseJuridico(AnaliseJuridico analiseJuridico) {
		return analiseJuridicoRepository.update(analiseJuridico);
	}
	
	public void apagarAnaliseJuridico(int id) {
		analiseJuridicoRepository.apagarAnaliseJuridicaPorId(id);
	}
	
	public AnaliseJuridico buscaAnaliseJuridicobyId(int id) {
		return analiseJuridicoRepository.buscarAnaliseJuridicasPorId(id)
			.orElseThrow(() -> new EmpresaNotFoundException ("Empresa id "+ id + "não foi encontrada!"));
	}
	
	public List<AnaliseJuridico> buscarAnalisesJuridicasAtivasAtivas(){
		return analiseJuridicoRepository.buscarAnaliseJuridicasAtivas();
	}
}
