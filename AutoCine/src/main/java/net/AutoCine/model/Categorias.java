package net.AutoCine.model;

public class Categorias {

	private Integer ID_CAT;
	private String NOMBRE_CAT;
	
	//GETTER AND SETTER
	public Integer getID_CAT() {
		return ID_CAT;
	}
	public void setID_CAT(Integer iD_CAT) {
		ID_CAT = iD_CAT;
	}
	public String getNOMBRE_CAT() {
		return NOMBRE_CAT;
	}
	public void setNOMBRE_CAT(String nOMBRE_CAT) {
		NOMBRE_CAT = nOMBRE_CAT;
	}
	@Override
	public String toString() {
		return "Categorias [ID_CAT=" + ID_CAT + ", NOMBRE_CAT=" + NOMBRE_CAT + "]";
	}
	
	
	
}
