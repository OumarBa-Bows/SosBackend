package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.dto.StructurelleValue;
import com.sista.services.StructurelleValueServiceImp;

@RequestMapping("/structurellevalues")
@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class StructurelleValueController {

	@Autowired
	StructurelleValueServiceImp structurelleValueService;
	
	
	@GetMapping("/Listvalues/{idLevel}")
	public List<StructurelleValue> getListStructurelleValue(@PathVariable Long idLevel){
		
		return structurelleValueService.getListStructurelle(idLevel);
	}
	
	@GetMapping("/findById/{idStruc}")
	public StructurelleValue findByIdStruc(@PathVariable Long idStruc) {
		return structurelleValueService.findByIdStruc(idStruc);
	}
}
