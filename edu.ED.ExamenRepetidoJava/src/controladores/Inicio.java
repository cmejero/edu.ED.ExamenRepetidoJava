package controladores;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDtos;
import servicios.FicherosImplementacion;
import servicios.FicherosInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import utiles.util;
public class Inicio {

	static public final String rutaFichero= "C:\\Users\\Carlo\\OneDrive\\Escritorio\\FICHEROS\\ExamenRepetido\\";
	static public final String rutaFicheroError = rutaFichero.concat(util.nombreArchivoLog());
	static public final String rutaOpcionSeleccionada= "C:\\Users\\Carlo\\OneDrive\\Escritorio\\FICHEROS\\ExamenRepetido\\opcionesSeleccionada.txt";
	static public final List<ClienteDtos> listaCliente = new ArrayList<ClienteDtos>();
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FicherosInterfaz fi = new FicherosImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		
		int opcionUsuario;
		boolean cerrarMenu = false;
		
		do {
			
			try {
			opcionUsuario = mi.menuYSeleccionPrincipal(sc);
			switch(opcionUsuario) {
			
			case 0:
				System.out.println("Has seleccionado cerrar aplicación");
				fi.ficheroOpcionSeleccionada("Has seleccionado cerrar aplicación; ");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("Has seleccionado menu clientes");
				fi.ficheroOpcionSeleccionada("Has seleccionado menu clientes; ");
				mi.accesoMenuClientes(sc);
				
				
				break;
				
			case 2:
				System.out.println("Has seleccionado menu empleados");
				fi.ficheroOpcionSeleccionada("Has seleccionado menu empleados; ");
				mi.accesoMenuEmpleados(sc);
				
				break;
				
				default:
					System.out.println("Has seleccionado una opcion incorrecta");
					fi.ficheroOpcionSeleccionada("Has seleccionado una opcion incorrecta; ");
					break;
			
			}
						
			}catch(Exception e) {
				fi.ficheroErrores("Se ha producido un error" + e.getMessage());
				System.out.println("Se ha producido un error, intentelo más tarde");
				
			}
		}while(!cerrarMenu);

		
	}

}
