package src.org.sim.poo;

public class Stock {
    private int idFarmacia;
    private int tipoStock;
    private Producto arrProductos;

    public Stock(int idFarmacia, int tipoStock) {
        this.idFarmacia = idFarmacia;
        this.tipoStock = tipoStock;
        this.arrProductos = new Producto();
    }

    public void anadirProd() {

    }
}
