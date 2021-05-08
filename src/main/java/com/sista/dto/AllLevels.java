package com.sista.dto;

import java.math.BigDecimal;

public class AllLevels {
	
	private String structurelle;
    private BigDecimal dateInterview;
    private BigDecimal heureInterview;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String  wilaya;
    private String moughata;
    private String commune;
    private String numeroIintentification;
    private String nomIntervenant;
    private String sexe;
    private String nationalite;
	private Long level1Id;
	
	private Long localisationId;
	private Long inf_intervenantId;
	private String prenom;
	private String prenom_mere;
	private String prenom_pere;
	private int categorie;
	private int anneeNaissance;
	private BigDecimal date_indentification;
	private String autre_nationnalite;
	private String site;
	private String autre_site;
	private BigDecimal telephone;
	private String situation_matrim;
	private String niveauSocial;
	private BigDecimal age;
	private BigDecimal date_modif;
	private BigDecimal heure_modif;
	private String typecas;
   
    public AllLevels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllLevels(String structurelle, BigDecimal dateInterview, BigDecimal heureInterview,BigDecimal longitude, BigDecimal latitude,
			String wilaya, String moughata, String commune, String numeroIintentification, String nomIntervenant,
			String sexe, String nationalite, Long level1Id, Long localisationId, Long inf_intervenantId, String prenom,
			String prenom_mere, String prenom_pere, int cateorie, int anneeNaissance, BigDecimal date_indentification,
			String autre_nationnalite, String site, String autre_site, BigDecimal telephone, String situation_matrim,
			String niveauSocial,BigDecimal age ,BigDecimal date_dernere_modif,BigDecimal heure_modif ,String typecas) {
		super();
		this.structurelle = structurelle;
		this.dateInterview = dateInterview;
		this.heureInterview = heureInterview;
		this.longitude = longitude;
		this.latitude = latitude;
		this.wilaya = wilaya;
		this.moughata = moughata;
		this.commune = commune;
		this.numeroIintentification = numeroIintentification;
		this.nomIntervenant = nomIntervenant;
		this.sexe = sexe;
		this.nationalite = nationalite;
		this.level1Id = level1Id;
		this.localisationId = localisationId;
		this.inf_intervenantId = inf_intervenantId;
		this.prenom = prenom;
		this.prenom_mere = prenom_mere;
		this.prenom_pere = prenom_pere;
		this.categorie = cateorie;
		this.anneeNaissance = anneeNaissance;
		this.date_indentification = date_indentification;
		this.autre_nationnalite = autre_nationnalite;
		this.site = site;
		this.autre_site = autre_site;
		this.telephone = telephone;
		this.situation_matrim = situation_matrim;
		this.niveauSocial = niveauSocial;
		this.age = age;
		this.date_modif = date_dernere_modif;
		this.heure_modif = heure_modif;
		this.typecas = typecas;
	}

	public String getStructurelle() {
		return structurelle;
	}

	public void setStructurelle(String structurelle) {
		this.structurelle = structurelle;
	}

	public BigDecimal getDateInterview() {
		return dateInterview;
	}

	public void setDateInterview(BigDecimal dateInterview) {
		this.dateInterview = dateInterview;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getWilaya() {
		return wilaya;
	}

	public void setWilaya(String wilaya) {
		this.wilaya = wilaya;
	}

	public String getMoughata() {
		return moughata;
	}

	public void setMoughata(String moughata) {
		this.moughata = moughata;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getNumeroIintentification() {
		return numeroIintentification;
	}

	public void setNumeroIintentification(String numeroIintentification) {
		this.numeroIintentification = numeroIintentification;
	}

	public String getNomIntervenant() {
		return nomIntervenant;
	}

	public void setNomIntervenant(String nomIntervenant) {
		this.nomIntervenant = nomIntervenant;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public Long getLevel1Id() {
		return level1Id;
	}

	public void setLevel1Id(Long level1Id) {
		this.level1Id = level1Id;
	}

	public Long getLocalisationId() {
		return localisationId;
	}

	public void setLocalisationId(Long localisationId) {
		this.localisationId = localisationId;
	}

	public Long getInf_intervenantId() {
		return inf_intervenantId;
	}

	public void setInf_intervenantId(Long inf_intervenantId) {
		this.inf_intervenantId = inf_intervenantId;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom_mere() {
		return prenom_mere;
	}

	public void setPrenom_mere(String prenom_mere) {
		this.prenom_mere = prenom_mere;
	}

	public String getPrenom_pere() {
		return prenom_pere;
	}

	public void setPrenom_pere(String prenom_pere) {
		this.prenom_pere = prenom_pere;
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int cateorie) {
		this.categorie = cateorie;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public BigDecimal getDate_indentification() {
		return date_indentification;
	}

	public void setDate_indentification(BigDecimal date_indentification) {
		this.date_indentification = date_indentification;
	}

	public String getAutre_nationnalite() {
		return autre_nationnalite;
	}

	public void setAutre_nationnalite(String autre_nationnalite) {
		this.autre_nationnalite = autre_nationnalite;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getAutre_site() {
		return autre_site;
	}

	public void setAutre_site(String autre_site) {
		this.autre_site = autre_site;
	}

	public BigDecimal getTelephone() {
		return telephone;
	}

	public void setTelephone(BigDecimal telephone) {
		this.telephone = telephone;
	}

	public String getSituation_matrim() {
		return situation_matrim;
	}

	public void setSituation_matrim(String situation_matrim) {
		this.situation_matrim = situation_matrim;
	}

	public String getNiveauSocial() {
		return niveauSocial;
	}

	public void setNiveauSocial(String niveauSocial) {
		this.niveauSocial = niveauSocial;
	}

	public BigDecimal getDate_modif() {
		return date_modif;
	}

	public void setDate_modif(BigDecimal date_dernere_modif) {
		this.date_modif = date_dernere_modif;
	}

	public String getTypecas() {
		return typecas;
	}

	public void setTypecas(String typecas) {
		this.typecas = typecas;
	}

	public BigDecimal getHeureInterview() {
		return heureInterview;
	}

	public void setHeureInterview(BigDecimal heureInterview) {
		this.heureInterview = heureInterview;
	}

	public BigDecimal getHeure_modif() {
		return heure_modif;
	}

	public void setHeure_modif(BigDecimal heure_modif) {
		this.heure_modif = heure_modif;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	
    

	
    
    
}
