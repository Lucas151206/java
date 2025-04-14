package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		Estudiante est = new Estudiante("Andr�s", 20, "Ingenier�a");
		est.presentarse();

	}

}
class Person {
	String nombre;
	int edad;
	
	public Person(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public void presentarse() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " a�os.");
	}
}

class Estudiante extends Person{
	String carrera;
	
	public Estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}
	
}
