package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.AnaliseJuridico;
import br.senac.juridico.model.Empresa;

@Repository
public interface AnaliseJuridicoRepository extends JpaRepository<AnaliseJuridicoRepository, Integer> {
    @Query(value = "SELECT * FROM AnaliseJuridico WHERE EMPRESA_STATUS >= 0", nativeQuery = true)
	List<AnaliseJuridico> buscarAnaliseJuridicasAtivas();

    @Query(value = "SELECT * FROM AnaliseJuridico WHERE EMPRESA_ID = :id AND EMPRESA_STATUS >= 0", nativeQuery = true)
	Optional<AnaliseJuridico> buscarAnaliseJuridicasPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE AnaliseJuridico SET Id = -1 WHERE Id = :id", nativeQuery = true)
	void apagarAnaliseJuridicaPorId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE AnaliseJuridica SET Status = 0 WHERE Status = :id", nativeQuery = true)
	void desativarAnaliseJuridicaPorId(@Param("id") Integer id);

	AnaliseJuridico save(AnaliseJuridico analiseJuridico);
	
	AnaliseJuridico update(AnaliseJuridico analiseJuridico);
}
