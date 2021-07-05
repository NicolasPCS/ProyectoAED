import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
	
	private static Farmaceutico usuarioF =new Farmaceutico();
    public static void main(String[] args) {
    	ListLinked <Farmaceutico> farmaceuticos = new ListLinked();
    	System.out.println("Selecciona una opcion:");
        System.out.println("""
                \t1. Iniciar Sesion
                \t2. Registrarse""");
        
        int opcion = 0;
        System.out.print("\nA continuacion seleccione la accion que quiera realizar (1/2): ");
        Scanner s = new Scanner(System.in);

        opcion = s.nextInt();

        if(opcion!=1 && opcion!=2 ) {
        	System.out.println("Opcion no valida:");
        }
        
        int usuario;
        String contra;
        if(opcion==1) {
        	System.out.println("usuario:");
        	usuario = s.nextInt();
        	System.out.println("contraseña:");
        	contra = s.nextLine();
        	usuarioF=new Farmaceutico(usuario,contra);
        	int e = farmaceuticos.search(usuarioF);
        	if (e==-1) {
        		System.out.println("Usuario y/o contraseña incorrectos");
        		
        	}
        	else {
        		usuarioF=farmaceuticos.getNodeAt(e).getData();
        		System.out.println("Bienvenido "+usuarioF.getNombre());
        		mostrarMenu();
        		
        	}
        }else {
        	System.out.println(
        }

        
    }
    
    private static void mostrarMenu () {
    	
    	System.out.println("Como usuario usted podra realizar lo siguiente:");
        System.out.println("""
                \t1. Ingresar medicamentos
                \t2. Modificar Stock
                \t3. Desvincular Inventario
                \t4. Salir""");
    
        int opcion = 0;
        System.out.print("\nA continuacion seleccione la accion que quiera realizar (1/2/3/4): ");
        Scanner s = new Scanner(System.in);

        opcion = s.nextInt();

        switch (opcion) {
            case 1:
            	
                usuarioF.RegistrarMedicamento(null);
                break;
            case 2:
                Producto Paracetamol = new Producto(); //Llame al contructor
                Fabricio.RegistrarMedicamento(Paracetamol);
                break;
            case 3:
                System.out.println("");
                break;

        }
    	
    }
}
