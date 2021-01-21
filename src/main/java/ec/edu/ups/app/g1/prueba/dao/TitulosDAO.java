package ec.edu.ups.app.g1.prueba.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.app.g1.prueba.entidades.Titulos;

@Stateless
public class TitulosDAO {
	
	@Inject
	private EntityManager em;
	
	public TitulosDAO() {
		
	}
	
	public boolean crearTitulo(Titulos titulo) throws Exception {
		try {
			em.persist(titulo);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
