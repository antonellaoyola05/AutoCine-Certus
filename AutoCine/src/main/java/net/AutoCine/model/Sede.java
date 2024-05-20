package net.AutoCine.model;

public class Sede {
	//CAMPOS
	private Integer ID_SEDE;
	private String sedeNombre;
	private String ciudad;
	private String distrito;
	private Integer numSala;
	private Integer destacado;
	private String confiteria;
	private String imagen="no-imagen.png";
	
	
	//GETTER AND SETTER
	public Integer getID_SEDE() {
		return ID_SEDE;
	}


	public void setID_SEDE(Integer iD_SEDE) {
		ID_SEDE = iD_SEDE;
	}


	public String getSedeNombre() {
		return sedeNombre;
	}


	public void setSedeNombre(String sedeNombre) {
		this.sedeNombre = sedeNombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDistrito() {
		return distrito;
	}


	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}


	public Integer getNumSala() {
		return numSala;
	}


	public void setNumSala(Integer numSala) {
		this.numSala = numSala;
	}


	public Integer getDestacado() {
		return destacado;
	}


	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}


	public String getConfiteria() {
		return confiteria;
	}


	public void setConfiteria(String confiteria) {
		this.confiteria = confiteria;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	@Override
	public String toString() {
		return "Sede [ID_SEDE=" + ID_SEDE + ", sedeNombre=" + sedeNombre + ", ciudad=" + ciudad + ", distrito="
				+ distrito + ", numSala=" + numSala + ", destacado=" + destacado + ", confiteria=" + confiteria
				+ ", imagen=" + imagen + "]";
	}
	
	
	
	
}
