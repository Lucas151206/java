package ejercicios;

public class Ejericicio7 {

	public static void main(String[] args) {
		Producto prod = new Producto();
		prod.setNombre("Mause");
		System.out.println("Producto: " + prod.getNombre());
		
		
	}

}

class Producto{
	private String nombre;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;	
	}
	public String getNombre() {
		return nombre;
	}
}
