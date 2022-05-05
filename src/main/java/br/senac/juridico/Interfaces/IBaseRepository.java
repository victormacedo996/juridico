package br.senac.juridico.Interfaces;

import java.util.List;

public interface IBaseRepository<T> {
	void Inserir(T entity);
	void Atualizar(T entity);
	void Excluir (T entity);
	
	List<T> Consultar();
	T ObterPorId(int id);
}
