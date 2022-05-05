package br.senac.juridico.Interfaces;

import br.senac.juridico.model.Usuario;

public interface IUsuarioRepository extends IBaseRepository<Usuario> {
	
	Usuario Obter(String cpf);
	Usuario Obter(String cpf, String senha);
	
}
