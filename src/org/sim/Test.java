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
public static void Clientes() throws ExceptionIsEmpty {
	Scanner s = new Scanner(System.in);
	
	ListLinked<Cliente> Sistemacliente = new ListLinked<Cliente>();
	String opcion = " ";
	int opcion1 = 0;
	int posicion = 0;
	int opcion2 = 0;
	System.out.println("¿Desea cerrar el sistema?(Si/No)");
	opcion = s.next();
	while(!opcion.equalsIgnoreCase("Si")) {
        System.out.println("<=======INICIANDO EL SISTEMA PARA CLIENTES======>");
        System.out.println(""" 
                Bienvenido al sistema de clientes, Por favor ingrese una opcion:
                \t1. Crear una cuenta
                \t2. IniciarSesion
                \t3. Salir del sistema
                """);
        opcion1 = s.nextInt();
        switch(opcion1){
        	case 1:
        		Sistemacliente.insertLast(Cliente.AgregarClienteNuevo());
        		break;
        	case 2:
        		posicion = Sistemacliente.search(Cliente.Login());
        		if(posicion == -1) {
        			System.out.println("Usuario no encontrado");
        		}
        		else {
        			System.out.println("Bienvenido de nuevo: "+Sistemacliente.getNodeAt(posicion).getData().getUsuario()+
        					"Por favor elija una de las opciones \n\t1.Agregar Productos al carrito \n\t2.Realizar Pago \n\t3.Ver Billetera"
        					+ "\n\t4. Ver Carrito \n\t5. Eliminar Productos de carrito \n\t6. Cerrar Sesion");
        			opcion2 = s.nextInt();
        			switch(opcion2) {
        			case 1:
        				Sistemacliente.getNodeAt(posicion).getData().agregarProductosCarrito();
        			case 2:
        				Sistemacliente.getNodeAt(posicion).getData().realizarPago();
        			case 3:
        				System.out.println("su billetera tiene: s/"+Sistemacliente.getNodeAt(posicion).getData().getBilletera());
        			case 4:
        				System.out.println(Sistemacliente.getNodeAt(posicion).getData().getCarritoCompra());
        			case 5:
        				Sistemacliente.getNodeAt(posicion).getData().eliminarProductosCar();
        			case 6:
        				System.out.println("Cerrando sesion saliendo...");
        			}

        		}
        		break;
        	case 3:
        		System.out.println("Saliendo del sistema");
        		opcion = "si";
        }
	}
}
