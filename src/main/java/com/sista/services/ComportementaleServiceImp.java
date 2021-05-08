package com.sista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.ComportementaleRepository;
import com.sista.entities.Comportementale;

@Service
public class ComportementaleServiceImp implements ComportementaleService{

	@Autowired
	ComportementaleRepository comportementaleRepository;
	
	
	@Override
	public List<Comportementale> findAll() {
		// TODO Auto-generated method stub
		return comportementaleRepository.findAll();
	}

	
	//modifie un biomedicale 
	@Override
	public boolean updateComportementale(Comportementale comportementale) {
		// TODO Auto-generated method stub
		
		Optional<Comportementale> comportementale1 = comportementaleRepository.findById(comportementale.getComportementale_id());
		
		if(comportementale1 != null) {
			Comportementale comportementale2 = comportementale1.get();
			comportementale2.setInterv_1(comportementale.getInterv_1());
			comportementale2.setDate_comp(comportementale.getDate_comp());
			comportementale2.setEntretien(comportementale.getEntretien());
			comportementale2.setCauserie(comportementale.getCauserie());
			comportementale2.setOrientation(comportementale.getOrientation());
			comportementale2.setAide_social(comportementale.getAide_social());
			comportementale2.setDep_hp(comportementale.getDep_hp());
			comportementale2.setOutils_iec(comportementale.getOutils_iec());
			comportementale2.setOutils_utilise(comportementale.getOutils_utilise());
			comportementale2.setDistrubition_iec(comportementale.getDistrubition_iec());
			comportementale2.setThemes(comportementale.getThemes());
			comportementale2.setQs40(comportementale.getQs40());
			comportementale2.setQs41(comportementale.getQs41());
			comportementale2.setQs42(comportementale.getQs42());
			comportementale2.setQs43(comportementale.getQs43());
			comportementale2.setQs44(comportementale.getQs44());
			comportementale2.setQs45(comportementale.getQs45());
			comportementale2.setQs46(comportementale.getQs46());
			
			comportementaleRepository.save(comportementale2);
			return true;
		}
		
		return false;
	}


	@Override
	public Comportementale findById(Long id) {
		Comportementale comportementale = comportementaleRepository.findById(id).get();
		return comportementale;
	}

	

}
