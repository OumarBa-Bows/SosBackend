package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.entities.Intervention;
import com.sista.services.InterventionServiceImp;

@RequestMapping("/intervention")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class InterventionController {
	
	@Autowired
	InterventionServiceImp intervenantService;
	
	@GetMapping("/getInter/{idintervention}")
	public Intervention findIntervention(@PathVariable Long idintervention) {
		return intervenantService.findIntervention(idintervention);
	}
	
	@GetMapping("/findall")
	public List<Intervention> findAll(){
		return intervenantService.findAll();
	}
	
	
	@GetMapping("/tourInter")
	public List<Intervention> toutInter(){
		return intervenantService.toutInter();
	}
}

