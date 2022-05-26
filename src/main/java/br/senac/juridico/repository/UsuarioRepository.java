package br.senac.juridico.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senac.juridico.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
<<<<<<< HEAD

    @Query(value = "SELECT * FROM Usuario WHERE usuario_status >= 0", nativeQuery = true)
	List<Usuario> buscarUsuarioAtivos();

    @Query(value = "SELECT * FROM Usuario WHERE usuario_id = :id AND usuario_status >= 0", nativeQuery = true)
	Optional<Usuario> buscarUsuarioAtivosPorId(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Usuario SET usuario_status = -1 WHERE usuario_id = :id", nativeQuery = true)
=======
	
    @Query(value = "SELECT * FROM usuario WHERE usuario_STATUS >= 0", nativeQuery = true)
	List<Usuario> buscarUsuariosAtivos();

    @Query(value = "SELECT * FROM usuario WHERE usuario_id = :id AND usuario_status >= 0", nativeQuery = true)
	Optional<Usuario> buscarUsuariosAtivosPorId(int id);
    
    @Query(value = "SELECT * FROM usuario WHERE usuario_cpf =:cpf AND usuario_senha =:senha AND usuario_status >= 0", nativeQuery = true)
	Optional<Usuario> buscarUsuariosAtivosCpfSenha(String cpf, String senha);    

    @Modifying
    @Transactional
    @Query(value = "UPDATE usuario SET usuario_status = -1 WHERE usuario_id = :id", nativeQuery = true)
>>>>>>> master
	void apagarUsuarioPorId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
<<<<<<< HEAD
    @Query(value = "UPDATE Usuario SET usuario_status = 0 WHERE usuario_id = :id", nativeQuery = true)
	void desativarUsuarioPorId(@Param("id") Integer id);
}
=======
    @Query(value = "UPDATE usuario SET usuario_status = 0 WHERE usuario_id = :id", nativeQuery = true)
	void desativarUsuarioPorId(@Param("id") Integer id);

}
>>>>>>> master
