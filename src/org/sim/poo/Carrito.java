package org.sim.poo;

import java.util.Scanner;

public class Carrito implements TipodePago{

	private Producto Productos [];
	private int cantProductos;
	
	public Carrito(Producto[] productos, int cantProductos) {
		super();
		Productos = productos;
		this.cantProductos = cantProductos;
	}
	
	TipodePago tipopago(String a) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nIngrese el Tipo de Pago: ");
		a = entrada.nextLine();
		
		return this.tipopago(a);
		
		
	}

	@Override
	public boolean transferenciaBancaria() {
		// TODO Auto-generated method stub
		
		return true;
		
	}

	@Override
	public boolean tarjetaCredito() {
		// TODO Auto-generated method stub
		
		return true;
		
	}

	@Override
	public boolean generarFactura() {
		// TODO Auto-generated method stub
		
		return true;
		
	}
	
	
	
}
