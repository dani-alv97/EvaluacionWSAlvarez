package ec.edu.ups.app.g1.prueba.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.app.g1.prueba.entidades.Persona;

@Stateless
public class PersonaDAO {

	@Inject
	private EntityManager em;

	public Persona buscarPersona(String cedula) throws Exception {
		try {
			String jpql = "SELECT p FROM Persona p WHERE p.cedula LIKE ?1";
			Query q = em.createQuery(jpql, Persona.class);
			q.setParameter(1, cedula);
			return (Persona)q.getSingleResult();
		}catch(Exception e) {
			return null;
		}
	}
}
