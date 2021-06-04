package org.sim.poo;

import java.util.Date;

public class Recibo {
    private int numRecibo = 0;
    private int idCliente;
    private Producto[] productos;
    private Date fechaEmision;

    public Recibo(int idCliente, Producto[] productos) {
        this.numRecibo += 1;
        this.idCliente = idCliente;
        this.productos = productos;
        this.fechaEmision = new Date();
    }

    public void generarRecibo() {

    }

    public void imprimirRecibo() {

    }
}
