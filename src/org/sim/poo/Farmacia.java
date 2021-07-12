package org.sim.poo;
import java.util.Date;
import java.util.Scanner;

import org.sim.elineales.Listas.ListLinked;
<<<<<<< HEAD
import org.sim.hashcode.HashC;
=======

>>>>>>> origin
import java.math.*;
public class Farmacia implements Comparable<Farmacia>{
    private int idFarmacia = 0;
    private String dirSede;
    private boolean disponible;
    private String horarioAtencion;
    private String telefono;
	private String producto;
<<<<<<< HEAD
	private static HashC<Producto> producto2;
=======
>>>>>>> origin
	private ListLinked<Producto> producto1;
	private ListLinked<Farmaceutico> farmaceuticos = new ListLinked<Farmaceutico>();
	public int getIdFarmacia() {
		return idFarmacia;
	}

<<<<<<< HEAD
	public HashC<Producto> getProducto2() {
		return producto2;
	}

	public void setProducto2(HashC<Producto> producto2) {
		this.producto2 = producto2;
	}

=======
>>>>>>> origin
	public void setIdFarmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public String getDirSede() {
		return dirSede;
	}

	public void setDirSede(String dirSede) {
		this.dirSede = dirSede;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	public ListLinked<Producto> getProducto1() {
		return producto1;
	}
<<<<<<< HEAD

	public void setProducto1(ListLinked<Producto> producto1) {
		this.producto1 = producto1;
	}

=======

	public void setProducto1(ListLinked<Producto> producto1) {
		this.producto1 = producto1;
	}

>>>>>>> origin
	public Farmacia() {
	}
	public Farmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}
	public Farmacia(int idFarmacia,String dirSede, String horarioatencion, String telefono) {
        this.idFarmacia = idFarmacia; 
        this.dirSede = dirSede;
        this.disponible = false;
        this.horarioAtencion = horarioatencion;
        this.telefono = telefono;
    }
	@SuppressWarnings({ "resource", "unused" })
	public void agregarFarmaceutico() {
		String opcion;
		Scanner enter = new Scanner (System.in);
		opcion = "Si";
		while (!opcion.equalsIgnoreCase("No")) {
		if(this.farmaceuticos ==null) {
			System.out.println("<=======\tNuevo Farmaceutico\t=======>");
			System.out.println("Codigo: ");
			String codigo = enter.next();
			System.out.println("Nombre: ");
			String nombre = enter.next();
			System.out.println("Apellido: ");
			String apellido  = enter.next();
				
			System.out.println("Edad: ");
			int edad = enter.nextInt();
			enter.nextLine();
				
			System.out.println("Correo: ");
			String correo = enter.next();
				
			/*System.out.print("Farmacia : ");
			String farmacia = enter.nextLine();*/
				
			System.out.println("Contraseña: ");
			String contra = enter.next();
			System.out.println("Farmaceutico registrado:\n" + nombre + 
						" - " + apellido + " - " + edad + " - " + correo);
			Farmaceutico f = new Farmaceutico(codigo,nombre, apellido, edad, correo,Farmacia.this,contra);
			this.farmaceuticos.insertFirst(f);
			
<<<<<<< HEAD
		}
		else {
			System.out.println("<=======\tNuevo Farmaceutico\t=======>");
			System.out.println("\tCodigo: ");
			String codigo = enter.next();
			System.out.println("\tNombre: ");
			String nombre = enter.next();
				
			System.out.println("\tApellido: ");
			String apellido  = enter.next();
				
			System.out.println("\tEdad: ");
			int edad = enter.nextInt();
				
			System.out.println("\tCorreo: ");
			String correo = enter.next();
				
			/*System.out.print("Farmacia : ");
			String farmacia = enter.nextLine();*/
				
			System.out.println("\tContraseña: ");
			String contra = enter.next();
			System.out.println("Farmaceutico registrado:\n" + codigo+ " - " + nombre + 
						" - " + apellido + " - " + edad + " - " + correo);
			Farmaceutico f = new Farmaceutico(nombre, apellido, edad, correo,Farmacia.this,contra);
			this.farmaceuticos.insertLast(f);
		}
		System.out.println("Desea seguir con el registro de farmaceuticos (Si/No)");
		opcion = enter.next();
		}
		System.out.println("Saliendo del ingreso de farmaceuticos");
	}
	public static void verReporteProductos(ListLinked<Producto> pro) {
		producto2 = new HashC<Producto>(pro.length());
		int total = pro.length();
		for(int i = 0;i<total;i++) {
			char [] c = pro.getNodeAt(i).getData().getCodigo().toCharArray();
			int sum = 0;
			for(int i1 = 0;i<c.length;i++) {
				sum+= c[i1]*Math.pow(10, i1);
			}
			producto2.insertarEncadenamiento(sum, pro.getNodeAt(0).getData());
			
		}
		System.out.println(producto2);
	}
=======
		}
		else {
			System.out.println("<=======\tNuevo Farmaceutico\t=======>");
			System.out.println("\tCodigo: ");
			String codigo = enter.next();
			System.out.println("\tNombre: ");
			String nombre = enter.next();
				
			System.out.println("\tApellido: ");
			String apellido  = enter.next();
				
			System.out.println("\tEdad: ");
			int edad = enter.nextInt();
				
			System.out.println("\tCorreo: ");
			String correo = enter.next();
				
			/*System.out.print("Farmacia : ");
			String farmacia = enter.nextLine();*/
				
			System.out.println("\tContraseña: ");
			String contra = enter.next();
			System.out.println("Farmaceutico registrado:\n" + codigo+ " - " + nombre + 
						" - " + apellido + " - " + edad + " - " + correo);
			Farmaceutico f = new Farmaceutico(nombre, apellido, edad, correo,Farmacia.this,contra);
			this.farmaceuticos.insertLast(f);
		}
		System.out.println("Desea seguir con el registro de farmaceuticos (Si/No)");
		opcion = enter.next();
		}
		System.out.println("Saliendo del ingreso de farmaceuticos");
	}
	
