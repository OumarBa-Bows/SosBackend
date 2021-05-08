package com.sista.services;

import java.util.List;
import java.util.Optional;

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


	@Override
	public boolean updateStructure(Structurelle structure) {
		Optional<Structurelle> structure1 = structurelleReposoitory.findById(structure.getStructurelle_id());
		if(structure1 != null) {
			Structurelle structure2 =  structure1.get();
			structure2.setDate_struc(structure.getDate_struc());
			structure2.setAppui_economique(structure.getAppui_economique());
			structure2.setAppui_juridique(structure.getAppui_juridique());
			structure2.setQs100(structure.getQs100());
			structure2.setQs101(structure.getQs101());
			
			structurelleReposoitory.save(structure2);
			return true;
		}
		return false;
	}


	@Override
	public Structurelle findStruc(Long strucId) {
		Structurelle struc = structurelleReposoitory.findById(strucId).get();
				
		return struc;
	}
	
	

}
