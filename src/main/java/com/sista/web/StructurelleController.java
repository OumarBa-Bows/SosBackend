package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.entities.Structurelle;
import com.sista.services.StructurelleServiceImp;

@RequestMapping("/struct")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StructurelleController {
 
	@Autowired
	private StructurelleServiceImp structurelleService;
	
	
	@GetMapping("/all")
	public List<Structurelle> findall(){
		return structurelleService.findAll();
	}
	
	@PostMapping("/updateStruc/{idStruc}")
	public String updateStructure(@PathVariable Long idStruc, @RequestBody Structurelle struc) {
		try {
			struc.setStructurelle_id(idStruc);
			structurelleService.updateStructure(struc);
			return "L'objet structurelle a été bien enregistrer";
		}catch(Exception e) {
			return e.getMessage() + "Erreur de modification";
		}
	}
}

