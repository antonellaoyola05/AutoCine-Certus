package net.AutoCine.service;

import java.util.List;

import net.AutoCine.model.Sede;

public interface ISedeService {
	List<Sede> buscarTodasSedes();
	Sede buscarPorIdSEDE (Integer idSede);
}
