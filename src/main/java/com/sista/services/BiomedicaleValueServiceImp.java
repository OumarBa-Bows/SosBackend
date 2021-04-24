package com.sista.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dto.BiomedicaleValue;
import com.sista.dto.ComportementaleValue;
import com.sista.entities.Biomedicale;
import com.sista.entities.Level1;

@Service
public class BiomedicaleValueServiceImp implements BiomedicaleValueService{

	@Autowired
	private Level1serviceImp level1service; 
	
	@Override
	public List<BiomedicaleValue> listBiomedicaleVlues(Long idLevel) {
		Level1 level =  level1service.findById(idLevel);
		List<BiomedicaleValue> maList = new ArrayList<>();
		if(level.getBiomedicale() != null ) {
			for(Biomedicale biomedicale : level.getBiomedicale() ) {
				BiomedicaleValue biomedicalevalue = new BiomedicaleValue();
				biomedicalevalue.setDateIntervention(""+biomedicale.getDate_bio());
				biomedicalevalue.setDepistageVIH(questiondirecte(biomedicale.getTest_vih()));
				biomedicalevalue.setResultat_depistage(resultat_depistage(biomedicale.getResult_despistage()));
				biomedicalevalue.setAction(positif_action(biomedicale.getAction()));
				biomedicalevalue.setDepistagecta(questiondirecte(biomedicale.getDepistage_cta()));
				biomedicalevalue.setResultatcta(resulatatCTA(biomedicale.getResultat_cta()));
				biomedicalevalue.setMise_arv(questiondirecte(biomedicale.getMise_arv()));
				biomedicalevalue.setDate_mise_arv(""+biomedicale.getDate_arv());
				biomedicalevalue.setPourquoi(""+biomedicale.getPourquoi());
				biomedicalevalue.setDepistageIST(questiondirecte(biomedicale.getConsultation_ist()));
				biomedicalevalue.setDepistageHBS(questiondirecte(biomedicale.getDep_hpa()));
				biomedicalevalue.setStructure_depitage(""+biomedicale.getStr_sep_hp());
				biomedicalevalue.setResulatat_hp(resultat_Hp(biomedicale.getResul_hp()));
				biomedicalevalue.setHp_orient(questiondirecte(biomedicale.getHp_orient()));
				biomedicalevalue.setSoins_medicale(questiondirecte(biomedicale.getQs50()));
				biomedicalevalue.setDistributionpresev(questiondirecte(biomedicale.getQs51()));
				biomedicalevalue.setPreservatif(""+biomedicale.getPreservatifs());
				biomedicalevalue.setDistributionGel(questiondirecte(biomedicale.getQs52()));
				biomedicalevalue.setGels(""+biomedicale.getGels());
				biomedicalevalue.setDistribution_arv(questiondirecte(biomedicale.getQs53()));
				biomedicalevalue.setDistribution_arv_prev(questiondirecte(biomedicale.getQs54()));
				biomedicalevalue.setDistribution_arv_ptme(questiondirecte(biomedicale.getQs55()));
				biomedicalevalue.setAutres(questiondirecte(biomedicale.getAutres()));
				
				maList.add(biomedicalevalue);
			}
		}
		return maList;
	}

	
	public String questiondirecte(BigDecimal val) {
		String reponse = "";
		if(val != null ) {
			if(val.intValue() == 1) reponse = "Oui";
			if(val.intValue() == 2) reponse = "Non";
			return reponse;
		}
			return ""+val;
		
		
	}
	//.............................................
	public String resultat_depistage(BigDecimal val) {
		String reponse = "";
		if(val != null) {
			if(val.intValue() == 1) reponse = "Positif";
			if(val.intValue() == 2) reponse = "Negatif";
			return reponse;
		}
		
		return ""+val;
		
			
	}
	
	//..... action si resulatat oui....................
	public String positif_action(BigDecimal val) {
		String reponse = "";
		if(val != null) {
			if(val.intValue() == 1) reponse = "Référencement au CTA";
			if(val.intValue() == 2) reponse = "Accompagnement";
			if(val.intValue() == 3) reponse = "Référence UPEC Rosso";
			if(val.intValue() == 4) reponse = "Référence UPEC Kiffa";
			if(val.intValue() == 5) reponse = "Référence UPEC NDB";
			if(val.intValue() == 6) reponse = "Référence UPEG Kaedi";
			if(val.intValue() == 7)	reponse = "Refus";
			if(val.intValue() == 8) reponse = "Perdu de vue";
			
			return reponse;
		}
		
		return ""+val;
		
	}
	
	//..............resultat cta........
	public String resulatatCTA(BigDecimal val) {
		String reponse = "";
		if(val != null) {
			if(val.intValue() == 1) reponse = "Confirmation seropositivité";
			if(val.intValue() == 2) reponse = "Négatif";
			if(val.intValue() == 3) reponse = "Autre";
			return reponse;
		}else {
			return ""+val;
		}
	}
	
	//................................................................
	public String resultat_Hp(String val) {
		String reponse = "";
		if(val != null) {
			switch(val) {
			case "A":
				reponse = "B Positif";
				return reponse;
			case "B":
				reponse = "C Positif";
				return reponse;
			case "C":
				reponse = "A Positif";
				return reponse;
			case "D":
				reponse = "Aucune (Négatif)";
				return reponse;
			}
		}
		
		return ""+val;
	}
	
}
