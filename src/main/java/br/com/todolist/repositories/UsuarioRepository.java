package br.com.todolist.repositories;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.todolist.model.Usuario;
import br.com.todolist.util.Transacional;

public class UsuarioRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager entityManager;
	
	@Transacional
	public void salvar(Usuario usuario) {
		entityManager.merge(usuario);
	}
}
