package com.sista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.LocalisationRepository;
import com.sista.entities.Level1;
import com.sista.entities.Localisation;

@Service
public class LocalisationServiceImp implements LocalisationService {
	@Autowired
	private LocalisationRepository localisationRepository;
	
	@Override
	public boolean updateLocalisation(Localisation localisation) {
		Optional<Localisation> localisation1 = localisationRepository.findById(localisation.getLocalisation_id());
		if(localisation1 != null) {
			Localisation localisation2 = localisation1.get();
			localisation2.setId1(localisation.getId1());
			localisation2.setId2(localisation.getId2());
			localisation2.setId3(localisation.getId3());
			localisation2.setCoordonnees(localisation.getCoordonnees());
			localisation2.setSexe(localisation.getSexe());
			localisation2.setDate(localisation.getDate());
			localisation2.setNationalite(localisation.getNationalite());
			localisation2.setAutre_nat(localisation.getAutre_nat());
			localisation2.setNom_site(localisation.getNom_site());
			localisation2.setAutre_site(localisation.getAutre_site());
			localisation2.setTelephone(localisation.getTelephone());
			localisation2.setAge(localisation.getAge());
			localisation2.setSituation_matrim(localisation.getSituation_matrim());
			localisation2.setNiveau_scol(localisation.getNiveau_scol());
			localisationRepository.save(localisation2);
			return true;
		}
		return false;
	}

	@Override
	public List<Localisation> findALl() {
		// TODO Auto-generated method stub
		return localisationRepository.findAll();
	}

	@Override
	public Localisation findByIdLocalisation(Long id) {
		// TODO Auto-generated method stub
		Localisation localisaton = localisationRepository.findById(id).get();
		return localisaton;
	}

}
