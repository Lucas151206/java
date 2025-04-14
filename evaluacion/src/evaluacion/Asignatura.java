package evaluacion;

public class Asignatura {
	int codigo;
	String nombre;
	
	
	public Asignatura() {
		
	}
	
	public Asignatura(int co, String n) {
		setCodigo(co);
		setNombre(n);
	}
	
	public void setNombre(String n) {
		if(n.equals("")) {
			System.out.println("Nombre no valido, se asigno Irreconocible");
			nombre = new String ("Irreconocible");
		}else nombre = n;
	}
	
	public void setCodigo(int co) {
		if(co > 0) codigo = co;
		else co = 100;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String toString() { 
		return nombre + " Código: " + codigo;
	}
}
