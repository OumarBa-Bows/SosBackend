package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.entities.Comportementale;
import com.sista.services.ComportementaleServiceImp;

@RequestMapping("/comportementales")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ComportementaleControler {
	
	@Autowired
	private ComportementaleServiceImp comportementaleService;
	
	@GetMapping("/all")
	public List<Comportementale> findAll(){
		return comportementaleService.findAll();
	}
}
