package net.AutoCine.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Funciones {
	//CAMPOS
	private Integer ID_FUNCION;
	private Integer ID_SALA; 
	private Integer ID_SEDE;
	private String NOMBRE_PELICULA; 
	private String DESCRIPCION;
	private LocalDateTime HORA;
	private String imagen="no-image.png";
	private Date FECHA;
	
	
	//GETTER AND SETTER
	public String getDESCRIPCION() {
		return DESCRIPCION;
	}
	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	} 
	public String getNOMBRE_PELICULA() {
		return NOMBRE_PELICULA;
	}
	public void setNOMBRE_PELICULA(String nOMBRE_PELICULA) {
		NOMBRE_PELICULA = nOMBRE_PELICULA;
	}
	public Integer getID_FUNCION() {
		return ID_FUNCION;
	}
	public void setID_FUNCION(Integer iD_FUNCION) {
		ID_FUNCION = iD_FUNCION;
	}
	public Integer getID_SALA() {
		return ID_SALA;
	}
	public void setID_SALA(Integer iD_SALA) {
		ID_SALA = iD_SALA;
	}
	public Integer getID_SEDE() {
		return ID_SEDE;
	}
	public void setID_SEDE(Integer iD_SEDE) {
		ID_SEDE = iD_SEDE;
	}
	public LocalDateTime getHORA() {
		return HORA;
	}
	public void setHORA(LocalDateTime hORA) {
		HORA = hORA;
	}
	public Date getFECHA() {
		return FECHA;
	}
	public void setFECHA(Date fECHA) {
		FECHA = fECHA;
	}
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "Funciones [ID_FUNCION=" + ID_FUNCION + ", ID_SALA=" + ID_SALA + ", ID_SEDE=" + ID_SEDE
				+ ", NOMBRE_PELICULA=" + NOMBRE_PELICULA + ", DESCRIPCION=" + DESCRIPCION + ", HORA=" + HORA
				+ ", imagen=" + imagen + ", FECHA=" + FECHA + "]";
	}
	
	
	
	
	
}
