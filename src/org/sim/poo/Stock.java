package org.sim.poo;

import java.util.LinkedList;

public class Stock {//clase que se usa como una caja para productos
	private Farmacia farmacia;
	private int tipoStock;
	private Producto producto;
	public int getTipoStock() {
		return tipoStock;
	}

	public void setTipoStock(int tipoStock) {
		this.tipoStock = tipoStock;
	}

	public Stock(Farmacia farmacia, int tipoStock,Producto producto) {
		this.setFarmacia(farmacia);
		this.tipoStock = tipoStock;
		this.producto = producto;
	}
	public String ObtenerTipoStock(){//categoriza el tipo de stock 1 = Medicamento 2 = Producto
		if(this.tipoStock == 1) {
			return "Medicamento";
		}
		else if(this.tipoStock == 2) {
			return "Producto";
		}
		else
			return "Este tipo de stock no existe";
	}
	public Farmacia getFarmacia() {
		return farmacia;
	}

	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}
	public String toString() {//toString para mostrar Objeto
		return "<Stock de la Farmacia>: "+this.farmacia.getDirSede()+": [Codigo: "+ this.producto.getCodigo() + " || Nombre: " + this.producto.getNombre() + " || Cantidad: " + this.producto.getCantidad()+" || TipodeStock: "+this.getTipoStock() + "]";
	}
}
