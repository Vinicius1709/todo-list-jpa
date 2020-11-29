package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.Tela;
import br.com.todolist.repositories.TelaRepository;

@Named
@ViewScoped
public class TelaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	
	private TelaRepository repository;
	
	private Tela novoUsuario;
	
	public TelaBean() {
		novoUsuario = new Tela();
	}
	
	public void salvarUsuario() {
		repository.salvar(novoUsuario);
	}

	public Tela getNovoUsuario() {
		return novoUsuario;
	}
}
