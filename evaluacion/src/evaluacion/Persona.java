package evaluacion;

public class Persona { //Comentario 1: Atributos privados 
	private int cedula;
	private String nombre;
	private String apellido;
	
	public Persona() { // Constructor vacío 
	    }
	
	public Persona(int c) {  // Comentario 2: Constructor que recibe solo cédula y asigna valores a nombre y apellido
	        setCedula(c);
	        nombre = new String("Desconocido");
	        apellido = new String("Desconocido");
	    }
	    public Persona(int c, String n, String a) { // Constructor que recibe todos los datos
	        setCedula(c);
	        setNombre(n);
	        setApellido(a);
	    }
	    public void setCedula(int c) { // Los set
	        if (c > 500000) {
	            cedula = c;
	    } else { 
	            cedula = 750000;
	    }
	   }
	    public void setNombre(String n) {
	        if (n.equals("")) { 
	            System.out.println("Nombre no válido, se asignó Desconocido");
	            nombre = new String("Desconocido");
	        } else {
	            nombre = n;
	        }
	    }
	    public void setApellido(String a) {
	        if (a.equals("")) {
	            System.out.println("Apellido no válido, se asignó Desconocido");
	            apellido = new String("Desconocido");
	        } else {
	            apellido = a;
	        }
	    }
	    
	    public int getCedula() { // Los get
	        return cedula;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }
	    
	    
	    public String toString() { // Método para imprimir el objeto Persona como string
	    	return cedula + ", " + nombre + ", " + apellido;
	    }
}
