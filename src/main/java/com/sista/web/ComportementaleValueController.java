package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.dto.ComportementaleValue;
import com.sista.services.comportementalevalueServiceImp;

@RequestMapping("/comportementalVal")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ComportementaleValueController {

	@Autowired
	private comportementalevalueServiceImp comportementalevalueservice;
	
	
	@GetMapping("/listcomportementalevalue/{idLevel}")
	public List<ComportementaleValue> listcomportementalevalue(@PathVariable Long idLevel) {
		return comportementalevalueservice.listcomportementalevalue(idLevel);
	}
}

