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
	public static void Farmaceuticos() {
	    int opcion;
		int opcion2;
		String opcion1;
		int posicion;
		Scanner ingresar = new Scanner(System.in);
		ListLinked<Farmaceutico> farma = new ListLinked<Farmaceutico>();
		ListLinked<Producto> pro = new ListLinked<Producto>();
		System.out.println("Desea cerrar el sistema (Si/No)");
		opcion1 = ingresar.nextLine();
		while(!opcion1.equalsIgnoreCase("Si")){
	    	System.out.println("<=======\tBienvenido al sistema para Farmaceuticos\t=======>\n"
	    			+ "¿Que desea hacer? elija una opcion\n1.Iniciar Sesion\n2.Crear Cuenta\n3.Cerrar Sistema");
	    	opcion = ingresar.nextInt();
	    	while(opcion<1 || opcion >3) {
	    		System.out.println("ingrese una opcion correcta");
	    		opcion = ingresar.nextInt();
	    	}
	    	switch(opcion) {
	    	case 1:
		    	posicion = farma.search(Farmaceutico.IniciarSesion());
		    	if(posicion == -1) {
		    		System.out.println("El usuario ingresado no existe");
		    	}
		    	else {
		    	while(opcion != 3) {
			    	System.out.println("ingreso exitoso! Hola de nuevo: "+farma.getNodeAt(posicion).getData().getNombre()+"\nComo usuario usted puede:\n\t"
			    			+ "1. Ingresar medicamentos \n\t2. Ver Medicamentos \n\t3. Sacar Reporte \n\t4. Cerrar Sesion");
			    	opcion2 = ingresar.nextInt();
			    	switch(opcion2){
			    	case 1:
			    		farma.getNodeAt(posicion).getData().RegistrarMedicamentos(pro);
			    		break;
			    	case 2:
			    		System.out.println("Lista de Productos: \n"+pro);
			    		break;
			    	case 3:
			    		Farmacia.verReporteProductos(pro);
			    	case 4:
			    		System.out.println("Usted ha cerrado sesion");
			    		break;
			    	}
		    	}
		    	}
		    	break;
	    	case 2:
		    		if(farma == null) {
		    			farma.insertFirst(Farmaceutico.ingresarDatosFarmaceutico());
		    		}
		    		else {
		    			farma.insertLast(Farmaceutico.ingresarDatosFarmaceutico());
		    		}
		    		break;
	    	case 3:
	    		opcion1 = "Si";
	    		break;
	    	}
	    }
		System.out.println("Usted ha salido del sistema, Programa Finalizado...");
