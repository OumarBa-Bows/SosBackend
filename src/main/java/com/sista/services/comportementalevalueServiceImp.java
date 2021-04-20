package com.sista.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dto.ComportementaleValue;
import com.sista.entities.Comportementale;
import com.sista.entities.Level1;

@Service
public class comportementalevalueServiceImp implements comportvalueservice{

	@Autowired
	private Level1serviceImp level1service; 
	
	@Override
	public List<ComportementaleValue> listcomportementalevalue(Long levelId) {
		Level1 level =  level1service.findById(levelId);
		List<ComportementaleValue> maList = new ArrayList<>();
		if(level.getComportementale() != null) {
			for(Comportementale comportementale: level.getComportementale()) {
				ComportementaleValue comportementalvalue = new ComportementaleValue();
				comportementalvalue.setEntretienindivid(entretienIndi(comportementale.getEntretien()));
				comportementalvalue.setCauserie(entretienIndi(comportementale.getCauserie()));
				comportementalvalue.setOrientation(entretienIndi(comportementale.getOrientation()));;
				comportementalvalue.setAide_social(entretienIndi(comportementale.getAide_social()));
				comportementalvalue.setDep_hp(entretienIndi(comportementale.getDep_hp()));
				comportementalvalue.setOutils_iec(entretienIndi(comportementale.getOutils_iec()));
				comportementalvalue.setOutils_util(outilsUtilises(comportementale.getOutils_utilise()));
				comportementalvalue.setDistribution(entretienIndi(comportementale.getDistrubition_iec()));
				//Gels a besion d'etre verifier
				comportementalvalue.setGels(comportementale.getGels());
				comportementalvalue.setThems(themes(comportementale.getThemes()));
				comportementalvalue.setParticipationGP(entretienIndi(comportementale.getQs40()));
				comportementalvalue.setParticioationRC(entretienIndi(comportementale.getQs41()));
				comportementalvalue.setEducationThe(entretienIndi(comportementale.getQs42()));
				comportementalvalue.setPerduedevue(entretienIndi(comportementale.getQs43()));
				comportementalvalue.setDistributionvideo(entretienIndi(comportementale.getQs44()));
				comportementalvalue.setOrientationversPTME(entretienIndi(comportementale.getQs45()));
				comportementalvalue.setOrientationVersSoin(orientationVersSoin(comportementale.getQs46()));
				
				maList.add(comportementalvalue);
			}		
		}
		
		return maList;
	}
	
	public String entretienIndi(float entretien) {
		String val="";
		if(entretien == 1)  val="Oui";
		if(entretien == 2) val="Non";
		return val;
	}
	

	
	public String outilsUtilises(BigDecimal outils) {
		String outilisUtilises ="";
		if(outils != null) {
			if(outils.intValue() == 1) outilisUtilises ="Télévision";
			if(outils.intValue() == 2) outilisUtilises ="Boite à images";
			if(outils.intValue() == 3) outilisUtilises ="Autres";
			return outilisUtilises;
		}else {
			return null;
		}
		
	}
	
	
	/*
	public String gels(float val) {
		String  geles = "";
		
	}*/
	
	public String themes(String val) {
		String them= "";
		if(val.equals("A")) them = "Dépistage VIH";
		if(val.equals("B")) them = "IST";
		if(val.equals("C")) them = "Préservatif";
		return them;
	}
	
	
	
	
	public String orientationVersSoin(float val) {
		String orientationVersSoin="";
		if(val == 1) orientationVersSoin="Oui";
		if(val == 2) orientationVersSoin = "Non";
		return orientationVersSoin;
	}
}
