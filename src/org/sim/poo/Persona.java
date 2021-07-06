package src.org.sim.poo;
import java.util.Scanner;

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
	
	
}
