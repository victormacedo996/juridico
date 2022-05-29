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

import br.senac.juridico.model.AtendimentoAnaliseJuridico;
=======

import br.senac.juridico.model.AtendimentoAnaliseJuridico;
import jakarta.transaction.Transactional;
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629

@Repository
public interface AtendimentoAnaliseJuridicoRepository extends JpaRepository<AtendimentoAnaliseJuridico, Integer>{

	@Query(value = "SELECT * FROM atendimento_analise_juridico WHERE atendimento_analise_juridico_status >= 0", nativeQuery = true)
	List<AtendimentoAnaliseJuridico> buscarAtendimentoAnaliseJuridicoAtivos();

    @Query(value = "SELECT * FROM atendimento_analise_juridico WHERE atendimento_analise_juridico_id = :id AND atendimento_analise_juridico_status >= 0", nativeQuery = true)
	Optional<AtendimentoAnaliseJuridico> buscarAtendimentoAnaliseJuridicoAtivosPorId(int id); 

    @Modifying
    @Transactional
    @Query(value = "UPDATE atendimento_analise_juridico SET atendimento_analise_juridico_status = -1 WHERE atendimento_analise_juridico_id = :id", nativeQuery = true)
	void apagarAtendimentoAnaliseJuridicoPorId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE atendimento_analise_juridico SET atendimento_analise_juridico_status = 0 WHERE atendimento_analise_juridico_id = :id", nativeQuery = true)
	void desativarAtendimentoAnaliseJuridicoPorId(@Param("id") Integer id);
<<<<<<< HEAD
}
=======
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
