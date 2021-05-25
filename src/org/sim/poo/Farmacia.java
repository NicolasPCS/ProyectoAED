package org.sim.poo;

import java.util.Date;

public class Farmacia {
    private int idFarmacia = 0;
    private String dirSede;
    private boolean disponible;
    private Date horarioAtencion;
    private String telefono;

    public Farmacia(String dirSede, Date horarioAtencion, String telefono) {
        this.idFarmacia += 1;
        this.dirSede = dirSede;
        this.disponible = false;
        this.horarioAtencion = horarioAtencion;
        this.telefono = telefono;
    }

    public void verHorario() {

    }

    public void listarProductos() {

    }

    @Override
    public String toString() {
        return "Farmacia{" +
                "idFarmacia=" + idFarmacia +
                ", dirSede='" + dirSede + '\'' +
                ", disponible=" + disponible +
                ", horarioAtencion=" + horarioAtencion +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
