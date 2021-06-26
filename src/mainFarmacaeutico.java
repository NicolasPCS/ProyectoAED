import java.util.Scanner;
import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
    public static void main(String[] args) {

    	Producto pro = new Producto();
    	Farmaceutico farma = new Farmaceutico();
    	farma.RegistrarMedicamento(pro);
    	farma.VerMedicamentos(pro);
    	farma.IniciarSesion();

    	Farmaceutico farmaceuticos = new Farmaceutico();
    	
    	System.out.println("Como usuario usted podra realizar lo siguiente:");
        System.out.println("""
                \t1. Crear una cuenta
                \t2. Ingresar medicamentos
                \t3. Modificar Stock
                \t4. Desvincular Inventario
                \t5. Salir""");
    	
    	int opcion = 0;
        System.out.print("\nA continuacion seleccione la accion que quiera realizar (1/2/3/4/5): ");
        System.out.print("""
        		\t1: Iniciar Sesion
        		\t2 Registrar Medicamento
        		\t3 Ver Medicamentos
        		\t4 Salir""");
        
        Scanner s = new Scanner(System.in);

        opcion = s.nextInt();

        switch (opcion) {
        case 1:
        	farmaceuticos.IniciarSesion();
            break;
        case 2:
        	Producto Productos = new Producto();
        	farmaceuticos.RegistrarMedicamento(Productos); 
            break;   
        case 3:
        	Producto Productos2 = new Producto();
        	farmaceuticos.VerMedicamentos(Productos2); 
            break;
            
        case 4:
        	System.out.println("Usted salio del sitio");
            break;
            
    }
}
}