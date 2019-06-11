package it.sincrono.corso.gestionale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class Main {

@RequestMapping(value="inserimentoUtente")
	
	public String getIndex(Model m) {
		
		return "other/inserimentoUtente";
	}
}