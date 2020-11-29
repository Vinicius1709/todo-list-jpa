package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.Usuario;
import br.com.todolist.repositories.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	
	private UsuarioRepository repository;
	
	private Usuario novoUsuario;
	
	public UsuarioBean() {
		novoUsuario = new Usuario();
	}
	
	public void salvarUsuario() {
		repository.salvar(novoUsuario);
	}

	public Usuario getNovoUsuario() {
		return novoUsuario;
	}
}
