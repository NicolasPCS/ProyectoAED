package org.sim;

import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.elineales.Stacks.ExceptionIsEmpty;
import org.sim.poo.*;

public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        Scanner s = new Scanner(System.in);
    	String opcion;
        int opcion1;
        System.out.println("¿Desea abrir el sistema?(Si/No)");
        opcion = s.next();
        while(!opcion.equalsIgnoreCase("No")) {
	        System.out.println("<=======BIENVENIDO AL GRAN SISTEMA DE FARMACIAS=======>");
	        System.out.println("Por favor Elija el sistema al cual desea acceder:");
	        System.out.println("\t1. Clientes\n\t2. Farmaceuticos\n\t3. Farmacias\n\t4. Salir del Sistema");
	        opcion1 = s.nextInt();
	        switch(opcion1) {
	        case 1:
	        	Clientes();
	        case 2:
	        	Farmaceuticos();
	        case 3:
	        	Farmacias();
	        case 4:
	        	System.out.println("Saliendo del sistema, Adios!...");
	        	opcion = "No";
	        }
        }
    }
