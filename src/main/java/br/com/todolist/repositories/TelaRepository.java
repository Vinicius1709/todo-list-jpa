package br.com.todolist.repositories;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.todolist.model.Tela;
import br.com.todolist.util.Transacional;

public class TelaRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager entityManager;
	
	@Transacional
	public void salvar(Tela usuario) {
		entityManager.merge(usuario);
	}
}
