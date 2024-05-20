package net.AutoCine.model;

import java.util.Date;

public class Peliculas {

	//CAMPOS
	private Integer ID_PELICULA;
	private Integer ID_FUNCION;
	private String NOMBRE;
	private String DESCRIPCION;
	private Integer ID_CAT;
	private Date FECHA_PUBLICACION;
	private String imagen="no-image.png";
	
	//GETTER AND SETTER
	
	public Integer getID_PELICULA() {
		return ID_PELICULA;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Date getFECHA_PUBLICACION() {
		return FECHA_PUBLICACION;
	}
	public void setFECHA_PUBLICACION(Date fECHA_PUBLICACION) {
		FECHA_PUBLICACION = fECHA_PUBLICACION;
	}
	public void setID_PELICULA(Integer iD_PELICULA) {
		ID_PELICULA = iD_PELICULA;
	}
	public Integer getID_FUNCION() {
		return ID_FUNCION;
	}
	public void setID_FUNCION(Integer iD_FUNCION) {
		ID_FUNCION = iD_FUNCION;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getDESCRIPCION() {
		return DESCRIPCION;
	}
	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}
	public Integer getID_CAT() {
		return ID_CAT;
	}
	public void setID_CAT(Integer iD_CAT) {
		ID_CAT = iD_CAT;
	}

	@Override
	public String toString() {
		return "Peliculas [ID_PELICULA=" + ID_PELICULA + ", ID_FUNCION=" + ID_FUNCION + ", NOMBRE=" + NOMBRE
				+ ", DESCRIPCION=" + DESCRIPCION + ", ID_CAT=" + ID_CAT + ", FECHA_PUBLICACION=" + FECHA_PUBLICACION
				+ ", imagen=" + imagen + "]";
	}
	
}
