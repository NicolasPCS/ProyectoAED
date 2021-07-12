import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
import org.sim.poo.Farmaceutico;
import org.sim.poo.Producto;

public class mainFarmacaeutico {
    public static void main(String[] args) {
    	int opcion;
    	int opcion2;
    	String opcion1;
    	int posicion;
    	Scanner ingresar = new Scanner(System.in);
    	ListLinked<Producto> pro = new ListLinked<Producto>();
    	ListLinked<Farmaceutico> farma = new ListLinked<Farmaceutico>();
    	Farmaceutico f = new Farmaceutico();
    	Producto p = new Producto();
    	System.out.println("Desea cerrar el sistema (Si/No)");
    	opcion1 = ingresar.nextLine();
    	while(!opcion1.equalsIgnoreCase("Si")){
	    	System.out.println("<=======\tBienvenido al sistema para Farmaceuticos\t=======>\n"
	    			+ "¿Que desea hacer? elija una opcion\n1.Iniciar Sesion\n2.Crear Cuenta\n3.Cerrar Sistema");
	    	opcion = ingresar.nextInt();
	    	while(!(opcion == 1||opcion == 2)) {
	    		System.out.println("ingrese una opcion correcta");
	    		opcion = ingresar.nextInt();
	    	}
	    	switch(opcion) {
	    	case 1:
		    	f.CrearCuenta();
		    	farma.getNodeAt(farma.search(f));
		    	posicion = farma.search(f);
		    	while(opcion != 3) {
			    	System.out.println("ingreso exitoso! Hola de nuevo"+farma.getNodeAt(posicion).getData().getNombre()+"\nComo usuario usted puede:\n\t"
			    			+ "1. Ingresar medicamentos \n\t2. Ver Medicamentos \n\t3. Cerrar Sesion");
			    	opcion2 = ingresar.nextInt();
			    	switch(opcion2){
			    	case 1:
			    		farma.getNodeAt(posicion).getData().RegistrarMedicamentos(pro);
			    		break;
			    	case 2:
			    		System.out.println("Lista de Productos: \n"+pro);
			    		break;
			    	case 3:
			    		System.out.println("Usted ha salido");
			    		break;
			    	}
		    	}
		    	break;
	    	case 2:
		    		if(farma == null) {
		    			farma.insertFirst(new Farmaceutico());
		    			farma.getNodeAt(0).getData().CrearCuenta();
		    		}
		    		else {
		    			farma.insertLast(new Farmaceutico());
		    			farma.getLastNode().getData().CrearCuenta();;
		    		}
		    		break;
	    	case 3:
	    		System.out.println("Usted ha cerrado sesion");
	    	}
	    	System.out.println("Desea cerrar el sistema? (Si/No)");
	    	opcion1 = ingresar.nextLine();
	    }
    }
}