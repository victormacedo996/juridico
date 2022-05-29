package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.SolicitacaoPrioridade;

@Repository
public interface SolicitacaoPrioridadeRepository extends JpaRepository<SolicitacaoPrioridade, Integer> {
	
=======

import br.senac.juridico.model.SolicitacaoPrioridade;
import jakarta.transaction.Transactional;

@Repository
public interface SolicitacaoPrioridadeRepository extends JpaRepository<SolicitacaoPrioridade, Integer>{

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	@Query(value = "SELECT * FROM solicitacao_prioridade WHERE solicitacao_prioridade_status >= 0", nativeQuery = true)
	List<SolicitacaoPrioridade> buscarSolicitacaoPrioridadeAtivas();

    @Query(value = "SELECT * FROM solicitacao_prioridade WHERE solicitacao_prioridade_id = :id AND solicitacao_prioridade_status >= 0", nativeQuery = true)
	Optional<SolicitacaoPrioridade> buscarSolicitacaoPrioridadeAtivasPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE solicitacao_prioridade SET solicitacao_prioridade_status = -1 WHERE solicitacao_prioridade_id = :id", nativeQuery = true)
<<<<<<< HEAD
	void apagarSolicitacaoPrioridadePorId(@Param("id") Integer id);
=======
	void excluirSolicitacaoPrioridadePorId(@Param("id") Integer id);
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE solicitacao_prioridade SET solicitacao_prioridade_status = 0 WHERE solicitacao_prioridade_id = :id", nativeQuery = true)
	void desativarSolicitacaoPrioridadePorId(@Param("id") Integer id);
<<<<<<< HEAD

}
=======
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
