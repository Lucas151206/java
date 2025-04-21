package view;

import controllers.BibliotecaControllers;
import models.Alumno;
import models.Libro;
import models.Profesor;
import models.RevistaCientifica;

public class TestBliblioteca {

	public static void main(String[] args) {
		BibliotecaControllers biblioteca = new BibliotecaControllers();

       
        Libro libro1 = new Libro("L001", "El Principito", 1943, "Antoine de Saint-Exupéry");
        RevistaCientifica revista1 = new RevistaCientifica("R001", "Ciencia Hoy", 2021, "Física");

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);

       
        Alumno alumno1 = new Alumno("Lucas Cañete", "6597645", "Analisis de Sistemas");
        Profesor profesor1 = new Profesor("Luz Alonso", "7032069", "Ciencias Exactas");

        biblioteca.registrarUsuario(alumno1);
        biblioteca.registrarUsuario(profesor1);

       
        biblioteca.prestarMaterial("L001", "6597645");
        biblioteca.prestarMaterial("R001", "7032069"); 
        
       
        System.out.println("\nListado de prestamos:");
        biblioteca.mostrarPrestamos();
    
	}

}
