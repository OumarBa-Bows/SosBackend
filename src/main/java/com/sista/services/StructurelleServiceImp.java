package com.sista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sista.dao.StructurelleReposoitory;
import com.sista.entities.Structurelle;

@Service
public class StructurelleServiceImp implements StructurelleService{
	
	@Autowired
	private StructurelleReposoitory structurelleReposoitory;
	

	@Override
	public Structurelle findStructurelleNyId(Long strucId) {
	
		//Verification de l'existance d'un projet si oui on le retourne sinon on retourne null;
		if (structurelleReposoitory.findById(strucId).isPresent()) {
			Structurelle struc = structurelleReposoitory.findById(strucId).get();
			
			return struc;
		}
		
		return null;
	}


	@Override
	public List<Structurelle> findAll() {
		// TODO Auto-generated method stub
		return structurelleReposoitory.findAll();
	}

}
