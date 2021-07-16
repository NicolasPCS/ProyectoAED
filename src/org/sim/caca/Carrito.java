package org.sim.poo;

import java.util.Scanner;

import org.sim.elineales.Stacks.LinkedStack;

public class Carrito implements TipodePago{

	private LinkedStack<Producto> productos= new LinkedStack<Producto>();
	private int cantProductos;
	public Carrito(LinkedStack<Producto> productos, int cantProductos) {
		super();
		this.productos = productos;
		this.cantProductos = cantProductos;
	}
	Cliente cliente;
	public Carrito() {
		
	}
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
	}
	TipodePago tipopago(String a) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nIngrese el Tipo de Pago Elija una opcion");
		a = entrada.nextLine();
		
		return this.tipopago(a);
	}
	
	@Override
	public boolean transferenciaBancaria() {
		return true;
		
	}

	@Override
	public boolean tarjetaCredito() {
		
		return true;
		
	}

	@Override
	public boolean generarFactura() {
		
		return true;
		
	}

	public LinkedStack<Producto> getProductos() {
		return productos;
	}
	public void setProductos(LinkedStack<Producto> productos) {
		this.productos = productos;
	}
	public String toString() {
		return "Carrito de: "+cliente.getNombre()+ ": "+productos;
	}
}
