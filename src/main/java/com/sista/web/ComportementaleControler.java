package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@PostMapping("/updateComportementale/{id}")
	public String updateComportementale(@PathVariable Long id , @RequestBody Comportementale comportementale) {
		try {
			comportementale.setComportementale_id(id);
			comportementaleService.updateComportementale(comportementale);
			
			return "L'objet comportementale a été bien modifié";
			
		}catch(Exception exp) {
			return  exp.getMessage()+ "....L'objet comportementale n'a pas été modifié";
		}
	}
	
	@GetMapping("findByid/{id}")
	public Comportementale finById(@PathVariable Long id) {
		return comportementaleService.findById(id);
	}
}
