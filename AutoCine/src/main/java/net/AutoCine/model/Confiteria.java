package net.AutoCine.model;

public class Confiteria {

	private Integer ID_CONFITERIA;
	private String NOMBRE_CONFI;
	private Double PRECIO_UNITARIO;
	private String STOCK;
	
	//GETTER AND SETTER
	public Integer getID_CONFITERIA() {
		return ID_CONFITERIA;
	}
	public void setID_CONFITERIA(Integer iD_CONFITERIA) {
		ID_CONFITERIA = iD_CONFITERIA;
	}
	public String getNOMBRE_CONFI() {
		return NOMBRE_CONFI;
	}
	public void setNOMBRE_CONFI(String nOMBRE_CONFI) {
		NOMBRE_CONFI = nOMBRE_CONFI;
	}
	public Double getPRECIO_UNITARIO() {
		return PRECIO_UNITARIO;
	}
	public void setPRECIO_UNITARIO(Double pRECIO_UNITARIO) {
		PRECIO_UNITARIO = pRECIO_UNITARIO;
	}
	public String getSTOCK() {
		return STOCK;
	}
	public void setSTOCK(String sTOCK) {
		STOCK = sTOCK;
	}
	
	@Override
	public String toString() {
		return "Confiteria [ID_CONFITERIA=" + ID_CONFITERIA + ", NOMBRE_CONFI=" + NOMBRE_CONFI + ", PRECIO_UNITARIO="
				+ PRECIO_UNITARIO + ", STOCK=" + STOCK + "]";
	}
	
	
	
}
