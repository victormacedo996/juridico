package br.senac.juridico.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.senac.juridico.model.AnaliseJuridico;


@Repository
public interface AnaliseJuridicoRepository extends JpaRepository<AnaliseJuridico, Integer> {
	
}
