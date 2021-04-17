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
import com.sista.entities.Structurelle;
import com.sista.services.Level1serviceImp;

@RequestMapping("/levels")
@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class Level1Controller {

	@Autowired
	Level1serviceImp levelservice;
	
	@GetMapping("/all")
	public List<Level1> findall(){
		return levelservice.find();
	}
	
	
	@GetMapping("/findALlStructure/{levelId}")
	public List<Structurelle> findALlStructure(@PathVariable Long levelId){
		return levelservice.findAllStructures(levelId);
	}
	
	@GetMapping("/findAllInf/{levelId}")
	public List<Inf_intervenant> findAllInf(@PathVariable Long levelId){
		return levelservice.findAllInf_intervenant(levelId);
	}
}
