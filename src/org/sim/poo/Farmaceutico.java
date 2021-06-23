package org.sim.poo;
import java.util.Date;

import java.util.Scanner;


public class Farmaceutico extends Persona {
	
	private int codigo;
	private String Farmacia;
	private int horaEntrada;
	private int horaSalida;
	
	public Farmaceutico(int codigo, String farmacia, int horaEntrada, int horaSalida) {
		super();
		this.codigo = codigo;
		Farmacia = farmacia;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	
	public Farmaceutico() {
		super();
	}
	
	public void IniciarSesion() {
		String usuario;
		String contrasena;
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("\nIngrese su Usuario: ");
		usuario = enter.nextLine();
		System.out.println("\nContrase�a: ");
		contrasena = enter.nextLine();
		
		
	}
	
	public void RegistrarMedicamento(Producto pro) {
		
		Scanner enter = new Scanner(System.in);
				
		System.out.println("\nREGISTRO DE MEDICAMENTOS");
		System.out.println("\n====================================");
		
		System.out.println("\nCodigo: ");
		int cod = enter.nextInt();
		// pro.setIdProducto(cod);
		
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
		// pro.setFechVen(fecha);
		
		System.out.println("\nCantidad: ");
		int cant = enter.nextInt();
		pro.setCantidad(cant);
		
		System.out.println("\nPrecio: ");
		double pre = enter.nextDouble();
		pro.setPrecio(pre);
		
		System.out.println("\n�Desea Guardar los datos ingresados?: Si = 0 y No = 1");
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
		// int id = pro.getIdProducto();
		// System.out.println(id);
		
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
		// String fecha = pro.getFechVen();
		// System.out.println(fecha);
		
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
	public String toString() {
		return "Farmaceutico [codigo=" + codigo + ", Farmacia=" + Farmacia + ", horaEntrada=" + horaEntrada
				+ ", horaSalida=" + horaSalida + "]";
	}
	
	
	
	
	
}
