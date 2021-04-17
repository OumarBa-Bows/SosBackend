package com.sista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.BiomedicaleRepository;
import com.sista.entities.Biomedicale;

@Service
public class BiomedicaleServiceImp implements BiomedicaleService{
	
	@Autowired 
	private BiomedicaleRepository biomedicaleRepo;
	
	@Override
	public List<Biomedicale> findAll() {
		
		return biomedicaleRepo.findAll();
	}

}
