package org.sim.poo;
import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private String direccion;
	private String FechaNacimiento;
	private String estadoCivil;
	private String correo;
	
	public Persona(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Persona() {
		super();
	}
	
	
	public Persona(String nombre, String apellido, int edad, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
	}

	
	public void nombrePersona(String nombre) {		
		Scanner entrada = new Scanner(System.in);
		nombre = entrada.nextLine();		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void dniPersona(String dniPersona) {		
		Scanner entrada = new Scanner(System.in);
		dniPersona = entrada.nextLine();		
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void estadoCivil(String estadoCivil) {		
		Scanner entrada = new Scanner(System.in);
		estadoCivil = entrada.nextLine();		
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getCorreo() {
		return this.correo;
	}
	
}
