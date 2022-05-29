package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.RegistroMudancaStatus;

@Repository
public interface RegistroMudancaStatusRepository extends JpaRepository<RegistroMudancaStatus, Integer>{

	@Query(value = "SELECT * FROM registro_mudanca_status", nativeQuery = true)
	List<RegistroMudancaStatus> buscarRegistroMudancaStatus();

    @Query(value = "SELECT * FROM registro_mudanca_status WHERE registro_mudanca_status_id = :id ", nativeQuery = true)
	Optional<RegistroMudancaStatus> buscarRegistroMudancaStatusPorId(int id); 

}
