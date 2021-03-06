package com.sista.services;

import java.util.List;

import com.sista.entities.Biomedicale;



public interface BiomedicaleService {
	
	public List<Biomedicale> findAll();

	boolean updateBiomedicale(Biomedicale biomedicale);
	
	Biomedicale findById(Long bioId);
}
