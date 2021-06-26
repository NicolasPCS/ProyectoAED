<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> b043e7cf8dd798822fe34ddb45fcf75dcdc7d255

import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
    public static void main(String[] args) {
<<<<<<< HEAD
    	
    	Producto pro = new Producto();
    	
    	Farmaceutico farma = new Farmaceutico();
    	farma.RegistrarMedicamento(pro);
    	farma.VerMedicamentos(pro);
    	farma.IniciarSesion();
    	
=======
    	Farmaceutico Fabricio = new Farmaceutico();
    	
    	System.out.println("Como usuario usted podra realizar lo siguiente:");
        System.out.println("""
                \t1. Crear una cuenta
                \t2. Ingresar medicamentos
                \t3. Modificar Stock
                \t4. Desvincular Inventario
                \t5. Salir""");
    	
    	int opcion = 0;
        System.out.print("\nA continuacion seleccione la accion que quiera realizar (1/2/3/4/5): ");
        Scanner s = new Scanner(System.in);

        opcion = s.nextInt();
>>>>>>> b043e7cf8dd798822fe34ddb45fcf75dcdc7d255
    }
}