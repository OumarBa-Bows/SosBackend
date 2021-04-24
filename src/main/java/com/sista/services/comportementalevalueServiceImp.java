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
				comportementalvalue.setDate_comp(""+comportementale.getDate_comp());
				comportementalvalue.setEntretienindivid(entretienIndi(comportementale.getEntretien()));
				comportementalvalue.setCauserie(entretienIndi(comportementale.getCauserie()));
				comportementalvalue.setOrientation(entretienIndi(comportementale.getOrientation()));;
				comportementalvalue.setAide_social(entretienIndi(comportementale.getAide_social()));
				comportementalvalue.setDep_hp(entretienIndi(comportementale.getDep_hp()));
				comportementalvalue.setOutils_iec(entretienIndi(comportementale.getOutils_iec()));
				comportementalvalue.setOutils_util(outilsUtilises(comportementale.getOutils_utilise()));
				comportementalvalue.setDistribution(entretienIndi(comportementale.getDistrubition_iec()));
				//Gels a besion d'etre verifier
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
	
	public String entretienIndi(BigDecimal entretien) {
		String val="";
		if(entretien != null) {
			if(entretien.intValue() == 1)  val="Oui";
			if(entretien.intValue() == 2) val="Non";
		}
		
		return ""+entretien;
	}
	

	
	public String outilsUtilises(BigDecimal outils) {
		String outilisUtilises ="";
		if(outils != null) {
			if(outils.intValue() == 1) outilisUtilises ="Télévision";
			if(outils.intValue() == 2) outilisUtilises ="Boite à images";
			if(outils.intValue() == 3) outilisUtilises ="Autres";
			return outilisUtilises;
		}else {
			return ""+outils;
		}
		
	}
	
	
	/*
	public String gels(float val) {
		String  geles = "";
		
	}*/
	
	public String themes(String val) {
		String them= "";
		if(val != null) {
			switch(val) {
			case "A":
				them = "Dépistage VIH";
				return them;
			case "B":
				them = "IST";
				return them;
			case "C": 
				them = "Préservatif";
				return them;
			
			}
		}
		
		return ""+val;
	}
	
	
	
	
	public String orientationVersSoin(BigDecimal val) {
		String orientationVersSoin="";
		if(val != null) {
			if(val.intValue() == 1) orientationVersSoin="Oui";
			if(val.intValue() == 2) orientationVersSoin = "Non";
		}
		
		return ""+val;
	}
}
