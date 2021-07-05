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
		this.nombre=nombre;
		this.dni=dni;
	
	 
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
