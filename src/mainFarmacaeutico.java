
import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
    public static void main(String[] args) {
    	
    	Producto pro = new Producto();
    	
    	Farmaceutico farma = new Farmaceutico();
    	farma.RegistrarMedicamento(pro);
    	farma.VerMedicamentos(pro);
    	farma.IniciarSesion();
    	
    }
}