>>>>>>> origin
    @SuppressWarnings("resource")
	public void verHorario() {
    	
    	int opc = 0;
    	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escoje una opcion");
		System.out.println("-------------------------");
		System.out.println("1. Turno Mañana");
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


    	Scanner entrada1 = new Scanner(System.in);
		Producto = entrada1.nextLine();


		entrada = new Scanner(System.in);
		producto = entrada.nextLine();

		

    	Scanner entrada11 = new Scanner(System.in);
		Producto = entrada11.nextLine();
		entrada = new Scanner(System.in);

    	
    }
    public static Farmacia ingresarDatosFarm() {
		Scanner s = new Scanner(System.in);
		System.out.println("<=======\tNUEVA FARMACIA\t=======>");
		System.out.println("\tId de la Farmacia");
		int IdFarmacia = s.nextInt();
		System.out.println("\tNombre de la sede: ");
		String nombre = s.next();
		System.out.println("\tHorario de atencion: ");
		String horarioatencion = s.next();
		System.out.println("\tTelefono: ");
		String telefono = s.next();
		return new Farmacia(IdFarmacia,nombre,horarioatencion,telefono);
    }
    public static Farmacia BusquedaDatosFarm() {
		Scanner s = new Scanner(System.in);
		System.out.println("<=======\tFARMACIA EXISTENTE\t=======>");
		System.out.println("\tId de la Farmacia");
		int IdFarmacia = s.nextInt();
		return new Farmacia(IdFarmacia);
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
	public boolean equals(Object o) {
		if(o instanceof Farmacia) {
			Farmacia a = (Farmacia) o;
			return this.idFarmacia==a.idFarmacia;
		}
		else {
			return false;
		}
	}
	public boolean equals(Farmacia o) {
		return this.idFarmacia == o.idFarmacia;
	}
	@Override
	public int compareTo(Farmacia o) {
		// TODO Auto-generated method stub
		if(o instanceof Farmacia) {
			Farmacia a = (Farmacia) o;
			if(this.idFarmacia>a.idFarmacia) return 1;
			if(this.idFarmacia<a.idFarmacia) return -1;
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}

	public ListLinked<Farmaceutico> getFarmaceuticos() {
		return farmaceuticos;
	}

	public void setFarmaceuticos(ListLinked<Farmaceutico> farmaceuticos) {
		this.farmaceuticos = farmaceuticos;
	}
}