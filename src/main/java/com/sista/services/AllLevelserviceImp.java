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
				
				alllevels.setNumeroIintentification(""+level1.getId01()+level1.getIdo()+level1.getId02()+level1.getId03()+valcategorie);
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
	public boolean checkifexistinfintervenant(BigDecimal nominter, List<Inf_intervenant> infintervenantList) {
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
						alllevels.setNumeroIintentification(""+level1.getId01()+level1.getIdo()+level1.getId02()+level1.getId03()+level1.getId04());
						
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
							alllevels.setNumeroIintentification(""+level1.getId01()+level1.getIdo()+level1.getId02()+level1.getId03()+valcategorie);
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
	public String structurelle(BigDecimal struc) {
		
		String structure = "";
		if(struc != null) {
			int val = struc.intValue();
			
			switch(val){
				case 1:
					structure = "SOS PE";
					return structure;
				case 2: 
					structure = "AGD";
					return structure;
				case 3:
					structure = "REMAPLUS";
					return structure;
				case 4: 
					 structure = "NAD NDB";
					 return structure;
				case 5: 
					structure = "AFLM NDB";
					return structure;
				case 6:
					structure = "NSA";
					return structure;
				case 7:
					structure = "INTERFACE ACTION";
					return structure;
				case 8:
					structure = "STOP SIDA";
					return structure;
				case 9:
					structure = "PE NDB";
					return structure;
				case 10:
					 structure = "OMST SIDA ROSSO";
					 return structure;
				case 11: 
					structure = "FOR/MVD";
					return structure;
				case 12: 
					structure = "FOR/MVD";
					return structure;
				case 13: 
					structure = "ASC NDB";
					return structure;
			}
		}
		
			
		return null;
	}
	
	public String categorie(BigDecimal d) {
		String categorie = "";
		if(d != null ) {
			int val = d.intValue();
			switch(val) {
				case 1: 
					categorie = "PS";
					return categorie;
				case 2:
					 categorie = "HSH";
					 return categorie;
			}
		}
		;
		return null;
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
	
	
	public String intervenant(BigDecimal nominterv) {
		String intervenant = "";
		if(nominterv != null) {
			int val = nominterv.intValue(); 
			
			switch(val) {
				case 1:
					intervenant = "intervenant 1";
					return intervenant;
				case 2:
					intervenant = "intervenant 2";
					return intervenant;
				case 3:
					intervenant = "intervenant 3";
					return intervenant;
				case 4:
					intervenant = "intervenant 4";
					return intervenant;
				case 5:
					intervenant = "intervenant 5";
					return intervenant;
				case 6: 
					intervenant = "intervenant 6";
					return intervenant;
				case 7: 
					intervenant = "intervenant 7";
					return intervenant;
				case 8: 
					intervenant = "intervenant 8";
					return intervenant;
				case 9: 
					intervenant = "intervenant 9";
					return intervenant;
				case 10:
					intervenant = "intervenant 10";
					return intervenant;
				case 11:
					intervenant = "intervenant 11";
					return intervenant;
				case 12:
					intervenant = "intervenant 12";
					return intervenant;
				case 13:
					intervenant = "intervenant 13";
					return intervenant;
				case 14:
					intervenant = "intervenant 14";
					return intervenant;
				case 15:
					intervenant = "intervenant 15";
					return intervenant;
				case 16:
					intervenant = "intervenant 16";
					return intervenant;
				case 17:
					intervenant = "intervenant 17";
					return intervenant;
				case 18:
					intervenant = "intervenant 18";
					return intervenant;
				case 19:
					intervenant = "intervenant 19";
					return intervenant;
				case 20:
					intervenant = "intervenant 20";
					return intervenant;
				case 21:
					intervenant = "intervenant 21";
					return intervenant;
				case 22:
					intervenant = "intervenant 22";
					return intervenant;
				case 23:
					intervenant = "intervenant 23";
					return intervenant;
				case 24:
					intervenant = "intervenant 24";
					return intervenant;
				case 25:
					intervenant = "intervenant 25";
					return intervenant;
				case 26:
					intervenant = "intervenant 26";
					return intervenant;
				case 27:
					intervenant = "intervenant 27";
					return intervenant;
				case 28:
					intervenant = "intervenant 28";
					return intervenant;
				case 29:
					intervenant = "intervenant 29";
					return intervenant;
				case 30:
					intervenant = "intervenant 30";
					return intervenant;
				case 31:
					intervenant = "intervenant 31";
					return intervenant;
				case 32:
					intervenant = "intervenant 32";
					return intervenant;
				case 33:
					intervenant = "intervenant 33";
					return intervenant;
				case 34:
					intervenant = "intervenant 34";
					return intervenant;
				case 35:
					intervenant = "intervenant 35";
					return intervenant;
				case 36:
					intervenant = "intervenant 36";
					return intervenant;
				case 37:
					intervenant = "intervenant 37";
					return intervenant;
				case 38:
					intervenant = "intervenant 38";
					return intervenant;
				case 39:
					intervenant = "intervenant 39";
					return intervenant;
				case 40:
					intervenant = "intervenant 40";
					return intervenant;
				case 41:
					intervenant = "intervenant 41";
					return intervenant;
				case 42:
					intervenant = "intervenant 42";
					return intervenant;
				case 43:
					intervenant = "intervenant 43";
					return intervenant;
				case 44:
					intervenant = "intervenant 44";
					return intervenant;
				case 45:
					intervenant = "intervenant 45";
					return intervenant;
				case 46:
					intervenant = "intervenant 46";
					return intervenant;
				case 47:
					intervenant = "intervenant 47";
					return intervenant;
					
				case 48:
					intervenant = "intervenant 48";
					return intervenant;	
				case 49:
					intervenant = "intervenant 49";
					return intervenant;
				case 50:
					intervenant = "intervenant 50";
					return intervenant;
				case 51:
					intervenant = "intervenant 51";
					return intervenant;
				case 52:
					intervenant = "intervenant 52";
					return intervenant;
				case 53:
					intervenant = "intervenant 53";
					return intervenant;
				case 54:
					intervenant = "intervenant 54";
					return intervenant;
				case 55:
					intervenant = "intervenant 55";
					return intervenant;
				case 56:
					intervenant = "intervenant 56";
					return intervenant;
				case 57:
					intervenant = "intervenant 57";
					return intervenant;
				case 58:
					intervenant = "intervenant 58";
					return intervenant;
				case 59:
					intervenant = "intervenant 59";
					return intervenant;
				case 60:
					intervenant = "intervenant 60";
					return intervenant;
				case 61:
					intervenant = "intervenant 61";
					return intervenant;
				case 62:
					intervenant = "intervenant 62";
					return intervenant;
				case 63:
					intervenant = "intervenant 63";
					return intervenant;
				case 64:
					intervenant = "intervenant 64";
					return intervenant;
				case 65:
					intervenant = "intervenant 65";
					return intervenant;
				case 66:
					intervenant = "intervenant 66";
					return intervenant;
				case 67:
					intervenant = "intervenant 67";
					return intervenant;
				case 68:
					intervenant = "intervenant 68";
					return intervenant;
				case 69:
					intervenant = "intervenant 69";
					return intervenant;
				case 70:
					intervenant = "intervenant 70";
					return intervenant;
				case 71:
					intervenant = "intervenant 71";
					return intervenant;
				case 72:
					intervenant = "intervenant 72";
					return intervenant;
				case 73:
					intervenant = "intervenant 73";
					return intervenant;
				case 74:
					intervenant = "intervenant 74";
					return intervenant;
				case 75:
					intervenant = "intervenant 75";
					return intervenant;
				case 76:
					intervenant = "intervenant 76";
					return intervenant;
				case 77:
					intervenant = "intervenant 77";
					return intervenant;
				case 78:
					intervenant = "intervenant 78";
					return intervenant;
				case 79:
					intervenant = "intervenant 79";
					return intervenant;
				case 80:
					intervenant = "intervenant 80";
					return intervenant;
				case 81:
					intervenant = "intervenant 81";
					return intervenant;
				case 82:
					intervenant = "intervenant 82";
					return intervenant;
				case 83:
					intervenant = "intervenant 83";
					return intervenant;
				case 84:
					intervenant = "intervenant 84";
					return intervenant;
				case 85:
					intervenant = "intervenant 85";
					return intervenant;
				case 86:
					intervenant = "intervenant 86";
					return intervenant;
				case 87:
					intervenant = "intervenant 87";
					return intervenant;
				case 88:
					intervenant = "intervenant 88";
					return intervenant;
				case 89:
					intervenant = "intervenant 89";
					return intervenant;
				case 90:
					intervenant = "intervenant 90";
					return intervenant;
				case 91:
					intervenant = "intervenant 91";
					return intervenant;
				case 92:
					intervenant = "intervenant 92";
					return intervenant;
				case 93:
					intervenant = "intervenant 93";
					return intervenant;
				case 94:
					intervenant = "intervenant 94";
					return intervenant;
				case 95:
					intervenant = "intervenant 95";
					return intervenant;
				case 96:
					intervenant = "intervenant 96";
					return intervenant;
				case 97:
					intervenant = "intervenant 97";
					return intervenant;
				case 98:
					intervenant = "intervenant 98";
					return intervenant;
				case 99:
					intervenant = "intervenant 99";
					return intervenant;
				case 100:
					intervenant = "intervenant 100";
					return intervenant;
				case 101:
					intervenant = "intervenant 101";
					return intervenant;
				case 102:
					intervenant = "intervenant 102";
					return intervenant;
				case 103:
					intervenant = "intervenant 103";
					return intervenant;
				case 104:
					intervenant = "intervenant 104";
					return intervenant;
				
				case 105:
					intervenant = "intervenant 105";
					return intervenant;
				case 106:
					intervenant = "intervenant 106";
					return intervenant;
				case 107:
					intervenant = "intervenant 107";
					return intervenant;
				case 108:
					intervenant = "intervenant 108";
					return intervenant;
				case 109:
					intervenant = "intervenant 109";
					return intervenant;
				case 110:
					intervenant = "intervenant 110";
					return intervenant;
				case 111:
					intervenant = "intervenant 111";
					return intervenant;
				case 112:
					intervenant = "intervenant 112";
					return intervenant;
				case 113:
					intervenant = "intervenant 113";
					return intervenant;
				case 114:
					intervenant = "intervenant 114";
					return intervenant;
				case 115:
					intervenant = "intervenant 115";
					return intervenant;
				case 116:
					intervenant = "intervenant 116";
					return intervenant;
				case 117:
					intervenant = "intervenant 117";
					return intervenant;
				case 118:
					intervenant = "intervenant 118";
					return intervenant;
				case 119:
					intervenant = "intervenant 119";
					return intervenant;
				case 120:
					intervenant = "intervenant 120";
					return intervenant;
					
				case 121:
					intervenant = "intervenant 121";
					return intervenant;
				case 122:
					intervenant = "intervenant 122";
					return intervenant;
				case 123:
					intervenant = "intervenant 123";
					return intervenant;
				case 124:
					intervenant = "intervenant 124";
					return intervenant;
				case 125:
					intervenant = "intervenant 125";
					return intervenant;
				case 126:
					intervenant = "intervenant 126";
					return intervenant;
				case 127:
					intervenant = "intervenant 127";
					return intervenant;
				case 128:
					intervenant = "intervenant 128";
					return intervenant;
				case 129:
					intervenant = "intervenant 129";
					return intervenant;
				
			}
			
		}
		
	
		return null;
	}
	
	public String willaya(BigDecimal dt1) {
		String willaya = "";
		if(dt1 != null) {
			int val = dt1.intValue();
			switch(val) {
				case 1:
					 willaya = "Hodh Charghi";
					 return willaya;
				case 2:
					 willaya = "Hodh Gharbii";
					 return willaya;
				case 3:
					 willaya = "Assaba";
					 return willaya;
				case 4:
					 willaya = "Gorgol";
					 return willaya;
				case 5:
					willaya = "Brakna";
					return willaya;
				case 6: 
					willaya = "Trarza";
					return willaya;
				case 7:
					 willaya = "Adrar";
					 return willaya;
				case 8:
					willaya = "Nouadhibou";
					return willaya;
				case 9: 
					 willaya = "Tagant";
					 return willaya;
				case 10:
					willaya = "Guidimagha";
					return willaya;
				case 11: 
					 willaya = "Tiris Zemmour";
					 return willaya;
				case 12:
					 willaya = "Inchiri";
					 return willaya;
				case 13: 
					willaya = "Nouakchott Nord";
					return willaya;
				case 14:
					willaya = "Nouakchott Ouest";
					return willaya;
				case 15:
					 willaya = "Nouakchott Sud";
					 return willaya;
			}
			
			
		}
			
		
		return null;
		
	}
	
	public String sexe(BigDecimal val) {
		String sex= "";
		if(val != null) {
			
			if(val.intValue() == 1) sex ="homme";
			if(val.intValue() == 2) sex ="femme";
			return sex;
		}
		
		return null;
	}
	
	public String nationalite(BigDecimal nat) {
		String nationnalite= "";
			if(nat != null) {
				int val = nat.intValue();
				switch(val) {
					case 0:
						nationnalite = "Autre nationalité";
						return nationnalite;
					case 1:
						nationnalite = "Mauritaniene";
						return nationnalite;
					case 2:
						nationnalite = "Sénégalaise";
						return nationnalite;
					case 3:
						nationnalite = "Maliennne";
						return nationnalite;
					case 4:
						nationnalite = "Ivoirienne";
						return nationnalite;
					case 5:
						nationnalite = "Guinéeene";
						return nationnalite;
					case 6:
						nationnalite = "Benénoise";
						return nationnalite;
					case 7: 
						nationnalite = "Congolaise";
						return nationnalite;
					case 8: 
						 nationnalite = "Maroc";
						 return nationnalite;
					case 9: 
						nationnalite = "RSA";
						return nationnalite;
				}
			}
			
		
		return null;
	}
	
	
	public String moughata(BigDecimal mough) {
		String moughata = "";
		if(mough != null) {
				int val = mough.intValue();
				switch(val) {
				case 1: 
					moughata = "AMOURJ";
					return moughata;
				case 2: 
					moughata = "BASSIKNOU";
					return moughata;
				case 3:
					moughata = "DJIGUENNI";
					return moughata;
				case 4: 
					 moughata = "NEMA";
					 return moughata;
				case 5:
					moughata = "OUALATA";
					return moughata;
				case 6:
					moughata = "TIMBEDRA";
					return moughata;
				case 7:
					moughata = "AIOUN";
					return moughata;
				case 8: 
					moughata = "KOUBENNI";
					return moughata;
				case 9:
					moughata = "TAMCHEKETT";
					return moughata;
				case 10:
					moughata = "TINTANE";
					return moughata;
				case 11:
					moughata = "BARKEOL";
					return moughata;
				case 12:
					moughata = "BOUMDEID";
					return moughata;
				case 13:
					moughata = "GUEROU";
					return moughata;
				case 14:
					moughata = "KANKOSSA";
					return moughata;
				case 15:
					moughata = "KIFFA";
					return moughata;
				case 16:
					moughata = "KAEDI";
					return moughata;
				case 17:
					moughata = "MAGHAMA";
					return moughata;
				case 18:
					moughata = "MBOUD";
					return moughata;
				case 19:
					moughata = "MOUNGUEL";
					return moughata;
				case 20:
					moughata = "ALEG";
					return moughata;
				case 21:
					moughata = "BABABE";
					return moughata;
				case 22:
					moughata = "BOGUE";
					return moughata;
				case 23:
					moughata = "MAGHTA LAHJAR";
					return moughata;
				case 24:
					moughata = "MBAGNE";
					return moughata;
				case 25:
					moughata = "BOUTILIMIT";
					return moughata;
				case 26:
					moughata = "KEURMACENE";
					return moughata;
				case 27:
					moughata = "MEDERDRA";
					return moughata;
				case 28:
					moughata = "OUAD NAGA";
					return moughata;
				case 29:
					moughata = "RKIZ";
					return moughata;
				case 30:
					moughata = "ROSSO";
					return moughata;
				case 31:
					moughata = "AOUJEFT";
					return moughata;
				case 32:
					moughata = "ATAR";
					return moughata;
				case 33:
					moughata = "CHINGUITTI";
					return moughata;
				case 34:
					moughata = "OUADANE";
					return moughata;
				case 35:
					moughata = "NOUADHIBOU";
					return moughata;
				case 36:
					moughata = "MOUDJERIA";
					return moughata;
				case 37:
					moughata = "TICHIT";
					return moughata;
				case 38:
					moughata = "TIDJIKJA";
					return moughata;
				case 39:
					moughata = "OULD YENGE";
					return moughata;
				case 40:
					moughata = "SELIBABI";
					return moughata;
				case 41:
					moughata = "GHABOU";
					return moughata;
				case 42:
					moughata = "BIRMOUGREIN";
					return moughata;
				case 43:
					moughata = "FDERICK";
					return moughata;
				case 44:
					moughata = "ZOUERAT";
					return moughata;
				case 45:
					moughata = "AKJOUJT";
					return moughata;
				case 46:
					moughata = "ECHAMI";
					return moughata;
				case 47:
					moughata = "TOUJOUNINE";
					return moughata;
				case 48:
					moughata = "DAR NAIM";
					return moughata;
				case 49:
					moughata = "TEYARETT";
					return moughata;
				case 50:
					moughata = "KSAR";
					return moughata;
				case 51:
					moughata = "TEVRAGH ZEINA";
					return moughata;
				case 52:
					moughata = "SEBKHA";
					return moughata;
				case 53:
					moughata = "EL MINA";
					return moughata;
				case 54:
					moughata = "RIYADH";
					return moughata;
				case 55:
					moughata = "ARAFAT";
					return moughata;
					
					
			}
		}
	
			
		
		return null;
	}

	public String situationmaretale(BigDecimal situation) {
		String situationmaretale = "";
		if(situation != null) {
			int val = situation.intValue();
			switch(val) {
				case 1:
					situationmaretale = "Célibatraire" ;
					return situationmaretale;
				case 2: 
					situationmaretale = "Concubinage";
					return situationmaretale;
				case 3:
					situationmaretale = "Divorcé(e)";
					return situationmaretale;
				case 4: 
					situationmaretale = "Marié(e)";
					return situationmaretale;
				case 5:
					situationmaretale = "Veuf(ve)";
					return situationmaretale;
			}
 		}
		
		return null;
	}

	





}
