package view;

import java.util.Scanner;


import controllers.BibliotecaControllers;

public class Views {
	public static BibliotecaControllers biblio;
	public static void main(String[] args) {
		biblio = new BibliotecaControllers("EL MAPACHE ", "LUaSA");
		int opci =0;
		 Scanner sc = new Scanner(System.in);
	 do {
		 System.out.println("-------MENU------");
		 System.out.println("1. Rgistra Persona ");
		 System.out.println("2. Rgistra Material ");
		 System.out.println("3. Prestar Material ");
		 System.out.println("0. Salir ");
	      opci = sc.nextInt();
	      evaluar(opci);
	 }while(opci !=0);
	 sc.close();
	}
	private static void evaluar(int opci) {
	 switch(opci) {
	 case 1:
		 registarPersona();
		 break;
	 case 2:
		 registarMaterial();
		 break;
	 case 3:
		 prestarMaterial();
		 break;
	 case 0:
		 System.out.println("Vuelva pronto");
	     break;
	 default:
		 break;
	 }	
	}
	private static void prestarMaterial() {
		Scanner sc = new Scanner(System.in);
		 System.out.println(" opcion  de registro");
	   System.out.println("1. Libro \n 2. Resvista Cientifica");
	   int opci = sc.nextInt();
	   if( opci == 1) {
	   	registarLibro();
	   }else if(opci == 2){registarRevistaCientifica();
	   }
		sc.close();
	}
	private static void registarRevistaCientifica() {
		 Scanner sc = new Scanner(System.in);
		 int codigo;
			String autor;
			String titulo;
			int ayer;
		    String estado;
		    String areaCientifica;
			System.out.println("Codigo; ");
		    codigo = sc.nextInt();
			System.out.println("Nombre autor; ");
		    autor = sc.next();
			System.out.println("Titulo; ");
		    titulo = sc.next();
			System.out.println("Año; ");
		    ayer = sc.nextInt();
			System.out.println("Estado; ");
		    estado = sc.next();
			System.out.println("Area Cientifica; ");
		    String areaCientifica =sc.next();
		    codigo
	}
	private static void registarLibro() {
		 Scanner sc = new Scanner(System.in);
		 int codigo;
			String autor;
			String titulo;
			int ayer;
		    String estado;
		    String editorial;
			System.out.println("Codigo; ");
		    codigo = sc.nextInt();
			System.out.println("Nombre autor; ");
		    autor = sc.next();
			System.out.println("Titulo; ");
		    titulo = sc.next();
			System.out.println("Año; ");
		    ayer = sc.nextInt();
			System.out.println("Estado; ");
		    estado = sc.next();
		    String editorial = sc.next();
		
	}
	private static void registarMaterial() {
		 Scanner sc = new Scanner(System.in);
		int codigo;
		String autor;
		String titulo;
		int ayer;
	    String estado;
		System.out.println("Codigo; ");
	    codigo = sc.nextInt();
		System.out.println("Nombre autor; ");
	    autor = sc.next();
		System.out.println("Titulo; ");
	    titulo = sc.next();
		System.out.println("Año; ");
	    ayer = sc.nextInt();
		System.out.println("Estado; ");
	    estado = sc.next();
	    sc.close();
	    
	}
	private static void registarPersona() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" opcion  de registro");
	    System.out.println("1. Alumno \n 2. Profesor");
	    int opci = sc.nextInt();
	    if( opci == 1) {
	    	registarAlumno();
	    }else if(opci == 2){registarProfesor();
	    }
	    sc.close();
	}
	private static void registarProfesor() {
		 Scanner sc = new Scanner(System.in);
		int cI;
		String nombreApellido;
		String correo;
		String telefono;
		String especialidad;
		System.out.println("CI; ");
		cI = sc.nextInt();
		System.out.println("Nombre Apellido; ");
		nombreApellido = sc.next();
		System.out.println("Correo; ");
		correo = sc.next();
		System.out.println("Telefono; ");
		telefono = sc.next();
		System.out.println("Especialidad");
		especialidad = sc.next();
		sc.close();
	}
	private static void registarAlumno() {
		 Scanner sc = new Scanner(System.in);
		int ci;
		String nombreApellido;
		String correo;
		String telefono;
		String matricula;	
		System.out.println("CI; ");
		ci = sc.nextInt();
		System.out.println("Nombre Apellido; ");
		nombreApellido = sc.next();
		System.out.println("Correo; ");
		correo = sc.next();
		System.out.println("Telefono; ");
		telefono = sc.next();
		System.out.println("Matricula;");
		matricula = sc.next();
		sc.close();
	}

}
