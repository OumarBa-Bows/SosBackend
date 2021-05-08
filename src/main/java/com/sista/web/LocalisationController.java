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

import com.sista.entities.Localisation;
import com.sista.services.LocalisationServiceImp;

@RequestMapping("/localisation")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LocalisationController {
	
	@Autowired
	private LocalisationServiceImp localisationService;
	
	@GetMapping("/findAll")
	public List<Localisation> findAll(){
		return localisationService.findALl();
	}
	
	@PostMapping("/upadate/{id}")
	public String updateLocalisation(@PathVariable Long id, @RequestBody Localisation localistion) {
		try {
			localistion.setLocalisation_id(id);
			localisationService.updateLocalisation(localistion);
			return "L'objet localisation a été modifié";
		}catch(Exception e) {
			return e.getMessage() + " erreur de modification";
		}
	}
	
	@GetMapping("/findById/{id}")
	public Localisation findByIdLocalisation(@PathVariable Long id) {
		return localisationService.findByIdLocalisation(id);
	}
}
