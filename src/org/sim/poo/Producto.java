package org.sim.poo;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Producto {
	private int codigo;
	private String nombre;
	private String tipo;
	private String precauciones;
	private double precio;
	private String fechaVencimiento;
	private int cantidad;

	public Producto() {}
	public Producto(int codigo) {this.codigo = codigo;}

	public Producto(int codigo, String nombre, String tipo, String precauciones, double precio, String fechaVencimiento, int cantidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precauciones = precauciones;
		this.precio = precio;
		this.fechaVencimiento = fechaVencimiento;
		this.cantidad = cantidad;
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

	public Producto ingresarDatosProd() {
		Scanner s = new Scanner(System.in);
		System.out.print("\tCodigo del producto: ");
		int codigo = s.nextInt();
		System.out.print("\tNombre del producto: ");
		String nombre = s.next();
		System.out.print("\tTipo del producto: ");
		String tipo = s.next();
		System.out.print("\tPrecauciones del producto: ");
		String precauciones = s.next();
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
		return codigo == producto.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
}
