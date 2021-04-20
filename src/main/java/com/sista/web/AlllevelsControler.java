package com.sista.web;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sista.dto.AllLevels;
import com.sista.services.AllLevelserviceImp;

@RequestMapping("/alllevels")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AlllevelsControler {
	
	@Autowired
	AllLevelserviceImp alllevelsService;
	
	@GetMapping("/levels")
	public List<AllLevels> levels(){
		return alllevelsService.levels();
	}
	
	@GetMapping("/findByStructureName/{structureName}")
	public List<AllLevels> findByStructureName(@PathVariable String structureName){
		System.out.println(structureName+"========");
		return alllevelsService.findByStructureName(structureName);
	}
	
	
	@GetMapping("/findByDate/{datebut}/{datefin}")
	public List<AllLevels>  findByDates(@PathVariable BigDecimal datebut, @PathVariable BigDecimal datefin){
		return alllevelsService.findByDate(datebut, datefin);
	}
}
