package net.AutoCine.model;

public class Sala {
	private Integer ID_SALA;
	private String DESCRIPCION;
	public Integer getID_SALA() {
		return ID_SALA;
	}
	public void setID_SALA(Integer iD_SALA) {
		ID_SALA = iD_SALA;
	}
	public String getDESCRIPCION() {
		return DESCRIPCION;
	}
	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}
	@Override
	public String toString() {
		return "Sala [ID_SALA=" + ID_SALA + ", DESCRIPCION=" + DESCRIPCION + "]";
	}
	
	
}
