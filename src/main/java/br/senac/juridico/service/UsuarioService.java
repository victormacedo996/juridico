package br.senac.juridico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.juridico.exception.EmpresaNotFoundException;
import br.senac.juridico.model.Usuario;
import br.senac.juridico.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public Usuario adicionarUsuario(Usuario empresa) {
		return usuarioRepository.save(empresa);
	}
	
	public Usuario atualizarUsuario(Usuario empresa) {
		return usuarioRepository.save(empresa);
	}
	
	public void apagarUsuario(int id) {
		usuarioRepository.apagarUsuarioPorId(id);
	}
	
	public Usuario buscaUsuariobyId(int id) {
		return usuarioRepository.buscarUsuariosAtivosPorId(id)
			.orElseThrow(() -> new EmpresaNotFoundException ("Usuario id "+ id + "não foi encontrado!"));
	}
	
	public Usuario buscarUsuariosAtivosCpfSenha(String cpf, String senha) {
		return usuarioRepository.buscarUsuariosAtivosCpfSenha(cpf, senha)
				.orElseThrow(() -> new EmpresaNotFoundException ("Usuario e senha inválidos!"));
	}
	
	public List<Usuario> buscarUsuariosAtivos(){
		return usuarioRepository.buscarUsuariosAtivos();
	}
}
