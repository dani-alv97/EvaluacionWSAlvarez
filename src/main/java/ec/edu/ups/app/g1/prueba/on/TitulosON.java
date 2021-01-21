package ec.edu.ups.app.g1.prueba.on;

import java.util.Random;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.app.g1.prueba.dao.PersonaDAO;
import ec.edu.ups.app.g1.prueba.dao.TitulosDAO;
import ec.edu.ups.app.g1.prueba.entidades.Persona;
import ec.edu.ups.app.g1.prueba.entidades.Titulos;

@Stateless
public class TitulosON {

	@Inject
	private TitulosDAO daoTitulos;
	@Inject
	private PersonaDAO daoPersona;
	
	public boolean registrarTitulo(Titulos titulo) throws Exception {
		try {
			daoTitulos.crearTitulo(titulo);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Persona buscarPersona(String cedula) throws Exception{ 
		try {
			return daoPersona.buscarPersona(cedula);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String codigoAlfanumerico() {
		String codigo;
		int numero;
		String letras = "COD00";
		Random r = new Random();
		numero = r.nextInt();
		codigo = letras + String.valueOf(numero);
		return codigo;
	}
	
}
