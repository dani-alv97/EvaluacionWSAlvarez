package ec.edu.ups.app.g1.prueba.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="persona_id")
	private int codigo;
	private String cedula;
	private String nombres;
	@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
	@Column(nullable = true)
	private List<Titulos> titulo;
	
	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public List<Titulos> getTitulo() {
		return titulo;
	}



	public void setTitulo(List<Titulos> titulo) {
		this.titulo = titulo;
	}



	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", cedula=" + cedula + ", nombres=" + nombres + ", titulo=" + titulo + "]";
	}
	
	
}
