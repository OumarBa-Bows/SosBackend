package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
import com.sista.services.inf_intervenantServiceImp;

@RequestMapping("/infinertenant")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class inf_intervenantxController {
	
	@Autowired
	public inf_intervenantServiceImp infintervenantService;
	
	@GetMapping("/get/{intervenant}")
	public Inf_intervenant findByintervenant(@PathVariable float intervenant){
		return infintervenantService.findByintervenant(intervenant);
	}
	
		
 
}
