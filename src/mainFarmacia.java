import java.util.Scanner;
import org.sim.elineales.Listas.ListLinked;
import org.sim.poo.Farmaceutico;
import org.sim.poo.Farmacia;
import org.sim.poo.Producto;
public class mainFarmacia {
	@SuppressWarnings({ "null", "resource" })
	public static void main(String[] args) {
		Scanner ingresar = new Scanner(System.in);
		String opcion;
		int opcion1;
		int opcion2=0;
		int posicion;
		ListLinked<Farmacia> sistema = new ListLinked<Farmacia>();
		System.out.println("Desea cerrar el sistema? (Si/No)");
		opcion = ingresar.nextLine();
		while(!opcion.equalsIgnoreCase("Si")) {
			System.out.println("<=======\tBienvenido al Sistema de la Farmacia\t=======>\n Por favor ingrese una opcion:\n"
					+ "\t1. Ingresar a una Farmacia\n\t2. Agregar una Farmacia\n\t3. Cerrar el sistema");
			opcion1 = ingresar.nextInt();
			while(opcion1 <1 || opcion1 >3){
				System.out.println("Error en la opcion ingresada, por favor vuelva a ingresar la opcion");
				opcion1 = ingresar.nextInt();
			}
			switch(opcion1) {
			case 1:
				posicion = sistema.search(Farmacia.BusquedaDatosFarm());
				if(posicion == -1) {
					System.out.println("Farmacia no encontrada...");
				}
				else {
					while(opcion2 != 2){
					System.out.println("INGRESO EXITOSO, BIENVENIDO A LA FARMACIA:"+sistema.getNodeAt(posicion).getData().getDirSede()
							+"\nIngrese una de las opciones por favor\n\t1. Ingresar farmaceutico\n\t2. VerFarmaceuticos\n\t3. Cerrar Sesion");
					opcion2 = ingresar.nextInt();
					switch(opcion2) {
					case 1:
						sistema.getNodeAt(posicion).getData().agregarFarmaceutico();
						break;
					case 2:
						System.out.println(sistema.getNodeAt(posicion).getData().getFarmaceuticos());
						break;
					case 3:
						System.out.println("Cerrando Sesion");
						break;
					}
					}
				}
				break;
			case 2:
				if(sistema == null) {
					sistema.insertFirst(Farmacia.ingresarDatosFarm());
				}
				else {
					sistema.insertLast(Farmacia.ingresarDatosFarm());
				}
				break;
			case 3:
				System.out.println("Saliendo del Sistema");
				opcion = "Si";
			}
			
		}
	}

}
