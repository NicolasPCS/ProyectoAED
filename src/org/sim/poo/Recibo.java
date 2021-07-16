package org.sim.poo;

import java.util.Date;

import org.sim.elineales.Stacks.ExceptionIsEmpty;
import org.sim.elineales.Stacks.LinkedStack;

public class Recibo {//genera recibos en el que su id se aumenta de manera secuencial
    private int numRecibo = 0;
    public static int contadorRecibos=0;
    private Cliente cliente;
    private LinkedStack<Producto> productos;
    private Date fechaEmision;
    public Recibo(Cliente cliente, LinkedStack<Producto> productos) {
        
        this.setCliente(cliente);
        this.setProductos(productos);
        this.setFechaEmision(new Date());
        
    }
    public Recibo() {//aumenta el id de recibo de manera incremental en 1
    	this.numRecibo = contadorRecibos+1;
    	contadorRecibos++;
    }
    public static void generarRecibo(Cliente cliente,LinkedStack<Producto> productos) throws ExceptionIsEmpty {//genera recibo
    	LinkedStack<Producto> aux = productos;
    	System.out.println("<=======\tGenerando recibo\t=======> N°"+new Recibo().getNumRecibo());
    	System.out.println("Cliente: "+cliente.getNombre()+" "+cliente.getApellido());
    	System.out.println(cliente.getCarritoCompra());
    	double sum = 0;
    	while(!productos.isEmpty())
    	{
    		Producto o = new Producto();
    		o = productos.pop();
    		sum += o.getPrecio()*o.getCantidad();
    	}
    	System.out.println("El total es: s/"+sum);
    }
	public int getNumRecibo() {
		return numRecibo;
	}
	public void setNumRecibo(int numRecibo) {
		this.numRecibo = numRecibo;
	}
	public LinkedStack<Producto> getProductos() {
		return productos;
	}
	public void setProductos(LinkedStack<Producto> productos) {
		this.productos = productos;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
