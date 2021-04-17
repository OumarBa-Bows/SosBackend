package com.sista.services;

import java.util.List;

import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
import com.sista.entities.Structurelle;

public interface Level1Service {

	public List<Level1> find();
	
	public List<Structurelle> findAllStructures(Long levelId);
	public List<Inf_intervenant> findAllInf_intervenant(Long levelId);
}
