package com.sista.services;

import java.util.List;

import com.sista.entities.Structurelle;

public interface StructurelleService {
 
	Structurelle findStructurelleNyId(Long strucId);
	
	List<Structurelle> findAll();
	
	boolean updateStructure(Structurelle structure);
	
	Structurelle findStruc(Long strucId); 
	
}

