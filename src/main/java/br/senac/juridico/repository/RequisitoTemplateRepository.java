package br.senac.juridico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.senac.juridico.model.RequisitoTemplate;



@Repository
public interface RequisitoTemplateRepository extends JpaRepository<RequisitoTemplate, Integer>{
	@Query(value = "SELECT*FROM requisito_template", nativeQuery = true)
	List<RequisitoTemplate> buscarRequisitoTemplates();
}
