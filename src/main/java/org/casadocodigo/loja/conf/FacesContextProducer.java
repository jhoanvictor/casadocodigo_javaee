package org.casadocodigo.loja.conf;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

public class FacesContextProducer {

	@RequestScoped
	@Produces //Produz um objeto
	public FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

}
