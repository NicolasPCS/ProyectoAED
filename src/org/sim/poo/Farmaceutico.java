package org.sim.poo;
import java.util.Date;

import java.util.Scanner;


<<<<<<< HEAD
public class Farmaceutico<T> extends Persona {
	
	private T codigo;
	private T Farmacia;
	private T horaEntrada;
	private T horaSalida;
	
	public Farmaceutico(T nombre, T dni, T codigo, T farmacia, T horaEntrada, T horaSalida) {
		super(nombre, dni);
		this.codigo = codigo;
		Farmacia = farmacia;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	public  Farmaceutico ( String  nombre , String  apellido , int  edad , String  correo ,
			String  farmacia , String  contra ) {
		super (nombre, apellido, edad, correo);
		this.codigo =  1 ;
		this.Farmacia  = farmacia;
		this.contra = contra;
	}
	
	public void IniciarSesion() {
		String usuario;
		String contrase�a;
		
=======
public class Farmaceutico extends Persona {

	private int codigo;
	private String Farmacia;
	private String contra;
	private int horaEntrada;
	private int horaSalida;

	public Farmaceutico(int codigo, String contra) {
		this.codigo=codigo;
		this.contra=contra;
		
				
	}
	public Farmaceutico(String nombre, String apellido, int edad, String correo,
						String farmacia, String contra){
		super(nombre, apellido, edad, correo);
		this.codigo = 1;
		this.Farmacia = farmacia;
		this.contra = contra;
	}


	public Farmaceutico() {
		
	}
	public void IniciarSesion() {
		String usuario;
		String contrasena;

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
		Scanner enter = new Scanner(System.in);

		System.out.println("\nIngrese su Usuario: ");
		usuario = enter.nextLine();
<<<<<<< HEAD
		System.out.println("\nContrase�a: ");
		contrase�a = enter.nextLine();
		
		
	}
	
=======
		System.out.println("\nContraseï¿½a: ");
		contrasena = enter.nextLine();

	}

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
	public void RegistrarMedicamento(Producto pro) {

		Scanner enter = new Scanner(System.in);

		System.out.println("\nREGISTRO DE MEDICAMENTOS");
		System.out.println("\n====================================");

		System.out.println("\nCodigo: ");
		int cod = enter.nextInt();
<<<<<<< HEAD
		pro.setIdProducto(cod);
		
=======
		// pro.setIdProducto(cod);

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
		System.out.println("\nTipo: ");
		String tip = enter.nextLine();
		pro.setTipo(tip);

		System.out.println("\nNombre: ");
		String nomb = enter.nextLine();
		pro.setNombre(nomb);

		System.out.println("\nPrecauciones: ");
		String precau = enter.nextLine();
		pro.setPrecauciones(precau);

		System.out.println("\nFecha Vencimiento : ");
		String fecha = enter.nextLine();
<<<<<<< HEAD
		pro.setFechVen(fecha);
		
=======
		// pro.setFechVen(fecha);

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
		System.out.println("\nCantidad: ");
		int cant = enter.nextInt();
		pro.setCantidad(cant);

		System.out.println("\nPrecio: ");
		double pre = enter.nextDouble();
		pro.setPrecio(pre);
<<<<<<< HEAD
		
		System.out.println("\n�Desea Guardar los datos ingresados?: Si = 0 y No = 1");
=======

		System.out.println("\nï¿½Desea Guardar los datos ingresados?: Si = 0 y No = 1");
>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
		int res = enter.nextInt();
		if (res==0) {
			System.out.println("\nSe guardaron correctamente los datos ingresados.");
		}
		else {
			System.out.println("\nNo se guardaron los datos ingresados.");

		}

	}

	public void VerMedicamentos(Producto pro) {

		System.out.println("\nIMPRESION RELACION DE MEDICAMENTOS");
		System.out.println("\n====================================");

		System.out.println("\nCodigo: ");
<<<<<<< HEAD
		int id = pro.getIdProducto();
		System.out.println(id);
		
=======
		// int id = pro.getIdProducto();
		// System.out.println(id);

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
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
<<<<<<< HEAD
		String fecha = pro.getFechVen();
		System.out.println(fecha);
		
=======
		// String fecha = pro.getFechVen();
		// System.out.println(fecha);

>>>>>>> fbeb86bb3fe6adf78d8661c74729d08888deb56d
		System.out.println("\nCantidad: ");
		int cant = pro.getCantidad();
		System.out.println(cant);

		System.out.println("\nPrecio: ");
		double pre = pro.getPrecio();
		System.out.println(pre);

	}




	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFarmacia() {
		return Farmacia;
	}

	public void setFarmacia(String farmacia) {
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
	public boolean equals(Object obj) {
		if(obj instanceof Farmaceutico ) {
			Farmaceutico f = (Farmaceutico) obj;
			if(this.codigo==f.codigo && this.contra.equals(f.contra))return true;
			return false;
			
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " Farmaceutico [codigo=" + codigo + ", Farmacia=" + Farmacia + ", horaEntrada=" + horaEntrada
				+ ", horaSalida=" + horaSalida + "]";
	}





}
