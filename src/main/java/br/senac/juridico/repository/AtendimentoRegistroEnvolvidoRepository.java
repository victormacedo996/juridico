package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.AtendimentoRegistroEnvolvido;
import jakarta.transaction.Transactional;

@Repository
public interface AtendimentoRegistroEnvolvidoRepository extends JpaRepository<AtendimentoRegistroEnvolvido, Integer>{

	@Query(value = "SELECT * FROM atendimento_registro_envolvido WHERE atendimento_registro_envolvido_status >= 0", nativeQuery = true)
	List<AtendimentoRegistroEnvolvido> listarTodosRegistrosEnvolvidoAtivos();

	@Query(value = "SELECT * FROM FROM atendimento_registro_envolvido WHERE atendimento_registro_envolvido_id = :id AND atendimento_registro_envolvido_status >= 0", nativeQuery = true)
	Optional<AtendimentoRegistroEnvolvido> buscarAtendimentoRegistroEnvolvidoPorID(int id);

	@Modifying
	@Transactional
	@Query(value = "UPDATE atendimento_registro_envolvido SET atendimento_registro_envolvido_status = -1 WHERE atendimento_registro_envolvido_id = :id", nativeQuery = true)
	void excluirAtendimentoRegistroEnvolvidoPorID(@Param("id") Integer id);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE atendimento_registro_envolvido SET atendimento_registro_envolvido_status = 0 WHERE atendimento_registro_envolvido_id = :id", nativeQuery = true)
	void desativarAtendimentoRegistroEnvolvidoPorId(@Param("id") Integer id);
}
