package com.curso.escuela.Blogeomain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	@Autowired
	Serviceapp serviceapp;

	@GetMapping({"/logeo","/"})
	public String greetingForm(Model model) {
		model.addAttribute("login", new Login());
		model.addAttribute("valor", new Valor());
		return "logeo";
	}

	@PostMapping("/logeado")
	public String greetingSubmit(@ModelAttribute Login login,Valor valor, Model modelo) {
		if (serviceapp.getAtributs(login,valor)) 
			return "logeado";
		serviceapp.agregarUsuario(login);
		modelo.addAttribute("estado", "El usuario no existe, por favor ingrese sus datos");
		return "noLogeado";
	}
	
	
	@PostMapping("/usuarioCreado")
	public String greetingSubmit2(@ModelAttribute Login login,Valor valor,Model model) {
		if (serviceapp.getAtributs(login,valor)) {
			model.addAttribute("estado", "Usuario registrado");
			return "logeo";
		}
		return "nologeado";
	}
	
	

}
