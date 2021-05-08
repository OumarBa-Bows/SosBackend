package com.sista.services;

import java.util.List;

import com.sista.entities.Localisation;

public interface LocalisationService {

	public List<Localisation> findALl();
	public boolean updateLocalisation(Localisation localisation);
	
	public Localisation findByIdLocalisation(Long id);
}
