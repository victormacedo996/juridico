package br.senac.juridico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller;
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
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
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629

import br.senac.juridico.model.AtendimentoAnaliseJuridico;
import br.senac.juridico.service.AtendimentoAnaliseJuridicoService;

<<<<<<< HEAD
@RestController
@RequestMapping("api/atendimentoAnaliseJuridico")
public class AtendimentoAnaliseJuridicoController {
=======
@Controller
@RequestMapping("api/atendimentoAnaliseJuridico")
public class AtendimentoAnaliseJuridicoController {

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	private final AtendimentoAnaliseJuridicoService atendimentoAnaliseJuridicoService;

	@Autowired
	public AtendimentoAnaliseJuridicoController(AtendimentoAnaliseJuridicoService atendimentoAnaliseJuridicoService) {
		this.atendimentoAnaliseJuridicoService = atendimentoAnaliseJuridicoService;
	}
	
	@GetMapping
	public ResponseEntity<List<AtendimentoAnaliseJuridico>> obterAtendimentoAnaliseJuridico(){
		List<AtendimentoAnaliseJuridico> atendimentoAnaliseJuridico = atendimentoAnaliseJuridicoService.buscarAtendimentoAnaliseJuridicoAtivos();
		return new ResponseEntity<>(atendimentoAnaliseJuridico, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<AtendimentoAnaliseJuridico> obterAtendimentoAnaliseJuridicoPorId(@PathVariable("id") Integer id){
		AtendimentoAnaliseJuridico atendimentoAnaliseJuridico = atendimentoAnaliseJuridicoService.buscaAtendimentoAnaliseJuridicobyId(id);
		return new ResponseEntity<>(atendimentoAnaliseJuridico, HttpStatus.OK);
	}
	
	
	@PostMapping("/adicionar")
	public ResponseEntity<AtendimentoAnaliseJuridico> adicionarAtendimentoAnaliseJuridico(@RequestBody AtendimentoAnaliseJuridico atendimentoAnaliseJuridico){
		AtendimentoAnaliseJuridico novaAtendimentoAnaliseJuridico = atendimentoAnaliseJuridicoService.adicionarAtendimentoAnaliseJuridico(atendimentoAnaliseJuridico);
		return new ResponseEntity<>(novaAtendimentoAnaliseJuridico, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<AtendimentoAnaliseJuridico> atualizarSolicitacaoPrioridade(@RequestBody AtendimentoAnaliseJuridico atendimentoAnaliseJuridico){		
		AtendimentoAnaliseJuridico atualizarAtendimentoAnaliseJuridico = atendimentoAnaliseJuridicoService.atualizarAtendimentoAnaliseJuridico(atendimentoAnaliseJuridico);
		return new ResponseEntity<>(atualizarAtendimentoAnaliseJuridico, HttpStatus.OK);
	}
	
	@DeleteMapping("/apagar/{id}")
	public ResponseEntity<?> apagarAtendimentoAnaliseJuridico(@PathVariable("id") Integer id){
		atendimentoAnaliseJuridicoService.apagarAtendimentoAnaliseJuridico(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
<<<<<<< HEAD

}
=======
}
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
