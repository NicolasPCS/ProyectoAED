package src.org.sim.poo;

import java.util.Arrays;
import java.util.Scanner;

import src.org.sim.elineales.Listas.ListLinked;
import src.org.sim.elineales.Stacks.ExceptionIsEmpty;
import src.org.sim.elineales.Stacks.LinkedStack;

public class Cliente extends Persona {
    private Carrito carritoCompra;
    private int Caja;
    private String usuario;
    private String password;
    private double billetera;
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
    }
    public Cliente(String usuario, String password) {
    	super();
    	this.usuario = usuario;
    	this.password = password;
    }
    public static Cliente AgregarClienteNuevo() {
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
    	System.out.println("Por favor confirme su contraseña");
    	String password1 = in.next();
    	while(!password.equals(password1)) {
    		System.out.println("Su contraseña no concuerta por favor ingresela de nuevo");
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
    public static Cliente Login(){
    	Scanner in = new Scanner(System.in);
    	System.out.println("<=======\tIniciando sesion\t========>");
    	System.out.println("Ingrese Usuario");
    	String usuario = in.next();
    	System.out.println("Ingrese contraseña");
    	String password = in.next();
    	return new Cliente(usuario,password);
    }
    private static Producto agregarProductosCar() {
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
    public void agregarProductosCarrito() {
    	this.carritoCompra.getProductos().push(Cliente.agregarProductosCar());
    }
    public void modificarProductosCar(int idProd) {

    }

    public void eliminarProductosCar() throws ExceptionIsEmpty {
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

    public void realizarPago() throws ExceptionIsEmpty {
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
    public boolean equals(Object o) {
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
     
