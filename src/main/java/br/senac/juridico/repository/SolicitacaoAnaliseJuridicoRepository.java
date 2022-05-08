package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.SolicitacaoAnaliseJuridico;

@Repository
public interface SolicitacaoAnaliseJuridicoRepository extends JpaRepository<SolicitacaoAnaliseJuridico, Integer> {

    @Query(value = "SELECT * FROM SolicitacaoAnaliseJuridico WHERE solicitacao_analise_juridico_status >= 0", nativeQuery = true)
	List<SolicitacaoAnaliseJuridico> buscarSolicitacaoAnaliseJuridicoAtivas();

    @Query(value = "SELECT * FROM SolicitacaoAnaliseJuridico WHERE solicitacao_analise_juridico_id = :id AND solicitacao_analise_juridico_status >= 0", nativeQuery = true)
	Optional<SolicitacaoAnaliseJuridico> buscarSolicitacaoAnaliseJuridicoAtivasPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE SolicitacaoAnaliseJuridico SET solicitacao_analise_juridico_status = -1 WHERE solicitacao_analise_juridico_id = :id", nativeQuery = true)
	void apagarSolicitacaoAnaliseJuridicoPorId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE SolicitacaoAnaliseJuridico SET solicitacao_analise_juridico_status = 0 WHERE solicitacao_analise_juridico_id = :id", nativeQuery = true)
	void desativarSolicitacaoAnaliseJuridicoPorId(@Param("id") Integer id);
}
