package net.AutoCine.model;

public class Pelicula {

	private Integer ID_PELICULA;
	private Integer ID_FUNCION;
	private String NOMBRE;
	private String DESCRIPCION;
	private Integer ID_CAT;
	public Integer getID_PELICULA() {
		return ID_PELICULA;
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
		return "Pelicula [ID_PELICULA=" + ID_PELICULA + ", ID_FUNCION=" + ID_FUNCION + ", NOMBRE=" + NOMBRE
				+ ", DESCRIPCION=" + DESCRIPCION + ", ID_CAT=" + ID_CAT + "]";
	}
	
}
