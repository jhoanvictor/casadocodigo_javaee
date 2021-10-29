package org.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.casadocodigo.loja.models.Autor;

public class AutorDao {
	
	@PersistenceContext
	private EntityManager manager;

	public List<Autor> listar(){
		return manager.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
	}
	
}
