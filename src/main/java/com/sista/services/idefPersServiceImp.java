package com.sista.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dto.IdentificationPersonnelle;
import com.sista.entities.Level1;
import com.sista.entities.Localisation;

@Service
public class idefPersServiceImp implements idefPersService{
	
	@Autowired
	private Level1serviceImp level1service; 
	@Autowired
	private AllLevelserviceImp alllevelservice;

	@Override
	public IdentificationPersonnelle getIdentification(Long idLevel) {
		// TODO Auto-generated method stub
		Level1 level =  level1service.findById(idLevel);
		IdentificationPersonnelle identpersonnelle = new IdentificationPersonnelle();
		
		
		identpersonnelle.setNumeroidentification(""+level.getId01()+level.getIdo()+level.getId02()+level.getId03()+level.getId04());
		Localisation localisation;
		if(level.getLocalisation().get(0) != null ) {
			localisation = level.getLocalisation().get(0);
			identpersonnelle.setNationnalite(alllevelservice.nationalite(localisation.getNationalite()));
			identpersonnelle.setSex(alllevelservice.sexe(localisation.getSexe()));
			identpersonnelle.setSituationmaretal(alllevelservice.situationmaretale(localisation.getSituation_matrim()));
		}
		
		return identpersonnelle;
	}

	
	
}
