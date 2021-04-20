package com.sista.dto;

import java.math.BigDecimal;

public class AllLevels {
	
	private String structurelle;
    private BigDecimal dateInterview;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String  wilaya;
    private String moughata;
    private String numeroIintentification;
    private String nomIntervenant;
    private String sexe;
    private String nationalite;
	private Long level1Id;
   
    public AllLevels() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AllLevels(String structurelle, BigDecimal dateInterview, BigDecimal longitude, BigDecimal latitude, String wilaya,
			String moughata, String numeroIintentification, String nomIntervenant, String sexe, String nationalite, Long level1Id
			) {
		super();
		this.structurelle = structurelle;
		this.dateInterview = dateInterview;
		this.longitude = longitude;
		this.latitude = latitude;
		this.wilaya = wilaya;
		this.moughata = moughata;
		this.numeroIintentification = numeroIintentification;
		this.nomIntervenant = nomIntervenant;
		this.sexe = sexe;
		this.nationalite = nationalite;
		this.level1Id = level1Id;
		
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


	public void setDateInterview(BigDecimal bigDecimal) {
		this.dateInterview = bigDecimal;
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


	
    
    
}
