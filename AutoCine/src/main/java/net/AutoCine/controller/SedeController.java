package net.AutoCine.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.AutoCine.model.Sede;
import net.AutoCine.service.ISedeService;

@Controller
@RequestMapping("/Sede/Detalle")
public class SedeController {
	@Autowired
	private ISedeService serviceSedes;
	
	@GetMapping("/view/{ID_SEDE}")
	public String verDetalle(@PathVariable("ID_SEDE") int idSede, Model model) {
		
		Sede sede = serviceSedes.buscarPorIdSEDE(idSede);
		
		System.out.println("Sede: " + sede);
		model.addAttribute("sede", sede);
		return "/Sede/sedeDetalles";
	}
	
	
}
