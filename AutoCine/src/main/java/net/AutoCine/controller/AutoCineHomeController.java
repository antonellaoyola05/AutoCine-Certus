package net.AutoCine.controller; //PAQUETE

//import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.AutoCine.model.Funciones;
import net.AutoCine.model.Peliculas;
import net.AutoCine.model.Sede;
import net.AutoCine.service.IFuncionesService;
import net.AutoCine.service.IPeliculasService;
import net.AutoCine.service.ISedeService;



@Controller
public class AutoCineHomeController {
	
	@Autowired
	private IFuncionesService serviceFunciones;
	
	@Autowired
	private IPeliculasService servicePeliculas;
	
	@Autowired
	private ISedeService serviceSedes;
   
	@GetMapping("/")//RUTA PRINCIPAL ES HOME
	public String mostrarHome(Model model) { 
		
		model.addAttribute("nombre","Antonella");  
		model.addAttribute("orden", 10); 
		return "home";
	}
	 
	//RUTA
	@GetMapping("/categorias.html") 
	public String mostrarCategorias(Model model) {
		//LISTA DE GÉNEROS
		 
		List<String> categorias = new LinkedList<String>();
		categorias.add("Romance");   
		categorias.add("Terror");  
		categorias.add("Comedia");
		categorias.add("Suspenso");  
		categorias.add("Drama");
		categorias.add("Thriller"); 
		
		model.addAttribute("categorias",categorias);
		model.addAttribute("titulo", "AutoCine");
		return "categorias";
	}
	
	@GetMapping("/funciones.html")
	public String mostrarFunciones(Model model) {
		List<Funciones> lista = serviceFunciones.buscarTodasFunciones();//getVacantes();
		model.addAttribute("funciones", lista);
		
		return "Funciones/funciones"; 
	}
	
	@GetMapping("/peliculas.html") //En la directo desde el home
	public String mostrarPelicula(Model model) {
		List<Peliculas> lista_Peliculas = servicePeliculas.buscarTodasPelicula();
		model.addAttribute("peliculas", lista_Peliculas);
				
		return "Pelicula/peliculas"; //Enlace del contenido Carpeta/archivohtml
	}
	
	@GetMapping("/sala.html")
	public String mostrarSala(Model model) {
		int ID_SALA = 1548;
		String DESCRIPCION = "Sala VIP , SofaCama";
			
		model.addAttribute("DESCRIPCION", DESCRIPCION);
		model.addAttribute("ID_SALA",ID_SALA)	;	
		model.addAttribute("titulo", "AutoCine");
		return "sala";
	}
	
	
	
	@GetMapping("/confiteria.html")
	public String mostrarConfiteria(Model model) {
		int ID_CONFITERIA = 22312;
		String NOMBRE_CONFI = "Palomitas Saladas XXL";
		Double PRECIO_UNITARIO = 15.3;
		String STOCK = "45";
		
		model.addAttribute("ID_CONFITERIA", ID_CONFITERIA);
		model.addAttribute("NOMBRE_CONFI", NOMBRE_CONFI);
		model.addAttribute("PRECIO_UNITARIO", PRECIO_UNITARIO);
		model.addAttribute("STOCK", STOCK);
		model.addAttribute("titulo", "AutoCine");
		return "confiteria";
	}
	
	@GetMapping("/sede.html")
	public String mostrarSede(Model model) {
		
		List<Sede> lista = serviceSedes.buscarTodasSedes();
		model.addAttribute("sedes", lista);
		
		return "Sede/sede";
	}
	@GetMapping("Sede/sedeCuadros.html")
	public String mostrarSedeCuadro(Model model) {
		
		List<Sede> lista = serviceSedes.buscarTodasSedes(); 
		model.addAttribute("sedes", lista);
		
		return "Sede/sedeCuadros";
	}
	
	
}
