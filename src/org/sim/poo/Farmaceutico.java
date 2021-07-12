package org.sim.poo;
import java.util.Date;

import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;


public class Farmaceutico extends Persona implements Comparable<Farmaceutico>{
	
	private String codigo;
	private Farmacia Farmacia;
	private int horaEntrada;
	private int horaSalida;
	private String password;
	
	public Farmaceutico(String codigo, Farmacia farmacia, int horaEntrada, int horaSalida) {
		super();
		this.codigo = codigo;
		Farmacia = farmacia;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	
	public Farmaceutico(String nombre, String apellido, int edad, String correo, 
			Farmacia farmacia,String contra){
		super(nombre, apellido, edad, correo);
		this.Farmacia = farmacia;
		this.password = contra;
	}
	public Farmaceutico(String nombre, String apellido, int edad, String correo,String contra){
		super(nombre, apellido, edad, correo);
		this.password = contra;
	}
	public Farmaceutico(String codigo,String nombre, String apellido, int edad, String correo,String contra){
		super(nombre, apellido, edad, correo);
		this.codigo = codigo;
		this.password = contra;
	}
	public Farmaceutico(String codigo,String nombre, String apellido, int edad,String correo) {
		super(nombre,apellido,edad,correo);
		this.codigo = codigo;
	}
	public Farmaceutico() {
		super();
	}
	public Farmaceutico(String codigo) {
		this.codigo = codigo;
	}
	
	public Farmaceutico(String codigo2, String nombre, String apellido, int edad, String correo,
			Farmacia farmacia, String contra) {
		// TODO Auto-generated constructor stub
		super(nombre,apellido,edad,correo);
		this.codigo = codigo2;
		this.password = contra;
	}

	@SuppressWarnings("resource")
	public static Farmaceutico IniciarSesion() {
		String usuario;
		//String password;
		
		Scanner enter = new Scanner(System.in);
		System.out.println("<======\tINICIANDO SESION FARMACEUTICO\t======>");
		System.out.println("Ingrese su Codigo de farmaceutico: ");
		usuario = enter.nextLine();
		/*while(!f.codigo.equalsIgnoreCase(usuario)) {
			System.out.println("Codigo no encontrado, ingrese de nuevo");
			usuario = enter.nextLine();
		}*/
		/*System.out.println("Contraseña: ");
		password = enter.nextLine();*/
		/*while(!f.password.equals(password)) {
			System.out.println("contraseña incorrecta, ingresela de nuevo");
			password = enter.nextLine();
		}*/
		return new Farmaceutico(usuario);
	}
	
	
	@SuppressWarnings("resource")
	public static Producto RegistrarMedicamento() {
		
		Scanner enter = new Scanner(System.in);		
			System.out.println("\nREGISTRO DE MEDICAMENTOS");
			System.out.println("\n====================================");
			System.out.println("\nCodigo: ");
			String cod = enter.nextLine();
			System.out.println("\nTipo: ");
			String tip = enter.nextLine();
			System.out.println("\nNombre: ");
			String nomb = enter.nextLine();
			System.out.println("\nPrecauciones: ");
			String precau = enter.nextLine();
			
			System.out.println("\nFecha Vencimiento : ");
			String fecha = enter.nextLine();
			
			System.out.println("\nCantidad: ");
			int cant = enter.nextInt();
			
			System.out.println("\nPrecio: ");
			double pre = enter.nextDouble();
			
			System.out.println("\nDesea Guardar los datos ingresados?: Si = 0 y No = 1");
			int res = enter.nextInt();
			if (res==0) {
				System.out.println("\nSe guardaron correctamente los datos ingresados.");
			}
			else {
				System.out.println("\nNo se guardaron los datos ingresados.");
				
			}
			return new Producto(cod, nomb, tip, precau, pre, fecha, cant);
	}
	@SuppressWarnings("null")
	public void RegistrarMedicamentos(ListLinked<Producto> pro) {
		if(pro == null) {
			pro.insertFirst(Farmaceutico.RegistrarMedicamento());
		}
		else {
			pro.insertLast(Farmaceutico.RegistrarMedicamento());
		}
	}
	@SuppressWarnings("resource")
	public static Farmaceutico ingresarDatosFarmaceutico() {
		Scanner s = new Scanner(System.in);
		System.out.println("<=======\tNUEVO FARMACEUTICO\t=======>");
		System.out.println("\tCodigo del Farmaceutico: ");
		String codigo = s.next();
		System.out.println("\tNombre del Farmaceutico: ");
		String nombre = s.next();
		System.out.println("\tApellido del farmaceutico: ");
		String apellido = s.next();
		System.out.println("\tEdad del farmaceutico: ");
		int edad = s.nextInt();
		System.out.println("\tCorreo del farmaceutico: ");
		String correo = s.next();
		System.out.println("\tIngrese su contraseña: ");
		String pass = s.next();
		return new Farmaceutico(codigo, nombre, apellido, edad, correo,pass);
    }
	public void VerMedicamentos(Producto pro) {
		
		System.out.println("\nIMPRESION RELACION DE MEDICAMENTOS");
		System.out.println("\n====================================");
		
		System.out.println("\nCodigo: ");
		String id = pro.getCodigo();
		System.out.println(id);
		
		System.out.println("\nTipo: ");
		String tip = pro.getTipo();
		System.out.println(tip);
		
		System.out.println("\nNombre: ");
		String nomb = pro.getNombre();
		System.out.println(nomb);
		
		System.out.println("\nPrecauciones: ");
		String precau = pro.getPrecauciones();
		System.out.println(precau);
		
		System.out.println("\nFecha Vencimiento : ");
		String fecha = pro.getFechaVencimiento();
		System.out.println(fecha);
		
		System.out.println("\nCantidad: ");
		int cant = pro.getCantidad();
		System.out.println(cant);
		
		System.out.println("\nPrecio: ");
		double pre = pro.getPrecio();
		System.out.println(pre);
		
	}
	
	@SuppressWarnings("resource")
	public void CrearCuenta() {
		String usuario;
		String password;
		String opcion;
		do {
		Scanner enter = new Scanner(System.in);
		System.out.println("<=============\tNuevo Usuario\t=============>");
		System.out.println("\nIngrese su codigo de farmaceutico: ");
		usuario = enter.nextLine();
		this.setCodigo(usuario);
		System.out.println("\nIngrese Contraseña: ");
		password = enter.nextLine();
		this.setPassword(password);
		System.out.println("Confirme su contraseña");
		password = enter.nextLine();
		while(!this.password.equals(password)) {
			System.out.println("La contraseña no coincide vuelva a ingresarla");
			password = enter.nextLine();
		}
		System.out.println("Desea Guardar los datos ingresados?(Si/No)");
		opcion = enter.nextLine();
		}while(!opcion.equalsIgnoreCase("Si"));
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Farmacia getFarmacia() {
		return Farmacia;
	}

	public void setFarmacia(Farmacia farmacia) {
		Farmacia = farmacia;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Farmaceutico) {
			Farmaceutico a = (Farmaceutico) o;
			return this.codigo.equals(a.codigo);
		}
		else {
			return false;
		}
	}
	public boolean equals(Farmaceutico o) {
		if(this.codigo.compareTo(o.codigo)==0) { 
			return true;
		}
		return false;
	}
	public int compareTo(Farmaceutico o) {
		// TODO Auto-generated method stub
		return this.codigo.compareTo(o.getCodigo());
	}
	@Override
	public String toString() {
		return "Farmaceutico [codigo=" + codigo + ", Farmacia=" + Farmacia + ", horaEntrada=" + horaEntrada
				+ ", horaSalida=" + horaSalida + "]";
	}

	/*public boolean equals(Farmaceutico o) {
		if(this.Farmacia.equals(o.Farmacia)&&this.codigo.equals(o.codigo)) return true;
		return false;
	}*/
	
	
	
	
	
	
}
