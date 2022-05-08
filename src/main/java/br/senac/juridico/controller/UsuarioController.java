package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.model.Usuario;
import br.senac.juridico.service.UsuarioService;

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
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Usuario> obterUsuarioPorId(@PathVariable("id") Integer id){
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
