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

import com.sista.entities.Biomedicale;

import com.sista.services.BiomedicaleServiceImp;

@RequestMapping("/biomedicale")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BiomedicaleController {
	
	@Autowired
	BiomedicaleServiceImp biomedicaleService;
	
	@GetMapping("/findall")
	public List<Biomedicale> findAll(){
		return biomedicaleService.findAll();
	}
	
	@PostMapping("/updateBio/{idBio}")
	public String updateBiomedicale(@PathVariable Long idBio, @RequestBody Biomedicale biomedicale) {
		try {
			biomedicale.setBiomedicale(idBio);
			biomedicaleService.updateBiomedicale(biomedicale);
			return "L'objet biomedicale a été bien enregistrer";
		}catch(Exception e) {
			return e.getMessage()+ "Erreur de modication de l'objet biomedicale";
		}	
		
	}
	
	@GetMapping("/findById/{idBio}")
	public Biomedicale findByIdLong(@PathVariable Long idBio) {
		return biomedicaleService.findById(idBio);
	}

	
}
