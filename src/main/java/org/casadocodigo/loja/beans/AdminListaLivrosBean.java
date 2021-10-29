package org.casadocodigo.loja.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.casadocodigo.loja.daos.LivroDao;
import org.casadocodigo.loja.models.Livro;

@Model
public class AdminListaLivrosBean {
	
	@Inject
    private LivroDao dao;
	
	private List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() {
    	this.livros = dao.listar();
    	
        return livros;
    }
	
}
