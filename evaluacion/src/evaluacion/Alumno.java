package evaluacion;

public class Alumno extends Persona{
	String institucion;
	Asignatura[] materias;
	
	public Alumno() {  // Constructor vacío
		super();
	}
	
	public Alumno(int c, String n, String a, String ins, Asignatura[] mat ) {  // Constructor con parámetros incluyendo los de la superclase Persona
		super(c, n, a);  // Llama a Persona
		this.institucion = ins;
		this.materias = mat;
	}
	
	public String setInstitucion() { // los set y get
		return institucion;
	}
	
	public Asignatura[] getMaterias() {
		return materias;
	}
	
	public String getInstitucion() {
		return institucion;
	}
	
	public Asignatura[] getMaterial() {
		return materias;
	}
	
	public String toString() {  // Para mostrar los datos del alumno 
		String info = super.toString() + " | Institución: " + institucion;
        if (materias != null && materias.length > 0) {
            info += " | Materias: ";
            for (Asignatura a : materias)
                info += a.getNombre() + " ";
        }return info;
	}

} 
