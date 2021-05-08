package com.sista.services;

import java.util.List;
import java.util.Optional;

import com.sista.entities.Inf_intervenant;

public interface Inf_IntervenantService {
	
	public List<Inf_intervenant> findALl();
	
	public Inf_intervenant findByintervenant(float intervenant);
	
	public boolean updateInf_intervenant(Inf_intervenant infInter);
}
