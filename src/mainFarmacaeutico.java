
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

        switch (opcion) {
        case 1:
        	Fabricio.IniciarSesion(); //Guardar datos Listas?
            break;
        case 2:
        	Producto Veneno = new Producto(); //Llame al contructor 
            Fabricio.RegistrarMedicamento(Veneno); 
            break;
        case 3:
        	System.out.println("Dejen de robar codigo P.D. Jackeline consigue el codigo de polar");
            break;
            
    }
}
}