package conpectos;

import java.net.PortUnreachableException;

public class Empleado {

	private String nombre;
	
	private String seccion;
	
	private double sueldo;
	
	public Empleado () {
		this.nombre = "Anna";
		this.sueldo = 20000.00;
		this.seccion = "Administracio";
	}

	public Empleado (String nom, double sou){
		this.nombre = nom;
		this.sueldo = sou;
		this.seccion = "Admin";
		
	}
	
	public Empleado (String nom, double sou, String seccio){
		
	}
	
	//metodo que nos devuelve el nombre
	public String dameNombre(){
		return nombre;
	}
	
	//metodo que nos devuelve la seccion
	public String dameSeccion(){
		return seccion;
	}
	
	//metodo que nos devuelve el sueldo
	public double dameSueldo(){
		return sueldo;
	}
	
	public void subeSueldo(int porcentaje){
		
		sueldo +=(sueldo * porcentaje) / 100;
		// sueldo=sueldo+sueldo*porcentage;		
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
