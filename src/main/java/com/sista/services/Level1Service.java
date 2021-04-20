package com.sista.services;

import java.util.List;

import com.sista.entities.Biomedicale;
import com.sista.entities.Comportementale;
import com.sista.entities.Inf_intervenant;
import com.sista.entities.Intervention;
import com.sista.entities.Level1;
import com.sista.entities.Localisation;
import com.sista.entities.Structurelle;

public interface Level1Service {

	public List<Level1> find();
	public Level1 findById(Long idLevel1);
	//la liste des biomedicales
	public List<Biomedicale> allbiomedicale(Long idlevel1);
	//liste des comportementales
	public List<Comportementale> allcomportementals(Long idlevel1);
	//liste des intervention
	public List<Intervention> allintervention(Long idlevel1);
	//liste des inf_intervenant
	public List<Inf_intervenant> allinf_intervnetion(Long idlevel1);
	//liste des locaisation
	public List<Localisation> allLocalisation(Long idlevel1);
	//liste des structures
	public List<Structurelle> findAllStructures(Long levelId);
	
	
	public List<Inf_intervenant> findAllInf_intervenant(Long levelId);
}
