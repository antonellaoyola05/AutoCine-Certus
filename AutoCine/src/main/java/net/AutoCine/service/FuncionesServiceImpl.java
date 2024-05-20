package net.AutoCine.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import net.AutoCine.model.Funciones;

import org.springframework.stereotype.Service;

@Service
public class FuncionesServiceImpl implements IFuncionesService {

	private List<Funciones> lista_funciones = null;
 
	private FuncionesServiceImpl() {  
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista_funciones = new LinkedList<Funciones>();
   
		try {
			// CREAMOS LAS FUNCIONES 
			// PRIMERA FUNCION 
			Funciones funcion1 = new Funciones(); 
			funcion1.setNOMBRE_PELICULA("Hachiko");  
			funcion1.setID_FUNCION(1); 
			funcion1.setID_SALA(1);         
			funcion1.setID_SEDE(1); 
			funcion1.setFECHA(sdf.parse("17-02-2024"));  
			funcion1.setImagen("pelicula1.png");         
			funcion1.setDESCRIPCION( 
					"Parker Wilson (Richard Gere, 'El caso Wells') es un profesor de universidad que trabaja lejos de su casa. Todos los días se acerca a la estación de tren para trasladarse a su oficio. No obstante, un día en el que regresa del trabajo, encuentra en la estación de tren un perro, aún cachorro, de la raza akita. Sin saber con quién dejar al animal, decide llevárselo a su casa aun sabiendo que su esposa no quiere tener animales en casa. Con el paso del tiempo, Parker y \"Hachi\", su nueva mascota, se terminan haciendo inseparables, acompañando el perro a su dueño en todas las tareas de casa. Tanto es el grado en el que se quieren que Hachi, al crecer, termina yendo a buscar a su dueño cada día a la estación de tren, ya que le echa de menos.");

			// SEGUNDA FUNCION  
			Funciones funcion2 = new Funciones();
			funcion2.setNOMBRE_PELICULA("The Avengers");        
			funcion2.setID_FUNCION(2); 
			funcion2.setID_SALA(4);
			funcion2.setID_SEDE(2);
			funcion2.setFECHA(sdf.parse("05-08-2024"));
			funcion2.setImagen("pelicula2.png");
			funcion2.setDESCRIPCION(
					"Cuando un enemigo inesperado surge como una gran amenaza para la seguridad mundial, Nick Fury, director de la Agencia SHIELD, decide reclutar a un equipo para salvar al mundo de un desastre casi seguro. Adaptación del cómic de Marvel \"Los Vengadores\", el legendario grupo de superhéroes formado por Ironman, Hulk, Thor y el Capitán América entre otros. (FILMAFFINITY)");

			// TERCERA FUNCION
			Funciones funcion3 = new Funciones();
			funcion3.setNOMBRE_PELICULA("Turning Red");
			funcion3.setID_FUNCION(3);
			funcion3.setID_SALA(2);
			funcion3.setID_SEDE(4); 
			funcion3.setFECHA(sdf.parse("25-08-2024"));
			funcion3.setImagen("pelicula3.png"); 
			funcion3.setDESCRIPCION( 
					"Mei Lee, una niña de 13 años un poco rara pero segura de sí misma, se debate entre ser la hija obediente que su madre quiere que sea y el caos propio de la adolescencia. Ming, su protectora y ligeramente exigente madre, no se separa nunca de ella lo que es una situación poco deseable para una adolescente. Y por si los cambios en su vida y en su cuerpo no fueran suficientes, cada vez que se emociona demasiado (lo que le ocurre prácticamente todo el tiempo), se convierte en un panda rojo gigante. (FILMAFFINITY)");
 
			// CUARTA FUNCION 
			Funciones funcion4 = new Funciones(); 
			funcion4.setNOMBRE_PELICULA("Ni idea");   
			funcion4.setID_FUNCION(4);
			funcion4.setID_SALA(3); 
			funcion4.setID_SEDE(2);     
			funcion4.setFECHA(sdf.parse("20-09-2024"));  
			funcion4.setImagen("pelicula4.png");
			funcion4.setDESCRIPCION(
					"En la comedia norteamericana Ni idea, la popular estudiante de una elitista secundaria de Beverly Hills, Cher Horowitz tiene una preocupación mayor que sacar buenas calificaciones en la escuela, su preocupación es llevar la ropa más atractiva y novedosa y mantener su estatus de popularidad intacto y en ascenso. Con su mejor amiga Dionne, Cher pasa los días del colegio gozando de sus privilegios y ventajas como la popular rubia de la institución. Sin embargo, en el fondo de todo lo artificial que muestra, Cher es una sensible chica, preocupada por los demás y siempre busca ayudarlos a conseguir sus objetivos, aunque sean desconocidos. ");

			// QUINTA FUNCION
			Funciones funcion5 = new Funciones();
			funcion5.setNOMBRE_PELICULA("Así en la tierra como en el infierno");
			funcion5.setID_FUNCION(5);        
			funcion5.setID_SALA(1);
			funcion5.setID_SEDE(4);
			funcion5.setFECHA(sdf.parse("24-07-2024"));
			funcion5.setImagen("pelicula5.png");
			funcion5.setDESCRIPCION(
					"Miles de laberintos se enredan en las catacumbas que se encuentran debajo de las calles de París, el hogar eterno de las innumerables almas. Cuando un equipo de exploradores se adentra en el laberinto desconocido de los huesos, descubrirán aquello que oculta la ciudad de las muertos. Un viaje a la locura y el terror que cala hondo en la psique humana para revelar los demonios personales que nos persiguen a todos.\r\n"
					+ "\r\n"
					+ "Nueva cinta del realizador, experto en cine de terror, John Erick Dowdle (La trampa del mal, Quarantine), un 'found footage' protagonizado por Ben Feldman (Mad Men) y Perdita Weeks (The Invisible Woman).");

			// AGREGAMOS LOS ELEMENTOS A LA LISTA
			lista_funciones.add(funcion1);
			lista_funciones.add(funcion2);
			lista_funciones.add(funcion3);
			lista_funciones.add(funcion4);
			lista_funciones.add(funcion5);

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	@Override
	public List<Funciones> buscarTodasFunciones() {
		// TODO Auto-generated method stub
		return lista_funciones;
	}

	@Override
	public Funciones buscarPorIdFUNCION(Integer ID_FUNCION) {
		// TODO Auto-generated method stub
		for (Funciones f : lista_funciones) {
			if (f.getID_FUNCION() == ID_FUNCION) {
				return f;
			}
		}

		return null;
	}

	@Override
	public void guardar(Funciones funciones) {
		// TODO Auto-generated method stub
		lista_funciones.add(funciones);
	}

}
