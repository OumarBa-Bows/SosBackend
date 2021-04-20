package com.sista.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.dto.IdentificationPersonnelle;
import com.sista.services.idefPersServiceImp;

@RequestMapping("/indentPersonnelle")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class indefPersController {

	@Autowired
	private idefPersServiceImp idefPersService;
	
	@GetMapping("/getIdentification/{idLevel}")
	public IdentificationPersonnelle getIdentification(@PathVariable Long idLevel) {
		return idefPersService.getIdentification(idLevel);
	}
}
