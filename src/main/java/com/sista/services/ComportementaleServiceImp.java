package com.sista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.ComportementaleRepository;
import com.sista.entities.Comportementale;

@Service
public class ComportementaleServiceImp implements ComportementaleService{

	@Autowired
	ComportementaleRepository comportementalService;
	
	@Override
	public List<Comportementale> findAll() {
		// TODO Auto-generated method stub
		return comportementalService.findAll();
	}

}
