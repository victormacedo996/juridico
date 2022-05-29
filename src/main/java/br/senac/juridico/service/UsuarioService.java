package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import br.senac.juridico.exception.UsuarioNotFoundException;
=======
import br.senac.juridico.exception.EmpresaNotFoundException;
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
import br.senac.juridico.model.Usuario;
import br.senac.juridico.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
<<<<<<< HEAD
	public Usuario adicionarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario atualizarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void apagarUsuario(int id) {
=======
	public Usuario adicionarUsuario(Usuario empresa) {
		return usuarioRepository.save(empresa);
	}
	
	public Usuario atualizarUsuario(Usuario empresa) {
		return usuarioRepository.save(empresa);
	}
	
	public void excluirUsuario(int id) {
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
		usuarioRepository.apagarUsuarioPorId(id);
	}
	
	public Usuario buscaUsuariobyId(int id) {
		return usuarioRepository.buscarUsuariosAtivosPorId(id)
<<<<<<< HEAD
			.orElseThrow(() -> new UsuarioNotFoundException ("Usuario id "+ id + "não foi encontrado!"));
=======
			.orElseThrow(() -> new EmpresaNotFoundException ("Usuario id "+ id + "não foi encontrado!"));
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	}
	
	public Usuario buscarUsuariosAtivosCpfSenha(String cpf, String senha) {
		return usuarioRepository.buscarUsuariosAtivosCpfSenha(cpf, senha)
<<<<<<< HEAD
				.orElseThrow(() -> new UsuarioNotFoundException ("Usuario e senha inválidos!"));
=======
				.orElseThrow(() -> new EmpresaNotFoundException ("Usuario e senha inválidos!"));
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	}
	
	public List<Usuario> buscarUsuariosAtivos(){
		return usuarioRepository.buscarUsuariosAtivos();
	}
}
