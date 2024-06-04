package dtos;

import java.time.LocalDateTime;

public class ClienteDtos {

	
	long idCliente;
	String nombre = "aaaaa";
	String apellidos= "aaaaa";
	String nombreCompleto= "aaaaa";
	String dni = "aaaaa";
	LocalDateTime fechaAlta =  LocalDateTime.now();
	boolean validado = false;
	
	
	public ClienteDtos(long idCliente,String dni, String nombre, String apellidos ) {
		super();
		this.idCliente = idCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCompleto = apellidos + "," + nombre;
		
	}
	
	
	
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public boolean isValidado() {
		return validado;
	}
	public void setValidado(boolean validado) {
		this.validado = validado;
	}




	@Override
	public String toString() {
		return "ClienteDtos [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", validado="
				+ validado + "]";
	}
	
	
	
	
	
}
