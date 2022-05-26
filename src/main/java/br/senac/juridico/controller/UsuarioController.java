package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller;
>>>>>>> master
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;
=======
>>>>>>> master

import br.senac.juridico.model.Usuario;
import br.senac.juridico.service.UsuarioService;

<<<<<<< HEAD
@RestController
@RequestMapping("api/Usuario")
public class UsuarioController {
	private final UsuarioService UsuarioService;

	@Autowired
	public UsuarioController(UsuarioService UsuarioService) {
		this.UsuarioService = UsuarioService;
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> obterUsuarios(){
		List<Usuario> Usuarios = UsuarioService.buscarUsuariosAtivos();
		return new ResponseEntity<>(Usuarios, HttpStatus.OK);
=======
@Controller
@RequestMapping("api/usuario")
public class UsuarioController {

	private final UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listarUsuario(){
		List<Usuario> usuario = usuarioService.buscarUsuariosAtivos();
		return new ResponseEntity<>(usuario, HttpStatus.OK);
>>>>>>> master
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Usuario> obterUsuarioPorId(@PathVariable("id") Integer id){
<<<<<<< HEAD
		Usuario Usuario = UsuarioService.buscarUsuariobyId(id);
		return new ResponseEntity<>(Usuario, HttpStatus.OK);
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario Usuario){
		Usuario novaUsuario = UsuarioService.adicionarUsuario(Usuario);
		return new ResponseEntity<>(novaUsuario, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario Usuario){		
		Usuario atualizarUsuario = UsuarioService.atualizarUsuario(Usuario);
		return new ResponseEntity<>(atualizarUsuario, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarUsuario(@PathVariable("id") Integer id){
		UsuarioService.apagarUsuario(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
=======
		Usuario usuario = usuarioService.buscaUsuariobyId(id);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
	@PostMapping("/inserir")
	public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario usuario){
		Usuario novoUsuario = usuarioService.adicionarUsuario(usuario);
		return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario){		
		Usuario atualizarUsuario = usuarioService.atualizarUsuario(usuario);
		return new ResponseEntity<>(atualizarUsuario, HttpStatus.OK);
	}
	
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> excluirUsuario(@PathVariable("id") Integer id){
		usuarioService.excluirUsuario(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
>>>>>>> master
