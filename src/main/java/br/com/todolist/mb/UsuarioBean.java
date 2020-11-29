package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.Tela;
import br.com.todolist.repositories.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	
	private UsuarioRepository repository;
	
	private Tela novoUsuario;
	
	public UsuarioBean() {
		novoUsuario = new Tela();
	}
	
	public void salvarUsuario() {
		repository.salvar(novoUsuario);
	}

	public Tela getNovoUsuario() {
		return novoUsuario;
	}
}
