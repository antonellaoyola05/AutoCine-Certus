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

import net.AutoCine.model.Funciones;
import net.AutoCine.service.IFuncionesService;

@Controller
@RequestMapping("/funciones")
public class FuncionesController {
	
	@Autowired 
	private IFuncionesService serviceFunciones; 
	
	//INICIO DE RUTAS DEL MENÚ
	
	//FIN DE RUTAS DE MENÚ
	
	@GetMapping("/funcionesTabla.html") //Mostramos en el navegador como local.../funciones/tablaFunciones
	public String mostrarTabla(Model model) {
		List<Funciones> listaFunciones = serviceFunciones.buscarTodasFunciones();
		model.addAttribute("funciones", listaFunciones);
		
		return "Funciones/funcionesTabla";// archivohtml
	}
   
	@GetMapping("/create")
	public String crear() { 
		return "Funciones/formFuncion";
	}
	
	@PostMapping("/save")
	public String guardar(Funciones funcion) {
		System.out.println("Funciones: " + funcion);
		
		return "Funciones/listFunciones";
	}
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("ID_FUNCION") int ID_FUNCION, Model model) {
		System.out.println("Borrar funcion con ID: " + ID_FUNCION);
		model.addAttribute("ID_FUNCION" , ID_FUNCION);
		return "Funciones/mensajeFunciones";//archivohtml
	}
	
	@GetMapping("/view/{ID_FUNCION}")//ruta como se muestra en el navegador
	public String verDetalle(@PathVariable("ID_FUNCION") int ID_FUNCION, Model model) {
		
		Funciones funcion = serviceFunciones.buscarPorIdFUNCION(ID_FUNCION);
		
		System.out.println("Funcion: " + funcion);
		model.addAttribute("funcion",funcion);
		
		return "Funciones/funcionesDetalle";//noombre de la ruta/Archivohtml
	}
	
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
}
