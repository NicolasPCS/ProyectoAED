import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
	
	private static Farmaceutico usuarioF =new Farmaceutico();
	private static ListLinked <Farmaceutico> farmaceuticos = new ListLinked();
    public static void main(String[] args) {
    	
    	System.out.println("Selecciona una opcion:");
        System.out.println("""
                \t1. Iniciar Sesion
                \t2. Registrarse""");
        
        int opcion = 0;
        System.out.print("\nA continuacion seleccione la accion que quiera realizar (1/2): ");
        Scanner s = new Scanner(System.in);

        opcion = s.nextInt();
        s.nextLine();

        if(opcion!=1 && opcion!=2 ) {
        	System.out.println("Opcion no valida:");
        }
        
        int usuario;
        String contra;
        if(opcion==1) {
        	System.out.println("usuario:");
        	usuario = s.nextInt();
        	s.nextLine();
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
         String nombre;
         String apellido;
         int dni;
         int edad;
         String direccion;
         String FechaNacimiento;
         String estadoCivil;
         String correo;
         String nombre_farmacia;
         String contraR;
         
         System.out.println("nombre:");
         nombre = s.nextLine();
         System.out.println("apellido:");
         apellido = s.nextLine();
         System.out.println("dni:");
         dni = s.nextInt();
         s.nextLine();
         System.out.println("edad:");
         edad = s.nextInt();
         s.nextLine();
         System.out.println("direccion:");
         direccion = s.nextLine();
         System.out.println("FechaNacimiento:");
         FechaNacimiento= s.nextLine();
         System.out.println("estadoCivil:");
         estadoCivil= s.nextLine();
         System.out.println("correo:");
         correo= s.nextLine();
         System.out.println("nombre_farmacia:");
         nombre_farmacia= s.nextLine();
         System.out.println("contraR:");
         contraR= s.nextLine();
         
         usuarioF= new Farmaceutico(nombre,apellido,edad,correo,nombre_farmacia,contraR);
         farmaceuticos.insertLast(usuarioF);
         System.out.println("Usuario Registrado");
         mostrarMenu();
        	

        }

        
    }
    
    private static void mostrarMenu () {
    	System.out.println(farmaceuticos);
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
        s.nextLine();

        switch (opcion) {
            case 1:
            	
                usuarioF.RegistrarMedicamento(null);
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("");
                break;

        }
    	
    }
}
