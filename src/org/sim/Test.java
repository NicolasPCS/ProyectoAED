package org.sim;

import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.elineales.Stacks.ExceptionIsEmpty;
import org.sim.poo.*;

public class Test {
	public static void main(String[] args) throws ExceptionIsEmpty {//Sistema general
		Scanner s = new Scanner(System.in);
		String opcion;
		int opcion1;
		System.out.println("?Desea abrir el sistema?(Si/No)");
		opcion = s.next();
		while(!opcion.equalsIgnoreCase("No")) {
			System.out.println("<=======BIENVENIDO AL GRAN SISTEMA DE FARMACIAS=======>");
			System.out.println("Por favor Elija el sistema al cual desea acceder:");
			System.out.println("\t1. Clientes\n\t2. Farmaceuticos\n\t3. Farmacias\n\t4. Salir del Sistema");
			opcion1 = s.nextInt();
			switch(opcion1) {
				case 1:
					Clientes();//llama al sistema de clientes
					break;
				case 2:
					Farmaceuticos();//llama al sistema de farmaceuticos
					break;
				case 3:
					Farmacias();//llama al sistema de farmacias
					break;
				case 4:
					System.out.println("Saliendo del sistema, Adios!...");//saliendo del sistema
					opcion = "No";
					break;
			}
		}
	}
	public static void Clientes() throws ExceptionIsEmpty {//Sistema clientes
		Scanner s = new Scanner(System.in);

		ListLinked<Cliente> Sistemacliente = new ListLinked<Cliente>();//Lista enlazada de Clientes que es el sistema de clientes
		String opcion = " ";
		int opcion1 = 0;
		int posicion = 0;
		int opcion2 = 0;
		System.out.println("?Desea cerrar el sistema?(Si/No)");
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
								+ "\n\t4. Ver Carrito \n\t5. Eliminar Productos de carrito \n\t6. Modificar Usuario\n\t7. Ver Recibo\n\t8. Cerrar Sesion");
						opcion2 = s.nextInt();
						switch(opcion2) {
							case 1:
								Sistemacliente.getNodeAt(posicion).getData().agregarProductosCarrito();//crea carrito y agrega productos en el
								break;
							case 2:
								Sistemacliente.getNodeAt(posicion).getData().realizarPago();//realiza pago
								break;
							case 3:
								System.out.println("su billetera tiene: s/"+Sistemacliente.getNodeAt(posicion).getData().getBilletera());//Cuanto dinero tiene el cliente en su billetera
								break;
							case 4:
								System.out.println(Sistemacliente.getNodeAt(posicion).getData().getCarritoCompra());//imprime el carrito
								break;
							case 5:
								Sistemacliente.getNodeAt(posicion).getData().eliminarProductosCar();//elimina productos del carrito
								break;
							case 6:
								Sistemacliente.getNodeAt(posicion).getData().modificarDatos();//modifica datos del cliente
								break;
							case 7:
								Recibo.generarRecibo(Sistemacliente.getNodeAt(posicion).getData(),Sistemacliente.getNodeAt(posicion).getData().getCarritoCompra().getProductos());//genera recibo por la funcion estatica recibo de la clase recibo
								break;
							case 8:
								System.out.println("Cerrando sesion saliendo...");
								break;
						}

					}
					break;
				case 3:
					System.out.println("Saliendo del sistema");
					opcion = "si";
					break;
			}
		}
	}
	@SuppressWarnings("resource")
	public static void Farmacias()//Sistema farmacias
	{
		Scanner ingresar = new Scanner(System.in);
		String opcion;
		int opcion1;
		int opcion2=0;
		int posicion;
		ListLinked<Farmacia> sistema = new ListLinked<Farmacia>();
		System.out.println("Desea cerrar el sistema? (Si/No)");
		opcion = ingresar.nextLine();
		while(!opcion.equalsIgnoreCase("Si")) {
			System.out.println("<=======\tBienvenido al Sistema de la Farmacia\t=======>\n Por favor ingrese una opcion:\n"
					+ "\t1. Ingresar a una Farmacia\n\t2. Agregar una Farmacia\n\t3. Cerrar el sistema");
			opcion1 = ingresar.nextInt();
			while(opcion1 <1 || opcion1 >3){
				System.out.println("Error en la opcion ingresada, por favor vuelva a ingresar la opcion");//valida la opcion
				opcion1 = ingresar.nextInt();
			}
			switch(opcion1) {
				case 1:
					posicion = sistema.search(Farmacia.BusquedaDatosFarm());
					if(posicion == -1) {
						System.out.println("Farmacia no encontrada...");
					}
					else {
						while(opcion2 != 2){
							System.out.println("INGRESO EXITOSO, BIENVENIDO A LA FARMACIA:"+sistema.getNodeAt(posicion).getData().getDirSede()
									+"\nIngrese una de las opciones por favor\n\t1. Ingresar farmaceutico\n\t2. VerFarmaceuticos\n\t3. Ingresar Stock"
									+ "\n\t4. VerReporteStock \n\t5. Cerrar Sesion");
							opcion2 = ingresar.nextInt();
							switch(opcion2) {
								case 1:
									sistema.getNodeAt(posicion).getData().agregarFarmaceutico();//agrega farmaceutico a la lista enlazada de farmaceuticos que es atributo de farmacia
									break;
								case 2:
									System.out.println(sistema.getNodeAt(posicion).getData().getFarmaceuticos());//obtiene la lista de farmaceuticos
									break;
								case 3:
									sistema.getNodeAt(posicion).getData().ingresarstocks();//ingresa stock en la lista enlazada de stocks que es atributo de farmacia
									break;
								case 4:
									Farmacia.listarStock(sistema.getNodeAt(posicion).getData().getStock());//lista el stock dependiendo de lo que quiera
									break;
								case 5:
									System.out.println("Cerrando Sesion");
									break;
							}
						}
					}
					break;
				case 2:
					if(sistema == null) {
						sistema.insertFirst(Farmacia.ingresarDatosFarm());
					}
					else {
						sistema.insertLast(Farmacia.ingresarDatosFarm());//inserta una nueva farmacia
					}
					break;
				case 3:
					System.out.println("Saliendo del Sistema");
					opcion = "Si";
			}
		}
	}
	public static void Farmaceuticos() {//Sistema farmaceuticos
		int opcion;
		int opcion2;
		String opcion1;
		int posicion;
		Scanner ingresar = new Scanner(System.in);
		ListLinked<Farmaceutico> farma = new ListLinked<Farmaceutico>();//lista enlazada de Farmaceutico
		ListLinked<Producto> pro = new ListLinked<Producto>();//lista enlazada de productos
		System.out.println("Desea cerrar el sistema (Si/No)");
		opcion1 = ingresar.nextLine();
		while(!opcion1.equalsIgnoreCase("Si")){
			System.out.println("<=======\tBienvenido al sistema para Farmaceuticos\t=======>\n"
					+ "?Que desea hacer? elija una opcion\n1.Iniciar Sesion\n2.Crear Cuenta\n3.Cerrar Sistema");
			opcion = ingresar.nextInt();
			while(opcion<1 || opcion >3) {
				System.out.println("ingrese una opcion correcta");
				opcion = ingresar.nextInt();
			}
			switch(opcion) {
				case 1:
					posicion = farma.search(Farmaceutico.IniciarSesion());
					if(posicion == -1) {
						System.out.println("El usuaro ingresado no existe");
					}
					else {
						while(opcion != 3) {
							System.out.println("ingreso exitoso! Hola de nuevo: "+farma.getNodeAt(posicion).getData().getNombre()+"\nComo usuario usted puede:\n\t"
									+ "1. Ingresar medicamentos \n\t2. Ver Medicamentos \n\t3. Sacar Reporte \n\t4. Cerrar Sesion");
							opcion2 = ingresar.nextInt();
							switch(opcion2){
								case 1:
									farma.getNodeAt(posicion).getData().RegistrarMedicamentos(pro);//registra medicamento
									break;
								case 2:
									System.out.println("Lista de Productos: \n"+pro);//lista los productos
									break;
								case 3:
									Farmacia.verReporteProductos(pro);//se ve reporte de hashing con encadenamiento
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
	}
}