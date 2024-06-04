package servicios;

import java.util.Scanner;

import controladores.Inicio;
import dtos.ClienteDtos;

public class ClienteImplementacion implements ClienteInterfaz {

	
	public void registroCLiente(Scanner sc) {
		
		String respuesta;
		
		do {
			long id = crearId();
			System.out.println("introduzca su nombre");
			String nombre = sc.next();
			String espacio = sc.nextLine();
			System.out.println("introduzca sus apellidos");
			String apellidos = sc.nextLine();
			System.out.println("introduzca su DNI");
			String dni = sc.next();
			
			 ClienteDtos cliente = new ClienteDtos(id,dni,nombre,apellidos);
			
			Inicio.listaCliente.add(cliente);
			
			
			System.out.println("¿Quieres agregar otro cliente?: s/n");
			respuesta = sc.next();
			
		}while(respuesta.equals("s"));
		
		for(ClienteDtos cliente : Inicio.listaCliente) {
			System.out.println(cliente.toString());
		}
	}
	
	private long crearId() {
		
		long nuevoId;
		int tamanioLista = Inicio.listaCliente.size();
		
		if(tamanioLista > 0) {
			
			nuevoId = Inicio.listaCliente.get(tamanioLista -1).getIdCliente() +1;
		}
		else {
			nuevoId = 1;
		}
		return nuevoId;
		
	}
	
}
