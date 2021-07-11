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
	
