package br.senac.juridico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.Empresa;
import br.senac.juridico.model.TipoSolicitacao;

@Repository
public interface AnaliseJuridicoRepository extends JpaRepository<AnaliseJuridico, Integer> {
	
}
