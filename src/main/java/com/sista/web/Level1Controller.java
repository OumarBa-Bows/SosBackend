package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.entities.Biomedicale;
import com.sista.entities.Comportementale;
import com.sista.entities.Inf_intervenant;
import com.sista.entities.Intervention;
import com.sista.entities.Level1;
import com.sista.entities.Localisation;
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
	
	@GetMapping("/findById/{id}")
	public Level1 findById(@PathVariable Long id) {
		return levelservice.findById(id);
	}
	//..............................................................................
	@GetMapping("/allbiomedicale/{idlevel1}")
	public List<Biomedicale> allbiomedicale(@PathVariable Long idlevel1){
		return levelservice.allbiomedicale(idlevel1);
	}
	
	@GetMapping("/allcomportementals/{levelId}")
	public List<Comportementale> allcomportementals(@PathVariable Long levelId){
		return levelservice.allcomportementals(levelId);
	}
	
	@GetMapping("/allintervention/{levelId}")
	public List<Intervention> allintervention(@PathVariable Long levelId){
		return levelservice.allintervention(levelId);
	}
	
	@GetMapping("/allinf_intervnetion/{levelId}")
	public List<Inf_intervenant> allinf_intervnetion(@PathVariable Long levelId){
		return levelservice.allinf_intervnetion(levelId);
	}
	
	@GetMapping("/allLocalisation/{levelId}")
	public List<Localisation> allLocalisation(@PathVariable Long levelId){
		return levelservice.allLocalisation(levelId);
	}

	
	@GetMapping("/allstructure/{levelId}")
	public List<Structurelle> allstructure(@PathVariable Long levelId){
		return levelservice.findAllStructures(levelId);
	}
}
