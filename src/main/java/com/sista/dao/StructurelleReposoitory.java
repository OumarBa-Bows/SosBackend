package com.sista.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.sista.entities.Structurelle;



public interface StructurelleReposoitory extends JpaRepository<Structurelle, Long>{

	
	
}
