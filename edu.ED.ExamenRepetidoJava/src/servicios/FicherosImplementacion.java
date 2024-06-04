package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

public class FicherosImplementacion implements FicherosInterfaz {

	public void ficheroErrores(String mensaje) {
		
			
		try {
			FileWriter fw = new FileWriter(Inicio.rutaFicheroError, true);
			
			fw.write(mensaje);
			
			fw.close();
			
		}catch(Exception e) {
			
			System.out.println("Se ha producido un erro [1000], intentelo más tarde" );
		}
				
	}
	
	
	public void ficheroOpcionSeleccionada(String mensaje) {
		
		try {
			FileWriter fw = new FileWriter(Inicio.rutaOpcionSeleccionada, true);
			
			fw.write(mensaje);
			
			fw.close();
			
		}catch(IOException io) {
			
			ficheroErrores("Se ha producido un error en ficheroOpcionSeleccionada " + io.getMessage());
			System.out.println("Se ha producido un error [error1001], intentelo más tarde");
		}
	}
	
	
}
