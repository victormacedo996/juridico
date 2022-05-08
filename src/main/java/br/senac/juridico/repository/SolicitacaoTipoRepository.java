package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.SolicitacaoTipo;

@Repository
public interface SolicitacaoTipoRepository extends JpaRepository<SolicitacaoTipo, Integer> {

    @Query(value = "SELECT * FROM SolicitacaoTipo WHERE solicitacao_tipo_status >= 0", nativeQuery = true)
	List<SolicitacaoTipo> buscarSolicitacaoTipoAtivas();

    @Query(value = "SELECT * FROM SolicitacaoTipo WHERE solicitacao_tipo_id = :id AND solicitacao_tipo_status >= 0", nativeQuery = true)
	Optional<SolicitacaoTipo> buscarSolicitacaoTipoAtivasPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE SolicitacaoTipo SET solicitacao_tipo_status = -1 WHERE solicitacao_tipo_id = :id", nativeQuery = true)
	void apagarSolicitacaoTipoPorId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE SolicitacaoTipo SET solicitacao_tipo_status = 0 WHERE solicitacao_tipo_id = :id", nativeQuery = true)
	void desativarSolicitacaoTipoPorId(@Param("id") Integer id);
}