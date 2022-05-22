package br.senac.juridico.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ArquivoService {

	private final Path root = Paths.get("arquivosupload");
	
	public void salvarArquivo(MultipartFile file) {
		try {
			Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		}catch(Exception e){
			throw new RuntimeException("Não foi possível gravar o arquivo!" + e.getMessage());
		}
		
	}
}
