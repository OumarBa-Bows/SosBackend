package com.sista.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sista.dto.AllLevels;
import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
import com.sista.entities.Localisation;

@Service
public class AllLevelserviceImp implements AllLevelservice{
	
	@Autowired
	private Level1serviceImp level1service; 
	
	@Autowired
	private inf_intervenantServiceImp infIntervenantservice; 
	
	@Autowired
	private Level1serviceImp levelservice;
	
	Logger logger = LoggerFactory.getLogger(AllLevelserviceImp.class);
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//retourne toute la liste des enquetes effectuées 
	@Override
	public List<AllLevels> levels() {
		// TODO Auto-generated method stub
		List<Level1> list = level1service.find();
		List<AllLevels> malist = new ArrayList<>();
		
		if(list != null) {
			for(Level1 level1: list) {
				AllLevels alllevels = new AllLevels();
				String valcategorie = categorie(level1.getId04());
				
				alllevels.setNumeroIintentification(""+level1.getId01()+level1.getIdo()+level1.getId02()+Math.round(level1.getId03())+valcategorie);
				alllevels.setLevel1Id(level1.getLevel());
				//
				Inf_intervenant if_inter; 
				if(level1.getInf_intervention().get(0) != null) {
					if_inter = level1.getInf_intervention().get(0);
					alllevels.setStructurelle(structurelle(if_inter.getIntervenant()));
					System.out.println("++++structurelle"+ alllevels.getStructurelle());
					alllevels.setNomIntervenant(intervenant(if_inter.getNom_interv()));
					alllevels.setDateInterview(if_inter.getDate_interview());
				}
				/*for(Inf_intervenant if_inter : level1.getInf_intervention()) {
					alllevels.setStructurelle(structurelle(if_inter.getIntervenant()));
					alllevels.setNomIntervenant(intervenant(if_inter.getNom_interv()));
					alllevels.setDateInterview(if_inter.getDate_interview());
				} */
				Localisation location;
				if(level1.getLocalisation().get(0) != null ) {
					location = level1.getLocalisation().get(0);
					alllevels.setLatitude(location.getLatitude());
					alllevels.setLongitude(location.getLongitude());
					alllevels.setMoughata(moughata(location.getId2()));
					alllevels.setWilaya(willaya(location.getId1()));
					alllevels.setSexe(sexe(location.getSexe()));
					alllevels.setNationalite(nationalite(location.getNationalite()));
				}
				//alllevels.setStructurelle(structurelle(level1.getInf_intervention().getIntervenant());
				malist.add(alllevels);
			}
		}
		return malist;
	}
	

