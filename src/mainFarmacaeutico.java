import java.util.Scanner;

import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
    public static void main(String[] args) {
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
    }
}