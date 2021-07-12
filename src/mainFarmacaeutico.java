import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.poo.Farmaceutico;
import org.sim.poo.Farmacia;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
    @SuppressWarnings({ "resource", "null" })
	public static void main(String[] args) {
    	int opcion;
    	int opcion2;
    	String opcion1;
    	int posicion;
    	Scanner ingresar = new Scanner(System.in);
    	ListLinked<Farmaceutico> farma = new ListLinked<Farmaceutico>();
    	ListLinked<Producto> pro = new ListLinked<Producto>();
    	System.out.println("Desea cerrar el sistema (Si/No)");
    	opcion1 = ingresar.nextLine();
    	while(!opcion1.equalsIgnoreCase("Si")){
	    	System.out.println("<=======\tBienvenido al sistema para Farmaceuticos\t=======>\n"
	    			+ "¿Que desea hacer? elija una opcion\n1.Iniciar Sesion\n2.Crear Cuenta\n3.Cerrar Sistema");
	    	opcion = ingresar.nextInt();
	    	while(opcion<1 || opcion >3) {
	    		System.out.println("ingrese una opcion correcta");
	    		opcion = ingresar.nextInt();
	    	}
	    	switch(opcion) {
	    	case 1:
		    	posicion = farma.search(Farmaceutico.IniciarSesion());
		    	if(posicion == -1) {
		    		System.out.println("El usuaro ingresado no existe");
		    	}
		    	else {
		    	while(opcion != 3) {
			    	System.out.println("ingreso exitoso! Hola de nuevo: "+farma.getNodeAt(posicion).getData().getNombre()+"\nComo usuario usted puede:\n\t"
			    			+ "1. Ingresar medicamentos \n\t2. Ver Medicamentos \n\t3. Sacar Reporte \n\t4. Cerrar Sesion");
			    	opcion2 = ingresar.nextInt();
			    	switch(opcion2){
			    	case 1:
			    		farma.getNodeAt(posicion).getData().RegistrarMedicamentos(pro);
			    		break;
			    	case 2:
			    		System.out.println("Lista de Productos: \n"+pro);
			    		break;
			    	case 3:

			    	case 4:
			    		System.out.println("Usted ha cerrado sesion");
			    		break;
			    	}
		    	}
		    	}
		    	break;
	    	case 2:
		    		if(farma == null) {
		    			farma.insertFirst(Farmaceutico.ingresarDatosFarmaceutico());
		    		}
		    		else {
		    			farma.insertLast(Farmaceutico.ingresarDatosFarmaceutico());
		    		}
		    		break;
	    	case 3:
	    		opcion1 = "Si";
	    		break;
	    	}
	    }
    	System.out.println("Usted ha salido del sistema, Programa Finalizado...");
    }
}