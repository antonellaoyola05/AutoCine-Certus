package net.AutoCine.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
//import java.util.LinkedList;
import org.springframework.stereotype.Service;

import net.AutoCine.model.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService{
	
	private List<Peliculas> lista_Peliculas = null;
	
	private PeliculasServiceImpl() {

		lista_Peliculas = new LinkedList<Peliculas>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try { //CREAMOS LAS PELICULAS 
			//PRIMERA PELICULA
			Peliculas pelicula1 = new Peliculas();
			pelicula1.setID_PELICULA(1);
			pelicula1.setNOMBRE("La bella y la bestia");
			pelicula1.setDESCRIPCION("Una joven soñadora y romántica llamada Bella (Emma Watson) vive en una pequeña aldea junto a su padre, un inventor de artilugios, al que algunos consideran un anciano demente. Un día, su padre viaja a una feria para exponer sus inventos, pero se pierde en el camino y acaba en un viejo y misterioso castillo. Buscando cobijo y un lugar donde pasar la noche, el padre de Bella descubre que el señor de ese castillo es una horrible Bestia (Dan Stevens).");
			pelicula1.setFECHA_PUBLICACION(sdf.parse("12-01-1999"));
			pelicula1.setID_FUNCION(1);
			pelicula1.setID_CAT(2);
			pelicula1.setImagen("pelicula1.png");
			
			//PRIMERA PELICULA
			Peliculas pelicula2 = new Peliculas();
			pelicula2.setID_PELICULA(2);
			pelicula2.setNOMBRE("Diario de una Pasión");
			pelicula2.setDESCRIPCION("En un hogar para ancianos, Duke obtiene permiso para leerle una historia romántica a una residente, la señora Hamilton, que sufre de demencia senil y pérdida de memoria. Ella recuerda partes de la historia, aunque sólo algunas partes y con cierta reserva. La historia inicia a finales de la década de los años 30, cuando una joven de familia adinerada, Allie Hamilton (Rachel McAdams), pasa las variaciones de verano en Seabrook.");
			pelicula2.setFECHA_PUBLICACION(sdf.parse("12-01-1999"));
			pelicula2.setID_FUNCION(3);
			pelicula2.setID_CAT(1);
			pelicula2.setImagen("pelicula2.png");
			//AGREGAMOS LOS ELEMENTOS A LA LISTA
			lista_Peliculas.add(pelicula1);
			lista_Peliculas.add(pelicula2);
			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	@Override
	public List<Peliculas> buscarTodasPelicula() {
		// TODO Auto-generated method stub
		return lista_Peliculas;
	}

	@Override
	public Peliculas buscarPorIdPelicula(Integer ID_PELICULA) {
		// TODO Auto-generated method stub
		for(Peliculas p : lista_Peliculas) {
			if(p.getID_PELICULA() == ID_PELICULA) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void guardar(Peliculas peliculas) {
		// TODO Auto-generated method stub
		lista_Peliculas.add(peliculas);
		
	}
	
	
}
