package ec.edu.ups.app.g1.prueba.services;

import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.app.g1.prueba.entidades.Persona;
import ec.edu.ups.app.g1.prueba.entidades.Titulos;
import ec.edu.ups.app.g1.prueba.on.TitulosON;

@WebService
public class TitulosSOAP {

	@Inject
	private TitulosON tituloON;
	
	@WebMethod
	public void registrarTitulo(String cedula, String nombre, String universidad) {
		try {
			Titulos titulo = new Titulos();
			Persona p = tituloON.buscarPersona(cedula);
			if (p == null) {
				System.out.println("Error la persona no existe");
			}else if (p.getCedula().length() < 10 || p.getCedula().length() > 10) {
				System.out.println("Error la cedula debe ser de 10 digitos");
			}else {
				titulo.setFechaRegistro(new Date());
				titulo.setCodigo(tituloON.codigoAlfanumerico());
				titulo.setPersona(p);
				titulo.setTitulo(nombre);
				titulo.setUniversidad(universidad);
				tituloON.registrarTitulo(titulo);
				System.out.println("Codigo asignado: "+titulo.getCodigo());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
