package org.sim.poo;
import java.util.Scanner;

<<<<<<< HEAD
public class Persona <T> {
	
	private T nombre;
	private T dni;
	private T edad;
	private T direccion;
	private T FechaNacimiento;
	private T estadoCivil;
	
	public Persona(T nombre, T dni, T edad, T correo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
=======
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
	
	 
>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
	}
	public Persona() {
		super();
	}
<<<<<<< HEAD

	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", direccion=" + direccion
				+ ", FechaNacimiento=" + FechaNacimiento + ", estadoCivil=" + estadoCivil + "]";
	}
=======


	public Persona(String nombre, String apellido, int edad, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
	}

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d

	public String getNombre() {
		return this.nombre;
	}
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
<<<<<<< HEAD
	
	public void dniPersona(String dniPersona) {		
		Scanner entrada = new Scanner(System.in);
		dniPersona = entrada.nextLine();		
=======

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
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
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

<<<<<<< HEAD
	public T getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(T fechaNacimiento2) {
		FechaNacimiento = fechaNacimiento2;
=======
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreo() {
		return this.correo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad
				+ ", direccion=" + direccion + ", FechaNacimiento=" + FechaNacimiento + ", estadoCivil=" + estadoCivil
				+ ", correo=" + correo + "]";
>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
	}
	
	

}
