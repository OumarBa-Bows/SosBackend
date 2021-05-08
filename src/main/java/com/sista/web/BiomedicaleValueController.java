package com.sista.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.dto.BiomedicaleValue;

import com.sista.services.BiomedicaleValueServiceImp;

@RequestMapping("/biomedicalevalues")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BiomedicaleValueController {
	@Autowired
	BiomedicaleValueServiceImp biomedicaleservice;
	
	Logger logger = LoggerFactory.getLogger(BiomedicaleValueController.class);
	
	@GetMapping("/list/{idLevel}")
	public List<BiomedicaleValue> listBiomedicaleVlues(@PathVariable Long idLevel){
		logger.info("++++++++++............."+biomedicaleservice.listBiomedicaleVlues(idLevel));
		return biomedicaleservice.listBiomedicaleVlues(idLevel);
	}
	
	
	@GetMapping("/findByBioId/{idBio}")
	public BiomedicaleValue finfByBomedicaleId(@PathVariable Long idBio) {
		return biomedicaleservice.findByIdBiomedicale(idBio);
	}
	
	
}
