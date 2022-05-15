package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.SolicitacaoAlocacao;

@Repository
public interface SolicitacaoAlocacaoRepository extends JpaRepository<SolicitacaoAlocacao, Integer>{

	   @Query(value = "SELECT * FROM solicitacao_alocacao WHERE solicitacao_alocacao_status >= 0", nativeQuery = true)
		List<SolicitacaoAlocacao> buscarSolicitacaoAlocacaoAtivos();

	    @Query(value = "SELECT * FROM solicitacao_alocacao WHERE solicitacao_alocacao_id = :id AND solicitacao_alocacao_status >= 0", nativeQuery = true)
		Optional<SolicitacaoAlocacao> buscarSolicitacaoAlocacaoAtivosPorId(int id);

	    @Modifying
	    @Transactional
	    @Query(value = "UPDATE solicitacao_alocacao SET solicitacao_alocacao_status = -1 WHERE solicitacao_alocacao_id = :id", nativeQuery = true)
		void apagarSolicitacaoAlocacaoPorId(@Param("id") Integer id);
	    
	    @Modifying
	    @Transactional
	    @Query(value = "UPDATE solicitacao_alocacao SET solicitacao_alocacao_status = 0 WHERE solicitacao_alocacao_id = :id", nativeQuery = true)
		void desativarSolicitacaoAlocacaoPorId(@Param("id") Integer id);
}
