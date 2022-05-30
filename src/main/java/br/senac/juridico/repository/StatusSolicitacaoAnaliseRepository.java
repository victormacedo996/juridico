package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.StatusSolicitacaoAnalise;

@Repository
public interface StatusSolicitacaoAnaliseRepository extends JpaRepository<StatusSolicitacaoAnalise, Integer>{

	@Query(value = "SELECT * FROM status_solicitacao_analise WHERE status_solicitacao_analise_status >= 0", nativeQuery = true)
	List<StatusSolicitacaoAnalise> buscarStatusSolicitacaoAnaliseAtivas();

    @Query(value = "SELECT * FROM status_solicitacao_analise WHERE status_solicitacao_analise_id = :id AND status_solicitacao_analise_status >= 0", nativeQuery = true)
	Optional<StatusSolicitacaoAnalise> buscarStatusSolicitacaoAnaliseAtivasPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE status_solicitacao_analise SET status_solicitacao_analise_status = -1 WHERE status_solicitacao_analise_id = :id", nativeQuery = true)
	void apagarStatusSolicitacaoAnalisePorId(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE status_solicitacao_analise SET status_solicitacao_analise_status = 0 WHERE status_solicitacao_analise_id = :id", nativeQuery = true)
	void desativarStatusSolicitacaoAnalisePorId(@Param("id") Integer id);
}