package net.AutoCine.service;

import java.util.List;

import net.AutoCine.model.Peliculas;

public interface IPeliculasService {
	List<Peliculas>buscarTodasPelicula();
	Peliculas buscarPorIdPelicula(Integer ID_PELICULA);
	void guardar (Peliculas pelicula);
}
