package it.sincrono.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class MainController {

@RequestMapping("index")
	
	public String getIndex(Model m) {
		
		return "index";
	}
	

@RequestMapping("inserimentoUtente")

	public String getInserimentoUtente(Model m) {
	
	
	return "other/inserimentoUtente";
}
}






