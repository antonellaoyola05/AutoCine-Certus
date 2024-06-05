package net.AutoCine.model;

public class Sala {
	private String imagen="no-image.jpg";
	private Integer id;
	private String nombre;
	private String ubicacion;
	private Integer capacidad;
	private String caracteristicas1;
	private String caracteristicas2;
	private Integer destacado;
	private String estatus;
	private String detalles;
	private String vermas;
	
	//GETTER AND SETTER

	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public String getCaracteristicas1() {
		return caracteristicas1;
	}
	public void setCaracteristicas1(String caracteristicas1) {
		this.caracteristicas1 = caracteristicas1;
	}
	public String getCaracteristicas2() {
		return caracteristicas2;
	}
	public void setCaracteristicas2(String caracteristicas2) {
		this.caracteristicas2 = caracteristicas2;
	}
	public Integer getDestacado() {
		return destacado;
	}
	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public String getVermas() {
		return vermas;
	}
	public void setVermas(String vermas) {
		this.vermas = vermas;
	}
	
	@Override
	public String toString() {
		return "Sala [imagen=" + imagen + ", id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion
				+ ", capacidad=" + capacidad + ", caracteristicas1=" + caracteristicas1 + ", caracteristicas2="
				+ caracteristicas2 + ", destacado=" + destacado + ", estatus=" + estatus + ", detalles=" + detalles
				+ ", vermas=" + vermas + "]";
	}
	
	
	
	
}
