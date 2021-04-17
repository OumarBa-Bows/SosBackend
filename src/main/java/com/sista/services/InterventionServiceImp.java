package com.sista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.InterventionRepository;
import com.sista.entities.Intervention;


@Service
public class InterventionServiceImp implements InterventionService{

	@Autowired
	InterventionRepository interventionRepository;
	
	@Override
	public Intervention findIntervention(Long interId) {
		if (interventionRepository.findById(interId).isPresent()) {
			Intervention inter = interventionRepository.findById(interId).get();
			System.out.println("............////******===="+inter);
			return inter;
		}
		
		return null;
	}

	/////////////////////////////////..........................................
	@Override
	public List<Intervention> findAll() {
		return interventionRepository.findAll() ;
	}

	@Override
	public List<Intervention> toutInter() {
		// TODO Auto-generated method stub
		return null;
	}


}
