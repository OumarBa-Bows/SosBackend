package com.sista.services;

import java.util.List;

import com.sista.entities.Comportementale;

public interface ComportementaleService {

	List<Comportementale> findAll();

	Comportementale findById(Long id);
	boolean updateComportementale(Comportementale idcomp);
}
