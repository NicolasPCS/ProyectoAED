package org.sim.poo;
import java.util.Scanner;

public class Farmaceutico {
	
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
	
	public int ingresoProductos(Producto[] array) {
		
		String pro = "";
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<array.length;i++) {
			
			pro += entrada.nextLine();
			
		}
		
		return array.length;
				
	}

	@Override
	public String toString() {
		return "Farmaceutico [codigo=" + codigo + ", Farmacia=" + Farmacia + ", horaEntrada=" + horaEntrada
				+ ", horaSalida=" + horaSalida + "]";
	}
	
	
	
	
	
}
