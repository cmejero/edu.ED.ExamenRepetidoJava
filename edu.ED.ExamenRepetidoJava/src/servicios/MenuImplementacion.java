package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	FicherosInterfaz fi = new FicherosImplementacion();
	ClienteInterfaz ci = new ClienteImplementacion();
	
	public int menuYSeleccionPrincipal(Scanner sc) {
		int opcionUsuario;
		
		System.out.println("#####################");
		System.out.println("0. Cerrar aplicación");
		System.out.println("1. Menu cliente");
		System.out.println("2. Menu Empleado");
		System.out.println("#####################");
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}
	
	
	private int menuClientes(Scanner sc) {
		int opcionUsuario;
		
		System.out.println("#####################");
		System.out.println("0. volver");
		System.out.println("1. Registro del cliente");
		System.out.println("2. Solicitud de alta médica");
		System.out.println("#####################");
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}
	
	
	
	private int menuEmpleados(Scanner sc) {
		int opcionUsuario;
		
		System.out.println("#####################");
		System.out.println("0. volver");
		System.out.println("1. validar nuevo cliente");
		System.out.println("2. Imprimir citas medicas para un dia especifico");
		System.out.println("#####################");
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}
	
	public void accesoMenuClientes(Scanner sc) {
		int opcionUsuario;
		boolean cerrarMenu = false;
		
		do {
			
			try {
			opcionUsuario = menuClientes(sc);
			switch(opcionUsuario) {
			
			case 0:
				System.out.println("Has seleccionado volver");
				fi.ficheroOpcionSeleccionada("Has seleccionado volver");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("Has seleccionado registro de clientes");
				fi.ficheroOpcionSeleccionada("Has seleccionado registro de clientes;");
				ci.registroCLiente(sc);
				
				break;
				
			case 2:
				System.out.println("Has seleccionado solicitud de cita medica");
				fi.ficheroOpcionSeleccionada("Has seleccionado solicitud de cita medica");
				
				
				break;
				
				default:
					System.out.println("Has seleccionado una opcion incorrecta");
					fi.ficheroOpcionSeleccionada("Has seleccionado una opcion incorrecta");
					break;
			
			}
						
			}catch(Exception e) {
				fi.ficheroErrores("Se ha producido un error" + e.getMessage());
				System.out.println("Se ha producido un error, intentelo más tarde");
				
			}
		}while(!cerrarMenu);
	}
	
	
	
	public void accesoMenuEmpleados(Scanner sc) {
		int opcionUsuario;
		boolean cerrarMenu = false;
		
		do {
			
			try {
			opcionUsuario = menuEmpleados(sc);
			switch(opcionUsuario) {
			
			case 0:
				System.out.println("Has seleccionado volver");
				fi.ficheroOpcionSeleccionada("Has seleccionado volver");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("Has seleccionado validar nuevo cliente");
				fi.ficheroOpcionSeleccionada("Has seleccionado validar nuevo cliente;");
				
				
				break;
				
			case 2:
				System.out.println("Has seleccionado imprimir citas medicas para un dia especifico");
				fi.ficheroOpcionSeleccionada("Has seleccionado imprimir citas medicas para un dia especifico");
				
				
				break;
				
				default:
					System.out.println("Has seleccionado una opcion incorrecta");
					fi.ficheroOpcionSeleccionada("Has seleccionado una opcion incorrecta");
					break;
			
			}
						
			}catch(Exception e) {
				fi.ficheroErrores("Se ha producido un error" + e.getMessage());
				System.out.println("Se ha producido un error, intentelo más tarde");
				
			}
		}while(!cerrarMenu);
	}
	
}
