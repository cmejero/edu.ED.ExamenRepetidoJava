package utiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  class util {

	public static final String nombreArchivoLog() {
		String nombreCompleto ="hola";
		
		try {
			
			String log = "log-";
			LocalDate fechaActual = LocalDate.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
			String fechaString = fechaActual.format(formato);
			String txt = ".txt";
			
			nombreCompleto = log.concat(fechaString).concat(txt);
			
			
			
		}catch(Exception e) {
			
			System.out.println("Se ha producido un error [1003], intentelo más tarde");
		}
		return nombreCompleto;
	}
}
