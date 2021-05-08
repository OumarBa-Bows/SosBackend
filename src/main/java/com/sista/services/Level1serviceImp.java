package com.sista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.Level1Repository;
import com.sista.entities.Biomedicale;
import com.sista.entities.Comportementale;
import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
import com.sista.entities.Localisation;
import com.sista.entities.Structurelle;

@Service
public class Level1serviceImp implements Level1Service{
	
	@Autowired 
	Level1Repository level1Repository;

	@Override
	public List<Level1> find() {
		// TODO Auto-generated method stub
		return level1Repository.findAll();
	}

	@Override
	public List<Structurelle> findAllStructures(Long levelId) {
		// TODO Auto-generated method stub
		return level1Repository.findallStructure(levelId);
	}

	@Override
	public List<Inf_intervenant> findAllInf_intervenant(Long levelId) {
		
		return level1Repository.findAllIntervenant(levelId);
	}

	@Override
	public Level1 findById(Long idLevel1) {
		Level1 level1 = level1Repository.findById(idLevel1).get();
		return level1;
	}

	@Override
	public List<Biomedicale> allbiomedicale(Long idlevel1) {
		Level1 level1 = level1Repository.findById(idlevel1).get();
		return level1.getBiomedicale();
	}

	@Override
	public List<Comportementale> allcomportementals(Long idlevel1) {
		Level1 level1 = level1Repository.findById(idlevel1).get();
		return level1.getComportementale();
	}



	@Override
	public List<Inf_intervenant> allinf_intervnetion(Long idlevel1) {
		Level1 level1 = level1Repository.findById(idlevel1).get();
		return level1.getInf_intervention();
	}

	@Override
	public List<Localisation> allLocalisation(Long idlevel1) {
		Level1 level1 = level1Repository.findById(idlevel1).get();
		return level1.getLocalisation();
	}

	@Override
	public boolean updateLevel(Level1 level) {
		Optional<Level1> level1 = level1Repository.findById(level.getLevel());
		if(level1 != null) {
			Level1 level2 = level1.get();
			level2.setIdo(level.getIdo());
			level2.setId01(level.getId01());
			level2.setId01(level.getId02());
			level2.setId03(level.getId03());
			level2.setId04(level.getId04());
			level1Repository.save(level2);
			return true;
		}
		return false;
	}

	
	
	
	
}
