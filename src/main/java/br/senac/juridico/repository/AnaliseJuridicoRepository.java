package br.senac.juridico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.Empresa;
import br.senac.juridico.model.TipoSolicitacao;


public interface AnaliseJuridicoRepository extends JpaRepository<AnaliseJuridico, Integer> {
	@Query(value = "SELECT*FROM solicitacao_tipo", nativeQuery = true)
	List<TipoSolicitacao> buscarTipoSolicitacao();
}
