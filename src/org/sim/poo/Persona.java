package src.org.sim.poo;
import java.util.Scanner;

public class Persona <T> {
	
<<<<<<< HEAD
	private T nombre;
	private T dni;
	private T edad;
	private T direccion;
	private T FechaNacimiento;
	private T estadoCivil;
=======
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private String direccion;
	private String FechaNacimiento;
	private String estadoCivil;
	private String correo;
>>>>>>> 21255626845985a4bfeeba9bb0812b8cd62f1273
	
	public Persona(T nombre, T dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Persona(T nombre, T dni, T edad, T direccion, T fechaNacimiento, T estadoCivil) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.direccion = direccion;
		setFechaNacimiento(fechaNacimiento);
		this.estadoCivil = estadoCivil;
	}
	
	
	public Persona(String nombre, String apellido, int edad, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", direccion=" + direccion
				+ ", FechaNacimiento=" + FechaNacimiento + ", estadoCivil=" + estadoCivil + "]";
	}

	public void nombrePersona(T nombre) {		
		Scanner entrada = new Scanner(System.in);
		nombre = (T) entrada.nextLine();		
	}
	
	public T getNombre() {
		return nombre;
	}

	public void setNombre(T nombre) {
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

	public T getDni() {
		return dni;
	}

	public void setDni(T dni) {
		this.dni = dni;
	}

	public T getEdad() {
		return edad;
	}

	public void setEdad(T edad) {
		this.edad = edad;
	}

	public T getDireccion() {
		return direccion;
	}

	public void setDireccion(T direccion) {
		this.direccion = direccion;
	}
	
	public void estadoCivil(T estadoCivil) {		
		Scanner entrada = new Scanner(System.in);
		estadoCivil = (T) entrada.nextLine();		
	}

	public T getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(T estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public T getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(T fechaNacimiento2) {
		FechaNacimiento = fechaNacimiento2;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getCorreo() {
		return this.correo;
	}
	
}
