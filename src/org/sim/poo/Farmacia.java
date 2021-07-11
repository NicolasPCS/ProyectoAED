package org.sim.poo;
import java.util.Date;
import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;

public class Farmacia implements Comparable<Farmacia>{
    private int idFarmacia = 0;
    private String dirSede;
    private boolean disponible;
    private String horarioAtencion;
    private String telefono;
	private String producto;
	private Producto producto1;
	public int getIdFarmacia() {
		return idFarmacia;
	}

	public void setIdFarmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public String getDirSede() {
		return dirSede;
	}

	public void setDirSede(String dirSede) {
		this.dirSede = dirSede;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	private ListLinked<Farmaceutico> farmaceuticos;
	public Farmacia() {
	}
	public Farmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}
	public Farmacia(int idFarmacia,String dirSede, String horarioatencion, String telefono) {
        this.idFarmacia = idFarmacia; 
        this.dirSede = dirSede;
        this.disponible = false;
        this.horarioAtencion = horarioatencion;
        this.telefono = telefono;
    }

    /*public void listarProductos() {
    	
    	String Producto;
    	int n = 5;
    	String prods[];
    	
    	Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();


    	Scanner entrada1 = new Scanner(System.in);
		Producto = entrada1.nextLine();


		entrada = new Scanner(System.in);
		producto = entrada.nextLine();

		

    	Scanner entrada11 = new Scanner(System.in);
		Producto = entrada11.nextLine();

		entrada = new Scanner(System.in);



		
    	
    }*/

	@Override
	public String toString() {
		return "Farmacia{" +
				"idFarmacia=" + idFarmacia +
				", dirSede='" + dirSede + '\'' +
				", disponible=" + disponible +
				", horarioAtencion=" + horarioAtencion +
				", telefono='" + telefono + '\'' +
				'}';
	}
}
