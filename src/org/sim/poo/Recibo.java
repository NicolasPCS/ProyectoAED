package org.sim.poo;

import java.util.Date;

import org.sim.elineales.Stacks.LinkedStack;

public class Recibo {
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
    public Recibo() {
    	this.numRecibo = contadorRecibos+1;
    	contadorRecibos++;
    }
    public static void generarRecibo(Cliente cliente,LinkedStack<Producto> productos) {
    	
    }

    public static void imprimirRecibo() {

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
