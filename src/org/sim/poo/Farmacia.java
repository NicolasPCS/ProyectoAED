package org.sim.poo;

import java.util.Date;
import java.util.Scanner;

public class Farmacia {
    private int idFarmacia = 0;
    private String dirSede;
    private boolean disponible;
    private Date horarioAtencion;
    private String telefono;
	private Producto producto;

	public Farmacia(String dirSede, Date horarioAtencion, String telefono) {
        this.idFarmacia += 1;
        this.dirSede = dirSede;
        this.disponible = false;
        this.horarioAtencion = horarioAtencion;
        this.telefono = telefono;
    }

    public void verHorario() {
    	
    	int opc = 0;
    	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escoje una opcion");
		System.out.println("-------------------------");
		System.out.println("1. Turno Ma�ana");
		System.out.println("2. Turno Tarde");
		System.out.println("3. Turno Noche");
		System.out.println("4. Salir");
		
		opc = in.nextInt();
    	
    	switch (opc) {
    	case 1:
    		System.out.println("7:00 am a 12 am");
    		break;
    	case 2:
    		System.out.println("2:00 pm a 4:00 pm");
    		break;
    	case 3:
    		System.out.println("6:00 pm a 8:00 pm");
    		break;
    	case 4:
    		break;
    	 	
    	
    	}
    	
    	

    }

    public void listarProductos() {
    	
    	String Producto;
    	int n = 5;
    	String prods[];
    	
    	Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
<<<<<<< HEAD
    	
    	Scanner entrada1 = new Scanner(System.in);
		Producto = entrada1.nextLine();
=======

		entrada = new Scanner(System.in);
		producto = entrada.nextLine();
>>>>>>> cde743c96f5c9f7b8eaf6d836bacd6c698d0a491
		
		
		
    	
    }

    @Override
    public String toString() {
        return "Farmacia{" +
                "idFarmacia=" + idFarmacia +
                ", dirSede='" + dirSede + '\'' +
                ", disponible=" + disponible +
                ", horarioAtencion=" + horarioAtencion +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
