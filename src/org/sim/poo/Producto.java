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
    private String FechVen;
    public String getFechVen() {
		return FechVen;
	}

	public void setFechVen(String fechVen) {
		FechVen = fechVen;
	}

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

    public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrecauciones() {
		return precauciones;
	}

	public void setPrecauciones(String precauciones) {
		this.precauciones = precauciones;
	}

	public Farmaceutico getFarmaceutico() {
		return farmaceutico;
	}

	public void setFarmaceutico(Farmaceutico farmaceutico) {
		this.farmaceutico = farmaceutico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
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
