package br.senac.juridico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.senac.juridico.service.ArquivoService;

@RestController
@RequestMapping("/api/arquivo")
public class ArquivoController {

	@Autowired
	ArquivoService arquivoService;
	
	@PostMapping
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file){
		try {
			arquivoService.salvarArquivo(file);
			String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			
			String urlDownload = ServletUriComponentsBuilder.fromCurrentContextPath()
					.path("/arquivosupload")
					.path(fileName)
					.toUriString();
			return ResponseEntity.ok().body("Arquivo enviado com sucesso!" + urlDownload);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Upload não realizado!");
		}
	}
}