package org.casadocodigo.loja.beans;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.casadocodigo.loja.daos.LivroDao;
import org.casadocodigo.loja.models.Livro;

@Model
public class HomeBean {
	
	@Inject
	private LivroDao dao;
	
	public List<Livro> ultimosLancamentos(){
		return dao.ultimosLancamentos();
	}
	
	public List<Livro> demaisLivros(){
		return dao.demaisLivros();
	}
	
}
