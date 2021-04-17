package com.sista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.Level1Repository;
import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
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

	
	
	
	
}
