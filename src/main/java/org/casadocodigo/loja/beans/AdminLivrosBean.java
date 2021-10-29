package org.casadocodigo.loja.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.casadocodigo.loja.daos.AutorDao;
import org.casadocodigo.loja.daos.LivroDao;
import org.casadocodigo.loja.models.Autor;
import org.casadocodigo.loja.models.Livro;

//CDI
@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	@Inject
	private LivroDao dao;

	@Inject
	private AutorDao autorDao;

	@Inject
	private FacesContext context;

	@Transactional
	public String salvar() {

		dao.salvar(livro);

		context.getExternalContext().getFlash().setKeepMessages(true); // Aqui estamos ativando o FlashScope
		context.addMessage(null, new FacesMessage("Livro cadastrado com sucesso!"));

		return "/livros/lista?faces-redirect=true";
	}

	public List<Autor> getAutores() {
		return autorDao.listar();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
