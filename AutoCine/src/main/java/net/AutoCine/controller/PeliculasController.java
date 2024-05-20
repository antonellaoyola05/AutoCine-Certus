package net.AutoCine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.AutoCine.model.Peliculas;
import net.AutoCine.service.IPeliculasService;

@Controller
@RequestMapping("/peliculas")
public class PeliculasController {

	@Autowired
	private IPeliculasService servicePeliculas;
	
	@GetMapping("/tablaPeliculas")
	public String mostrarTablaPelicula(Model model) {
		List<Peliculas> listaPeliculas = servicePeliculas.buscarTodasPelicula();
		model.addAttribute("peliculas", listaPeliculas);
		
		return "Pelicula/peliculasTabla";
	}
	
	@GetMapping("/createPeliculas")
	public String crearPelicula() {
		return "Pelicula/formPelicula";
	}
	
	@PostMapping("/savePeliculas")
	public String guadarPelicula(Peliculas pelicula) {
		System.out.println("Peliculas" + pelicula);
		
		return "Pelicula/listPeliculas";
	}
	
	@GetMapping("/deletePeliculas")
	public String eliminar(@RequestParam("ID_PELICULA") int ID_PELICULA, Model model) {
		System.out.println("Borrar Película con ID: " + ID_PELICULA);
		model.addAttribute("ID_PELICULA" , ID_PELICULA);
		return "Pelicula/mensajePeliculas";
	}
	
	@GetMapping("/view/{ID_PELICULA}")
	public String verPelicula(@PathVariable("ID_PELICULA") int ID_PELICULA, Model model) {
		Peliculas pelicula = servicePeliculas.buscarPorIdPelicula(ID_PELICULA);
		
		System.out.println("Pelicula: " + pelicula);
		model.addAttribute("pelicula", pelicula);
		
		return "Pelicula/peliculasDetalle";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
}
