package src.org.sim.elineales.Listas;

import java.util.Scanner;

import src.org.sim.poo.Persona;

public class Test {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		TDAList <T> C1 = new ListLinked <T> ();
		
		Scanner entrada = new Scanner(System.in);
		T nombre;
		System.out.print("Digite el Nombre: ");
		nombre = (T) entrada.next();
		
		Scanner entrada1 = new Scanner(System.in);
		T DNI;
		System.out.print("Digite el DNI: ");
		DNI = (T) entrada1.next();
		
		Scanner entrada2 = new Scanner(System.in);
		T Edad;
		System.out.print("Digite su Edad: ");
		Edad = (T) entrada2.next();
		
		Scanner entrada3 = new Scanner(System.in);
		T Direccion;
		System.out.print("Digite su Direccion: ");
		Direccion = (T) entrada3.next();
		
		Scanner entrada4 = new Scanner(System.in);
		T Fnacimiento;
		System.out.print("Digite su Fecha de Nacimiento: ");
		Fnacimiento = (T) entrada4.next();
		
		Scanner entrada5 = new Scanner(System.in);
		T Ecivil;
		System.out.print("Digite su Estado Civil: ");
		Ecivil = (T) entrada.next();
		
		Persona Cliente1 = new Persona (nombre, DNI, Edad, Direccion, Fnacimiento, Ecivil);
		System.out.println(Cliente1);
		

	}
}


