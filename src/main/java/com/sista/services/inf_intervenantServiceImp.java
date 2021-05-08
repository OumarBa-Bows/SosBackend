package com.sista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.Inf_intervenantRepository;
import com.sista.entities.Biomedicale;
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


	@Override
	public boolean updateInf_intervenant(Inf_intervenant infInter) {
		Optional<Inf_intervenant> infIntervenat1 = infintervenantRepos.findById(infInter.getInf_intervenant_id());
		if(infIntervenat1 != null) {
			Inf_intervenant infIntervenant2 = infIntervenat1.get();
			infIntervenant2.setIntervenant(infInter.getIntervenant());
			infIntervenant2.setNom_interv(infInter.getNom_interv());
			infIntervenant2.setDate_interview(infInter.getDate_interview());
			infIntervenant2.setHeur_intervention(infInter.getHeur_intervention());
			infIntervenant2.setDate_modif(infInter.getDate_modif());
			infIntervenant2.setHeure_modif(infInter.getHeure_modif());
			infIntervenant2.setType_cas(infInter.getType_cas());
			infintervenantRepos.save(infIntervenant2);
			return true;
		}
		return false;
	}


	@Override
	public List<Inf_intervenant> findALl() {
		// TODO Auto-generated method stub
		return infintervenantRepos.findAll();
	}
}
