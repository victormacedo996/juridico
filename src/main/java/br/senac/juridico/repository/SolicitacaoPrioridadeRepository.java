package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.SolicitacaoPrioridade;
import jakarta.transaction.Transactional;

@Repository
public interface SolicitacaoPrioridadeRepository extends JpaRepository<SolicitacaoPrioridade, Integer>{

	@Query(value = "SELECT * FROM solicitacao_prioridade WHERE solicitacao_prioridade_status >= 0", nativeQuery = true)
	List<SolicitacaoPrioridade> buscarSolicitacaoPrioridadeAtivas();

    @Query(value = "SELECT * FROM solicitacao_prioridade WHERE solicitacao_prioridade_id = :id AND solicitacao_prioridade_status >= 0", nativeQuery = true)
	Optional<SolicitacaoPrioridade> buscarSolicitacaoPrioridadeAtivasPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE solicitacao_prioridade SET solicitacao_prioridade_status = -1 WHERE solicitacao_prioridade_id = :id", nativeQuery = true)
	void excluirSolicitacaoPrioridadePorId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE solicitacao_prioridade SET solicitacao_prioridade_status = 0 WHERE solicitacao_prioridade_id = :id", nativeQuery = true)
	void desativarSolicitacaoPrioridadePorId(@Param("id") Integer id);
}