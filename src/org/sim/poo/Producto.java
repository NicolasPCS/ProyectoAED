package org.sim.poo;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Producto implements Comparable<Producto>{
    private String codigo;
    private String nombre;
    private String tipo;
    private String precauciones;
    private double precio;
    private String fechaVencimiento;
    private int cantidad;

    public Producto() {}

    public Producto(String codigo, String nombre, String tipo, String precauciones, double precio, String fechaVencimiento, int cantidad) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precauciones = precauciones;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
    }
    public Producto(String nombre, int cantidad, double precio) {
    	this.nombre = nombre;
    	this.cantidad = cantidad;
    	this.precio = precio;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrecauciones() {
		return precauciones;
	}

	public void setPrecauciones(String precauciones) {
		this.precauciones = precauciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static Producto ingresarDatosProd() {
		Scanner s = new Scanner(System.in);
		System.out.print("\tCodigo del producto: ");
		String codigo = s.nextLine();
		System.out.print("\tNombre del producto: ");
		String nombre = s.nextLine();
		System.out.print("\tTipo del producto: ");
		String tipo = s.nextLine();
		System.out.print("\tPrecauciones del producto: ");
		String precauciones = s.nextLine();
		System.out.print("\tPrecio del producto: ");
		double precio = s.nextDouble();
		System.out.print("\tFecha de vencimiento (dd-mm-aaaa): ");
		String fechaVen = s.next();
		System.out.print("\tCantidad de productos a ingresar: ");
		int cantidad = s.nextInt();

		return new Producto(codigo, nombre, tipo, precauciones, precio, fechaVen, cantidad);
    }
    public void mostrarDatosProd(int idProd) {
    		
    }

    public void eliminarProd(int idProd) {
    	
    }

	@Override
	public String toString() {
		return "Producto{" +
				"codigo='" + codigo + '\'' +
				", nombre='" + nombre + '\'' +
				", tipo='" + tipo + '\'' +
				", precauciones='" + precauciones + '\'' +
				", precio=" + precio +
				", fechaVencimiento='" + fechaVencimiento + '\'' +
				", cantidad=" + cantidad +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Producto producto = (Producto) o;
		return Objects.equals(codigo, producto.codigo) && Objects.equals(nombre, producto.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.codigo.compareTo(o.codigo);
	}


}

