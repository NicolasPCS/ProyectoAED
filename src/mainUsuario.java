import org.sim.elineales.Listas.ListLinked;
import org.sim.elineales.Listas.TDAList;
import org.sim.poo.Producto;

import java.util.Scanner;

public class mainUsuario {
    public static void main(String[] args) {
        try {
            System.out.println("Como usuario usted podra realizar lo siguiente:");
            System.out.println("""
                    \t1. Crear una cuenta
                    \t2. Ver medicamentos
                    \t3. Ver productos pro farmacia
                    \t4. Generar mi carrito de compras
                    \t5. Salir""");

            int opcion = 0;
            System.out.println("\nA continuacion seleccione una opcion (1/2/3/4/5)");
            Scanner s = new Scanner(System.in);

            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Crear una cuenta");
                    break;
                case 2:
                    System.out.println("Listar medicamentos");
                    break;
                case 3:
                    System.out.println("Ver productos por farmacia");
                    break;
                case 4:
                    System.out.println("Generar mi carrito de compras");
                    TDAList<Producto> carrito = new ListLinked<>();

                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("No ha ingresado una opcion correcta");
                    break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
