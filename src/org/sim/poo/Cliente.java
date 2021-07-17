package org.sim.poo;

import java.util.Arrays;
import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.elineales.Stacks.ExceptionIsEmpty;
import org.sim.elineales.Stacks.LinkedStack;
import java.math.*;
@SuppressWarnings("unused")
public class Cliente extends Persona {
	private Carrito carritoCompra;//carrito compra para cliente que contiene lista dentro de ella, cliente maneja el carrito
	private int Caja;//numero de caja que se da al azar
	private String usuario;//cliente tiene un usuario que tiene guardado la cantidad de dinero que tiene
	private String password;
	private double billetera;//dinero que tiene el cliente en el sistema
	public double getBilletera() {
		return billetera;
	}
	public void setBilletera(double billetera) {
		this.billetera = billetera;
	}
	public Carrito getCarritoCompra() {
		return carritoCompra;
	}
	public void setCarritoCompra(Carrito carritoCompra) {
		this.carritoCompra = carritoCompra;
	}
	public int getCaja() {
		return Caja;
	}
	public void setCaja(int caja) {
		Caja = caja;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String apellido, int edad, String correo ,String usuario,String password,double billetera) {
		super(nombre, apellido, edad, correo);
		this.usuario = usuario;
		this.password = password;
		this.billetera = billetera;
		this.carritoCompra = new Carrito(Cliente.this);
		this.Caja = (int)(Math.random()*5+1);
	}
	public Cliente(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	public static Cliente AgregarClienteNuevo() {//funcion estatica que agrega un cliente nuevo a la lista enlazada de clientes en el main Test
		Scanner in = new Scanner(System.in);
		String opcion;
		System.out.println("<=======\tCliente Nuevo\t=======>");
		System.out.println("Ingrese Nombre");
		String nombre = in.next();
		System.out.println("Ingrese Apellidos");
		String apellido = in.next();
		System.out.println("Ingrese edad");
		int edad = in.nextInt();
		System.out.println("Ingrese correo");
		String correo = in.next();
		System.out.println("Ingrese usuario");
		String usuario = in.next();
		System.out.println("Ingrese la cantidad de dinero que desea depositar a su billetera");
		double billetera = in.nextDouble();
		System.out.println("Ingrese password");
		String password = in.next();
		System.out.println("Por favor confirme su contrase�a");
		String password1 = in.next();
		while(!password.equals(password1)) {
			System.out.println("Su contrase�a no concuerta por favor ingresela de nuevo");
			password1 = in.next();
		}
		System.out.println("Desea guardar los datos ingresados?(Si/No)");
		opcion = in.next();
		while(!(opcion.equalsIgnoreCase("No") || opcion.equalsIgnoreCase("Si"))) {
			System.out.println("respuesta incorrecta, Por favor ingrese (Si/No)");
			opcion = in.next();
		}
		if(opcion.equalsIgnoreCase("Si")) {
			System.out.println("Datos guardados correctamente");
			return new Cliente(nombre,apellido,edad,correo,usuario,password,billetera);
		}
		else {
			System.out.println("Datos no guardados");
			return null;
		}
	}
	public static Cliente Login(){//funcion estatica que devuelve un tipo cliente y en el main se comparan entre si para verificar si el usuario existe
		Scanner in = new Scanner(System.in);
		System.out.println("<=======\tIniciando sesion\t========>");
		System.out.println("Ingrese Usuario");
		String usuario = in.next();
		System.out.println("Ingrese contrase�a");
		String password = in.next();
		return new Cliente(usuario,password);
	}
	private static Producto agregarProductosCar() {//funcion estatica que devuelve un producto
		Scanner in = new Scanner(System.in);
		System.out.println("<=======\tAgregando Productos al Carrito\t=======>");
		System.out.println("Ingrese nombre Producto");
		String nombre = in.next();
		System.out.println("Ingrese cantidad de productos");
		int cantidad = in.nextInt();
		System.out.println("Ingrese precio");
		double precio = in.nextDouble();
		return new Producto(nombre,cantidad,precio);
	}
	public void agregarProductosCarrito() {//funcion que llama a la funcion anterior para almacenar los productos ingresados
		this.carritoCompra.getProductos().push(Cliente.agregarProductosCar());
	}
	public void modificarDatos() {//Modifica datos del cliente
		Scanner s = new Scanner(System.in);
		int opcion = 0;
		String opcion1;
		while(opcion != 6) {
			System.out.println("<=======\tModificacion de Datos\t=======>");
			System.out.println("Usuario: "+this.usuario);
			System.out.println("Contrase�a: "+this.password);
			System.out.println("Nombre: "+this.getNombre());
			System.out.println("Apellido: "+this.getApellido());
			System.out.println("Correo: "+this.getCorreo());
			System.out.println("Edad: "+this.getEdad());
			System.out.println("Ingrese el numero que desea modificar:");
			System.out.println("\t1.Usuario\n\t2.Password\n\t3.Nombre\n\t\4.Apellido\n\t5.Correo\n\t6. Salir");
			opcion = s.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Por favor ingrese su nuevo usuario");
					this.usuario = s.next();
					System.out.println("Su nuevo usuario es: "+this.usuario+" esto es correcto?(Si/No)");
					opcion1 = s.next();
					while(opcion1.equalsIgnoreCase("No")) {
						System.out.println("Ingrese nuevamente su nuevo usuario por favor");
						this.usuario = s.next();
						System.out.println("Su nuevo usuario es: "+this.usuario+" esto es correcto?(Si/No)");
						opcion1 = s.next();
					}
					System.out.println("Modificacion realizada con exito!");
					break;
				case 2:
					System.out.println("Por favor ingrese su nueva contrase�a");
					this.password = s.next();
					System.out.println("Su nueva contrase�a es: "+this.password+" esto es correcto?(Si/No)");
					opcion1 = s.next();
					while(opcion1.equalsIgnoreCase("No")) {
						System.out.println("Ingrese nuevamente su nueva contrase�a por favor");
						this.password = s.next();
						System.out.println("Su nueva contrase�a es: "+this.password+" esto es correcto?(Si/No)");
						opcion1 = s.next();
					}
					System.out.println("Modificacion realizada con exito!");
					break;
				case 3:
					System.out.println("Por favor ingrese su nuevo Nombre");
					this.setNombre(s.next());
					System.out.println("Su nuevo Nombre es: "+this.getNombre()+" esto es correcto?(Si/No)");
					opcion1 = s.next();
					while(opcion1.equalsIgnoreCase("No")) {
						System.out.println("Ingrese nuevamente su nuevo Nombre por favor");
						this.setNombre(s.next());
						System.out.println("Su nuevo Nombre es: "+this.getNombre()+" esto es correcto?(Si/No)");
						opcion1 = s.next();
					}
					System.out.println("Modificacion realizada con exito!");
					break;
				case 4:
					System.out.println("Por favor ingrese su nuevo Apellido");
					this.setApellido(s.next());
					System.out.println("Su nuevo Apellido es: "+this.getApellido()+" esto es correcto?(Si/No)");
					opcion1 = s.next();
					while(opcion1.equalsIgnoreCase("No")) {
						System.out.println("Ingrese nuevamente su nuevo Apellido por favor");
						this.setApellido(s.next());
						System.out.println("Su nuevo Apellido es: "+this.getApellido()+" esto es correcto?(Si/No)");
						opcion1 = s.next();
					}
					System.out.println("Modificacion realizada con exito!");
					break;
				case 5:
					System.out.println("Por favor ingrese su nuevo Correo");
					this.setCorreo(s.next());
					System.out.println("Su nuevo Correo es: "+this.getCorreo()+" esto es correcto?(Si/No)");
					opcion1 = s.next();
					while(opcion1.equalsIgnoreCase("No")) {
						System.out.println("Ingrese nuevamente su nuevo Correo por favor");
						this.setCorreo(s.next());
						System.out.println("Su nuevo Correo es: "+this.getCorreo()+" esto es correcto?(Si/No)");
						opcion1 = s.next();
					}
					System.out.println("Modificacion realizada con exito!");
					break;
				case 6:
					System.out.println("Saliendo de modificacion de datos");
					break;
			}
		}
	}
	public void eliminarProductosCar() throws ExceptionIsEmpty {//elimina productos de la Pila de Productos de carrito y te pregunta cuantos productos deseas eliminar
		Scanner in = new Scanner(System.in);
		System.out.println("Cuantos productos desea eliminar?");
		int i = in.nextInt();
		while(!carritoCompra.getProductos().isEmpty()||i == 0) {
			System.out.println("Borrando: "+this.carritoCompra.getProductos().top());
			this.carritoCompra.getProductos().pop();
			i--;
		}
		if(i>0) {
			System.out.println("la cantidad ingresada es mayor a la que se ingreso al carrito...");
			return;
		}
		else {
			System.out.println("eliminacion finalizada");
		}
	}

	public void realizarPago() throws ExceptionIsEmpty {//se hace el pago
		double sum = 0;
		System.out.println("<=======\nCalculando Pago\n======>");
		Producto aux = new Producto();
		while(!carritoCompra.getProductos().isEmpty()) {
			aux = carritoCompra.getProductos().pop();
			sum += aux.getPrecio()*aux.getCantidad();
		}
		System.out.println("El total es: "+sum);
		System.out.println("Su billetera tiene: "+this.billetera);
		if(sum > billetera) {
			System.out.println("No tiene dinero suficiente");
		}
		else {
			this.billetera = billetera-sum;
			System.out.println("Carrito pagado con exito! su vuelto es:"+billetera);
		}
	}
	public boolean equals(Object o) {//Compara cliente por su usuario y contrase�a para hallar al cliente por su usuario y contrase�a en el login
		if(o instanceof Cliente) {
			Cliente a = (Cliente) o;
			if(this.getUsuario().equalsIgnoreCase(a.getUsuario())&& this.password.equals(a.password)) {
				return true;
			}
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Cliente{" +
				"carritoCompra=" + carritoCompra.toString() +
				'}';
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
