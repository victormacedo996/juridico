package br.senac.juridico.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.AnaliseJuridico;


@Repository
public interface AnaliseJuridicoRepository extends JpaRepository<AnaliseJuridico, Integer> {
	@Query(value = "SELECT * FROM solicitacao_analise_juridico saj", nativeQuery=true)
    List<AnaliseJuridico> listarTodosRegistros();
}
