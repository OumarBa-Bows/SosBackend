package com.sista.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dto.StructurelleValue;
import com.sista.entities.Level1;
import com.sista.entities.Structurelle;

@Service 
public class StructurelleValueServiceImp implements StructurelleValueService {

	@Autowired
	private Level1serviceImp level1service; 
	
	@Autowired
	private StructurelleServiceImp structService;
	
	Logger logger = LoggerFactory.getLogger(StructurelleValueServiceImp.class);
	
	//.................. List des structurelles avec les réels valeurs
	//................................................................
	@Override
	public List<StructurelleValue> getListStructurelle(Long idLevel) {
		
		Level1 level =  level1service.findById(idLevel);
		List<StructurelleValue> listOfStructurelleval = new ArrayList<>();
		if(level.getStructurelle() != null) {
			for(Structurelle structurelle: level.getStructurelle()) {
				StructurelleValue structurelleValue = new StructurelleValue();
				structurelleValue.setStrucId(structurelle.getStructurelle_id());
				structurelleValue.setDate_intervention(valString(structurelle.getDate_struc()));
				structurelleValue.setAppui_economique(this.questiondirecte(structurelle.getAppui_economique()));
				structurelleValue.setAppui_jurique(this.questiondirecte(structurelle.getAppui_juridique()));
				structurelleValue.setOrientation(this.questiondirecte(structurelle.getQs100()));
				structurelleValue.setFormation_specique(this.questiondirecte(structurelle.getQs101()));
				
				listOfStructurelleval.add(structurelleValue);
				logger.info("la des structure value+++++++++++++++++.........."+listOfStructurelleval);
			}
		}
		return listOfStructurelleval;
	}
	
	public String valString(BigDecimal val) {
		if(val != null) {
			return ""+val;
		}
		return null;
	}
	
	public String questiondirecte(BigDecimal val) {
		String reponse = "";
		if(val != null ) {
			if(val.intValue() == 1) reponse = "Oui";
			if(val.intValue() == 2) reponse = "Non";
			return reponse;
		}else {
			return null;
		}
		
	}

	@Override
	public StructurelleValue findByIdStruc(Long idStruc) {
		Structurelle structurelle = structService.findStruc(idStruc);
		if(structurelle != null) {
			StructurelleValue structurelleValue = new StructurelleValue();
			structurelleValue.setStrucId(structurelle.getStructurelle_id());
			structurelleValue.setDate_intervention(valString(structurelle.getDate_struc()));
			structurelleValue.setAppui_economique(this.questiondirecte(structurelle.getAppui_economique()));
			structurelleValue.setAppui_jurique(this.questiondirecte(structurelle.getAppui_juridique()));
			structurelleValue.setOrientation(this.questiondirecte(structurelle.getQs100()));
			structurelleValue.setFormation_specique(this.questiondirecte(structurelle.getQs101()));
			
			return structurelleValue;
		}
		return null;
	}

}