	//verifie si l'objet in_interveneant existe
	public boolean checkifexistinfintervenant(float nominter, List<Inf_intervenant> infintervenantList) {
		for(Inf_intervenant infintervenant: infintervenantList) {
			if(infintervenant.getNom_interv() == nominter) {
				return true;
			}
		}
		return false;
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//à partir du nom de la structure retourne toute la liste des enquetes effectuées 
	@Override
	public List<AllLevels> findByStructureName(String struc) {
		List<Level1> list = level1service.find();
		
		List<AllLevels> malist = new ArrayList<>();
		if(list != null) {
			for(Level1 level1: list) {
				float val = getStructurenum(struc);
				System.out.println("Val="+val);
				Inf_intervenant infIntervenant = infIntervenantservice.findByintervenant(val);	
				logger.info("......////....11"+infIntervenant.getNom_interv());
				//List<Inf_intervenant> lisInfIntervenant = levelservice.findAllInf_intervenant(level1.getLevel());
				if(level1.getInf_intervention() !=  null) {
					System.out.println("+++++++++++++");
					System.out.println(level1.getInf_intervention().get(0).getIntervenant());
					
					logger.info("......////....22");
					if(level1.getInf_intervention().contains(infIntervenant)) {
						logger.info("......////....33");
						AllLevels alllevels = new AllLevels();
						alllevels.setNumeroIintentification(""+level1.getId01()+level1.getIdo()+level1.getId02()+Math.round(level1.getId03())+Math.round(level1.getId04()));
						
						Inf_intervenant	if_inter;
						if(level1.getInf_intervention().get(0) != null) {
							if_inter = level1.getInf_intervention().get(0);
							alllevels.setStructurelle(structurelle(if_inter.getIntervenant()));
							System.out.println("++++structurelle"+ alllevels.getStructurelle());
							alllevels.setNomIntervenant(intervenant(if_inter.getNom_interv()));
							alllevels.setDateInterview(if_inter.getDate_interview());
						}
						
						
						Localisation location;
						if(level1.getLocalisation().get(0) != null ) {
							location = level1.getLocalisation().get(0);
							alllevels.setLatitude(location.getLatitude());
							alllevels.setLongitude(location.getLongitude());
							alllevels.setMoughata(moughata(location.getId2()));
							alllevels.setWilaya(willaya(location.getId1()));
							alllevels.setSexe(sexe(location.getSexe()));
							alllevels.setNationalite(nationalite(location.getNationalite()));
						}
						//alllevels.setStructurelle(structurelle(level1.getInf_intervention().getIntervenant());
						malist.add(alllevels);
					}
					
				}
				
				
			}
		}
		return malist;
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//......................//recherche allevles(all cases) entre deux dates.......................
	@Override
	public List<AllLevels> findByDate(BigDecimal datebut, BigDecimal datefin) {
		List<Level1> list = level1service.find();
		
		List<AllLevels> malist = new ArrayList<>();
		if(list != null) {
			for(Level1 level1: list) {
				if(level1.getInf_intervention() !=  null) {
					Inf_intervenant if_inter; 
					if(level1.getInf_intervention().get(0) != null) {
						if_inter = level1.getInf_intervention().get(0);
						if(if_inter.getDate_interview().compareTo(datebut) >=0 && if_inter.getDate_interview().compareTo(datefin) <=0) {
							logger.info("......////....33");
							AllLevels alllevels = new AllLevels();
							String valcategorie = categorie(level1.getId04());
							alllevels.setNumeroIintentification(""+level1.getId01()+level1.getIdo()+level1.getId02()+Math.round(level1.getId03())+valcategorie);
							alllevels.setLevel1Id(level1.getLevel());
							//
							Inf_intervenant if_inter1; 
							if(level1.getInf_intervention().get(0) != null) {
								if_inter1 = level1.getInf_intervention().get(0);
								alllevels.setStructurelle(structurelle(if_inter1.getIntervenant()));
								System.out.println("++++structurelle"+ alllevels.getStructurelle());
								alllevels.setNomIntervenant(intervenant(if_inter1.getNom_interv()));
								alllevels.setDateInterview(if_inter1.getDate_interview());
							}
							
							Localisation location;
							if(level1.getLocalisation().get(0) != null ) {
								location = level1.getLocalisation().get(0);
								alllevels.setLatitude(location.getLatitude());
								alllevels.setLongitude(location.getLongitude());
								alllevels.setMoughata(moughata(location.getId2()));
								alllevels.setWilaya(willaya(location.getId1()));
								alllevels.setSexe(sexe(location.getSexe()));
								alllevels.setNationalite(nationalite(location.getNationalite()));
							}
							//alllevels.setStructurelle(structurelle(level1.getInf_intervention().getIntervenant());
							malist.add(alllevels);
						}
				    }
						
				}
			}
			
		}
		return malist;
	}

	
	//recupere le nom de la structure à partir du numero de la structure
	public String structurelle(float struc) {
		
		String structure = "";
		int val = (int) struc;
		
		switch(val){
			case 1:
				structure = "SOS PE";
				break;
			case 2: 
				structure = "AGD";
				break;
			case 3:
				structure = "REMAPLUS";
				break;
			case 4: 
				 structure = "NAD NDB";
				 break;
			case 5: 
				structure = "AFLM NDB";
				break;
			case 6:
				structure = "NSA";
				break;
			case 7:
				structure = "INTERFACE ACTION";
				break;
			case 8:
				structure = "STOP SIDA";
				break;
			case 9:
				structure = "PE NDB";
				break;
			case 10:
				 structure = "OMST SIDA ROSSO";
				 break;
			case 11: 
				structure = "FOR/MVD";
				break;
			case 12: 
				structure = "FOR/MVD";
				break;
			case 13: 
				structure = "ASC NDB";
				break;
		}
			
		return structure;
	}
	
	public String categorie(double d) {
		String categorie = "";
		if(d == 1) categorie = "PS";
		if(d == 2) categorie = "HSH";
		return categorie;
	}
	
	//recupere le numero du structure à partir du nom de la structure 
	public float getStructurenum(String struc) {
		
		float structureName = 0;
		switch(struc)
		{
			case "SOS PE": 
				structureName = 1;
				break;
			case "AGD":
				structureName = 2;
				break;
			case "REMAPLUS":
				structureName = 3;
				break;
			case "NAD NDB":
				structureName = 4;
				break;
			case "AFLM NDB":
				structureName = 5;
				break;
			case "NSA":
				structureName = 6;
				break;
			case "INTERFACE ACTION":
				structureName = 7;
				break;
			case "STOP SIDA":
				structureName = 8;
				break;
			case "PE NDB": 
				structureName = 9;
				break;
			case "OMST SIDA ROSSO":
				structureName = 10;
				break;
			case "RRAJ NOUAKCHOTT":
				structureName = 11;
				break;
			case "FOR/MVD":
				structureName = 12;
				break;
			case "ASC NDB":
				structureName = 13;
				break;
		}
		return structureName;
	}
	
	
	public String intervenant(float nominterv) {
		String intervenant = "";
		int val = (int) nominterv; 
		
		switch(val) {
			case 1:
				intervenant = "intervenant 1";
				break;
			case 2:
				intervenant = "intervenant 2";
				break;
			case 3:
				intervenant = "intervenant 3";
				break;
			case 4:
				intervenant = "intervenant 4";
				break;
			case 5:
				intervenant = "intervenant 5";
				break;
			case 6: 
				intervenant = "intervenant 6";
				break;
			case 7: 
				intervenant = "intervenant 7";
				break;
			case 8: 
				intervenant = "intervenant 8";
				break;
			case 9: 
				intervenant = "intervenant 9";
				break;
			case 10:
				intervenant = "intervenant 10";
				break;
				
		}
		
	
		return intervenant;
	}
	
	public String willaya(float dt1) {
		String willaya = "";
			int val = (int) dt1;
			switch(val) {
				case 1:
					 willaya = "Hodh Charghi";
					 break;
				case 2:
					 willaya = "Hodh Gharbii";
					 break;
				case 3:
					 willaya = "Assaba";
					 break;
				case 4:
					 willaya = "Gorgol";
					 break;
				case 5:
					willaya = "Brakna";
					break;
				case 6: 
					willaya = "Trarza";
					break;
				case 7:
					 willaya = "Adrar";
					 break;
				case 8:
					willaya = "Nouadhibou";
					break;
				case 9: 
					 willaya = "Tagant";
					 break;
				case 10:
					willaya = "Guidimagha";
					break;
				case 11: 
					 willaya = "Tiris Zemmour";
					 break;
				case 12:
					 willaya = "Inchiri";
					 break;
				case 13: 
					willaya = "Nouakchott Nord";
					break;
				case 14:
					willaya = "Nouakchott Ouest";
					break;
				case 15:
					 willaya = "Nouakchott Sud";
			}
			
		
		return willaya;
		
	}
	
	public String sexe(float val) {
		String sex= "";
		if(val == 1) sex ="homme";
		if(val == 2) sex ="femme";
		
		return sex;
	}
	
	public String nationalite(float nat) {
		String nationnalite= "";
	
			if(nat == 0) nationnalite = "Autre nationalité";
			if(nat == 1) nationnalite = "Mauritaniene";
			if(nat == 2) nationnalite = "Sénégalaise";
			if(nat == 3) nationnalite = "Maliennne";
			if(nat == 4) nationnalite = "Ivoirienne";
			if(nat == 5) nationnalite = "Guinéeene";
			if(nat == 6) nationnalite = "Benénoise";
			if(nat == 7) nationnalite = "Congolaise";
			if(nat == 8) nationnalite = "Maroc";
			if(nat == 9) nationnalite = "RSA";
			
		
		return nationnalite;
	}
	
	public String moughata(float mough) {
		String moughata = "";
		
			if(mough == 1) moughata = "AMOURJ";
			if(mough == 2) moughata = "BASSIKNOU";
			if(mough == 3) moughata = "DJIGUENNI";
			if(mough == 4) moughata = "NEMA";
			if(mough == 5) moughata = "OUALATA";
			if(mough == 5) moughata = "TIMBEDRA";
			
		
		return moughata;
	}

	public String situationmaretale(float situation) {
		String situationmaretale = "";
		if(situation == 1) situationmaretale = "Célibatraire" ;
		if(situation == 2) situationmaretale = "Concubinage";
		if(situation == 3) situationmaretale = "Divorce(e)";
		if(situation == 4) situationmaretale = "Marie(e)";
		if(situation == 5) situationmaretale = "Veuf(ve)";
		
		return situationmaretale;
	}

	





}
