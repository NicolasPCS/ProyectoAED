package org.sim.poo;

import java.util.Scanner;

public class Caja {

	private Producto Productos [];
	private int cantProductos;
	
	public Caja(Producto[] productos, int cantProductos) {
		super();
		Productos = productos;
		this.cantProductos = cantProductos;
	}
	
	TipodePago tipopago(String a) {
		
		Scanner entrada = new Scanner(System.in);
		
		a = entrada.nextLine();
		
		return this.tipopago(a);
		
		
	}
	
	
	
}
