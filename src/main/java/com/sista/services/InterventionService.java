package com.sista.services;

import java.util.List;

import com.sista.entities.Intervention;

public interface InterventionService {
	
	public Intervention findIntervention(Long interId);
	
	public List<Intervention> findAll();
	
	public List<Intervention> toutInter();
}
