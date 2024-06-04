package dtos;

import java.time.LocalDateTime;

public class CitaDto {

	long idCita;
	String dniCliente = "aaaaa";
	String nombreCompletoCliente = "aaaaa";
	String especialidad = "aaaaa";
	LocalDateTime fechaCita = LocalDateTime.of(31, 1, 1999, 0,0,0);
	
	
	public long getIdCita() {
		return idCita;
	}
	public void setIdCita(long idCita) {
		this.idCita = idCita;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}
	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	
	public CitaDto() {
		super();
	}
	
}
