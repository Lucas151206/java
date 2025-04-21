   package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Alumno;
import models.Libro;
import models.Material;
import models.Prestamo;
import models.Persona;

public class BibliotecaControllers {
	private String nombre;
	private String horario;
	List<Material> material;
	List<Persona>  personas;
	List<Prestamo> prestamos;
	public BibliotecaControllers(String nombre, String horario) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		material = new ArrayList<Material>();
		personas = new ArrayList<Persona>();
		prestamos = new ArrayList<Prestamo>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void prestaMaterial(Material m, Persona p) {
		//presta material
		String fi = "11/04/2025:13:00";
		String ff = "16/04/2025:13:00";
		Prestamo  pre = new Prestamo(m,p, fi,ff);
		prestamos.add(pre);
	}
	public void cargarLibro(int codigo, String autor, String titulo, int ayer, String estado, String editorial) {
		Material l = new Libro( codigo, autor, titulo, ayer,  estado,  editorial);
		material.add(l);
	}
	public void cargarAlumno(int cI, String nombreApellido, String correo, String telefono, String matricula) {
	    Persona p = new Alumno(cI, nombreApellido, correo, telefono, matricula);
		personas.add(p);
	}
	public String verMateralesPrestamdos() {
		return"mMaterial pestados";
	}
	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", horario=" + horario + "]";
	}
}


