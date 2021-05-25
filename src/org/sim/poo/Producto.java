package org.sim.poo;

import java.util.Date;

public class Producto {
    private int idProducto = 0;
    private String nombre;
    private String tipo;
    private String precauciones;
    private Farmaceutico farmaceutico;
    private double precio;
    private Date fechaVencimiento;
    private int cantidad;

    public Producto() {}

    public Producto(String nombre, String tipo, String precauciones, Farmaceutico farmaceutico, double precio, Date fechaVencimiento, int cantidad) {
        this();
        this.idProducto += 1;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precauciones = precauciones;
        this.farmaceutico = new Farmaceutico();
        this.precio = precio;
        this.fechaVencimiento = new Date();
        this.cantidad = cantidad;
    }

    public void ingresarDatosProd() {

    }

    public void mostrarDatosProd(int idProd) {

    }

    public void eliminarProd(int idProd) {

    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precauciones='" + precauciones + '\'' +
                ", farmaceutico=" + farmaceutico +
                ", precio=" + precio +
                ", fechaVencimiento=" + fechaVencimiento +
                ", cantidad=" + cantidad +
                '}';
    }
}
