package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senac.juridico.model.AtendimentoRegistro;

public interface AtendimentoRegistroRepository extends JpaRepository<AtendimentoRegistro, Integer>{
	
	@Query(value = "SELECT * FROM atendimento_registro WHERE atendimento_registro_status >= 0", nativeQuery = true)
	List<AtendimentoRegistro> listarTodosRegistros();
	
	@Query(value = "SELECT * FROM atendimento_registro WHERE atendimento_registro_id = :id AND atendimento_registro_status >= 0", nativeQuery = true)
	Optional<AtendimentoRegistro> buscarRegistroPorID();
	
	//@Modifying
	//@Transactional
	//@Query(value = "UPDATE atendimento_registro SET atendimento_registro_status = -1 WHERE atendimento_registro_id = :id", nativeQuery = true)
	//void excluirRegistroPorID();
	
	

}
