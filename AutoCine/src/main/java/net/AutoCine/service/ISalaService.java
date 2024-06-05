package net.AutoCine.service;

import java.util.List;

import net.AutoCine.model.Sala;

public interface ISalaService {
	List<Sala> buscarTodasSalas();
	Sala buscarPorIdSALA(Integer idSala);
	void guardar(Sala sala);
} 
