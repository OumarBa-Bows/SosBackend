package com.sista.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.Inf_intervenantRepository;
import com.sista.entities.Inf_intervenant;

@Service
public class inf_intervenantServiceImp implements Inf_IntervenantService{

	@Autowired
	Inf_intervenantRepository infintervenantRepos;
	
	
	@Override
	public Inf_intervenant findByintervenant(float intervenant) {
		
		Inf_intervenant infinter = null;
		if(infintervenantRepos.findByintervenant(intervenant).isPresent()) {
			infinter = infintervenantRepos.findByintervenant(intervenant).get();
			
		}
		return infinter;
		
	}
}
