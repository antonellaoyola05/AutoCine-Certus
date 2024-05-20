package net.AutoCine.service;

import java.util.List;

import net.AutoCine.model.Funciones;


public interface IFuncionesService {
	
	List<Funciones>buscarTodasFunciones();
	Funciones buscarPorIdFUNCION(Integer ID_FUNCION);
	void guardar (Funciones funcion);
	
}
