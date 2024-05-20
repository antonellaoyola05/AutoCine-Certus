package net.AutoCine.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.AutoCine.model.Sede;

@Service
public class SedeServiceImpl implements ISedeService{
private List<Sede> lista = null;
	
	public SedeServiceImpl() {
		lista = new LinkedList<Sede>();
		
			Sede sede1 = new Sede();
			sede1.setImagen("pelicula1.png");
			sede1.setID_SEDE(1);
			sede1.setDistrito("San Juan de Lurigancho");
			sede1.setNumSala(3);
			sede1.setSedeNombre("Las cucardas 143");
			sede1.setCiudad("Lima");
			sede1.setDestacado(1);
			sede1.setConfiteria("El bicho, siuuu");
			
			
			Sede sede2 = new Sede();
			sede2.setImagen("pelicula2.png");
			sede2.setID_SEDE(2);
			sede2.setCiudad("Lima");
			sede2.setNumSala(4);
			sede2.setSedeNombre("Las Auroras 487");
			sede2.setDistrito("San Juan de Miraflores");
			sede2.setDestacado(1);
			sede2.setConfiteria("Te la comes tu o me la como yo");
			
			
			Sede sede3 = new Sede();
			sede3.setImagen("pelicula3.png");
			sede3.setID_SEDE(3);
			sede3.setCiudad("Lima");
			sede3.setSedeNombre("Ni idea xd");
			sede3.setDistrito("San Juan de Miraflores");
			sede3.setNumSala(1);
			sede3.setDestacado(0);
			sede3.setConfiteria("si no te gusta xd pagina da un like");
			
			
			lista.add(sede1);
			lista.add(sede2);
			lista.add(sede3);
			
	}

	@Override
	public List<Sede> buscarTodasSedes() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Sede buscarPorIdSEDE(Integer idSede) {
		// TODO Auto-generated method stub
		for(Sede v: lista) {
			if(v.getID_SEDE() == idSede) {
				return v;
			}
		}
		
		return null;
	}
}
