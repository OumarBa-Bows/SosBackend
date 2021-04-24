package com.sista.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
