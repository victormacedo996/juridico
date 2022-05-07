package br.senac.juridico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.controller.requests.LoginPostResquest;
import br.senac.juridico.controller.responses.LoginResponse;
import br.senac.juridico.model.Usuario;
import br.senac.juridico.service.UsuarioService;

@RestController
@RequestMapping("api/login")
public class LoginController {
	private final UsuarioService usuarioService;

	@Autowired
	public LoginController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping("")
	public ResponseEntity<LoginResponse> Login(@RequestBody LoginPostResquest request){
		
		try {
			Usuario usuario = usuarioService.buscarUsuariosAtivosCpfSenha(request.cpf, request.senha);
			if(usuario != null) {
				LoginResponse loginResponse = new LoginResponse();
				loginResponse.message = "Autenticação realizada com sucesso.";
				loginResponse.cpf = usuario.getCpf();
				loginResponse.nome = usuario.getNomeCompleto();
                //loginResponse.token = _jwtService.GenerateToken(usuario.cpf)
				return new ResponseEntity<>(loginResponse, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
