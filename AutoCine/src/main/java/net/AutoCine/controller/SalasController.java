package net.AutoCine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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

import net.AutoCine.model.Sala;
import net.AutoCine.service.ISalaService;

@Controller
@RequestMapping("/salas")
public class SalasController {
	@Autowired
	private ISalaService serviceSalas;
	
	@GetMapping("/create")
	public String crear() {
		return "vacantes/formVacante";
	}
	
	@PostMapping("/save")
	public String guardar(Sala sala){
		serviceSalas.guardar(sala);
		System.out.println("Sala: " + sala);
		
		return "vacantes/listVacantes";
	}
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id")int idSala, Model model) {
		System.out.println("Borrando sala con id: " +idSala);
		model.addAttribute("id", idSala);
		return "Sala/mensajeSala";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idSala, Model model){
		
		Sala sala = serviceSalas.buscarPorIdSALA(idSala);
		System.out.println("Sala: " +sala);
		model.addAttribute("sala", sala);
		
		//BUSCAR LOS DETALLES DE LAS VACANTES EN ID BD...
		return "Sala/salaDetalle";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
}
