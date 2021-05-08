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

import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
import com.sista.services.inf_intervenantServiceImp;

@RequestMapping("/infintervenant")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class inf_intervenantController {
	
	@Autowired
	public inf_intervenantServiceImp infintervenantService;
	
	@GetMapping("/get/{intervenant}")
	public Inf_intervenant findByintervenant(@PathVariable float intervenant){
		return infintervenantService.findByintervenant(intervenant);
	}
	
	@PostMapping("/update/{id}")
	public String updateInf_intervenant(@PathVariable Long id,  @RequestBody Inf_intervenant infInter) {
		try {
			infInter.setInf_intervenant_id(id);
			infintervenantService.updateInf_intervenant(infInter);
			return "L'objet a été bien modifié";
		}catch(Exception e) {
			return  "Erreur de modification: " + e.getMessage(); 
		}
	}
	
	@GetMapping("/findAll")
	public List<Inf_intervenant> findALl(){
		return infintervenantService.findALl();
	}
		
 
}
