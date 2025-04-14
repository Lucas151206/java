package evaluacion;

public class TestAlumno {

	public static void main(String[] args) {
		 // Inicia un objeto del tipo Alumno

		// Crear algunas asignaturas
		Asignatura asignatura1 = new Asignatura(101, "Matemáticas");
		Asignatura asignatura2 = new Asignatura(102, "Lengua");

		// Crear un objeto Alumno 
		Asignatura[] listaMaterias = { asignatura1, asignatura2 };

		
		Alumno alumno = new Alumno(75000, "Lucas", "Cañete", "Instituto ", listaMaterias);

		// Imprimir los datos del alumno
		System.out.println("Datos del alumno:");
		System.out.println(alumno.toString());
		    
		

	}

}
