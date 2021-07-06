package src.org.sim.elineales.Listas;

import java.util.*;

import src.org.sim.poo.Persona;
import src.org.sim.poo.Producto;

public class Test {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		TDAList <T> clientes = new ListLinked <T> ();
		
		Scanner entrada = new Scanner(System.in);
		/*T c1 = new Persona();
		System.out.print("Digite el Nombre: ");
		c1 = (T) entrada.next();
		T c2;
		System.out.print("Digite el Nombre2: ");
		c2 = (T) entrada.next();
		T c3;
		System.out.print("Digite el Nombre3: ");
		c3 = (T) entrada.next();
		clientes.insertFirst(c1);
		clientes.insertLast(c2);
		clientes.insertLast(c3);
		System.out.println(clientes);*/
		

		System.out.print("\tCodigo del producto: ");
		int codigo = entrada.nextInt();
		System.out.print("\tNombre del producto: ");
		String nombre = entrada.next();
		System.out.print("\tTipo del producto: ");
		String tipo = entrada.next();
		System.out.print("\tPrecauciones del producto: ");
		String precauciones = entrada.next();
		System.out.print("\tPrecio del producto: ");
		double precio = entrada.nextDouble();
		System.out.print("\tFecha de vencimiento (dd-mm-aaaa): ");
		String fechaVen = entrada.next();
		System.out.print("\tCantidad de productos a ingresar: ");
		int cantidad = entrada.nextInt();
		Producto P = new Producto(codigo, nombre, tipo, precauciones, precio, fechaVen, cantidad);
		System.out.println(P); 
		//Producto(codigo, nombre, tipo, precauciones, precio, fechaVen, cantidad);
			
	}
}


