package com.sista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dao.BiomedicaleRepository;
import com.sista.entities.Biomedicale;

@Service
public class BiomedicaleServiceImp implements BiomedicaleService{
	
	@Autowired 
	private BiomedicaleRepository biomedicaleRepo;
	
	@Override
	public List<Biomedicale> findAll() {
		
		return biomedicaleRepo.findAll();
	}

	@Override
	public boolean updateBiomedicale(Biomedicale biomedicale) {
		
		Optional<Biomedicale> biomedicale1 = biomedicaleRepo.findById(biomedicale.getBiomedicale());
		if(biomedicale1 != null) {
			Biomedicale biomedicale2 = biomedicale1.get();
			biomedicale2.setInterv_2(biomedicale.getInterv_2());
			biomedicale2.setDate_bio(biomedicale.getDate_bio());
			biomedicale2.setTest_vih(biomedicale.getTest_vih());
			biomedicale2.setResult_despistage(biomedicale.getResult_despistage());
			biomedicale2.setAction(biomedicale.getAction());
			biomedicale2.setDepistage_cta(biomedicale.getDepistage_cta());
			biomedicale2.setResultat_cta(biomedicale.getResultat_cta());
			biomedicale2.setMise_arv(biomedicale.getMise_arv());
			biomedicale2.setDate_arv(biomedicale.getDate_arv());
			biomedicale2.setPourquoi(biomedicale.getPourquoi());
			biomedicale2.setConsultation_ist(biomedicale.getConsultation_ist());
			biomedicale2.setDep_hpa(biomedicale.getDep_hpa());
			biomedicale2.setStr_sep_hp(biomedicale.getStr_sep_hp());
			biomedicale2.setResul_hp(biomedicale.getResul_hp());
			biomedicale2.setHp_orient(biomedicale.getHp_orient());
			biomedicale2.setQs50(biomedicale.getQs50());
			biomedicale2.setQs51(biomedicale.getQs51());
			biomedicale2.setPreservatifs(biomedicale.getPreservatifs());
			biomedicale2.setQs52(biomedicale.getQs52());
			biomedicale2.setGels(biomedicale.getGels());
			biomedicale2.setQs53(biomedicale.getQs53());
			biomedicale2.setQs54(biomedicale.getQs54());
			biomedicale2.setQs55(biomedicale.getQs55());
			biomedicale2.setAutres(biomedicale.getAutres());
			biomedicaleRepo.save(biomedicale2);
			return true;
		}
		return false;
	}

	@Override
	public Biomedicale findById(Long bioId) {
		Biomedicale bio = biomedicaleRepo.findById(bioId).get();
		return bio;
	}

	

}
