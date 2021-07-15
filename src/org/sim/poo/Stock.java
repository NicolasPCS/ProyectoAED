package org.sim.poo;

import java.util.LinkedList;

public class Stock {
    private Farmacia farmacia;
    private int tipoStock;
    private Producto producto = new Producto();
    public int getTipoStock() {
		return tipoStock;
	}

	public void setTipoStock(int tipoStock) {
		this.tipoStock = tipoStock;
	}

	public Stock(Farmacia farmacia, int tipoStock) {
        this.setFarmacia(farmacia);
        this.tipoStock = tipoStock;
    }

    public void anadirProd() {
    	return;
    }
    public String ObtenerTipoStock(){
    	if(this.tipoStock == 1) {
    		return "Medicamento";
    	}
    	else if(this.tipoStock == 2) {
    		return "Producto";
    	}
    	else
    		return "Este tipo de stock no existe";
    }
