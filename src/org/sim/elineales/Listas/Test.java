package src.org.sim.elineales.Listas;

import java.util.*;

import src.org.sim.poo.Persona;

public class Test {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		TDAList <T> clientes = new ListLinked <T> ();
		
		Scanner entrada = new Scanner(System.in);
		T c1;
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
		
		System.out.println(clientes);
			
	}
}


