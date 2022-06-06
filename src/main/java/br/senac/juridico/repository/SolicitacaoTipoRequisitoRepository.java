package br.senac.juridico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.SolicitacaoTipoRequisito;

@Repository
public interface SolicitacaoTipoRequisitoRepository extends JpaRepository<SolicitacaoTipoRequisito,Integer>{
	
    @Query(value = "SELECT * FROM solicitacao_tipo_requisito ORDER BY solicitacao_tipo_requisito_id", nativeQuery = true)
	List<SolicitacaoTipoRequisito> buscarSolicitacaoTipoRequisito();
	
}