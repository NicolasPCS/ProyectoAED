package org.sim.poo;

import java.util.Arrays;

public class Cliente extends Persona {
    public Producto[] carritoCompra;

    public Cliente(Object nombre, Object dni) {
        super(nombre, dni);
    }

    public void agregarProductosCar(Producto prod) {

    }

    public void modificarProductosCar(int idProd) {

    }

    public void mostrarProductosCar() {

    }

    public void eliminarProductosCar(int idProd) {

    }

    public void realizarPago() {

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "carritoCompra=" + Arrays.toString(carritoCompra) +
                '}';
    }
}
