package com.sista.dto;

public class IdentificationPersonnelle {

	private String numeroidentification;
	private String sex;
	private String nationnalite;
	private String situationmaretal;
	
	public IdentificationPersonnelle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdentificationPersonnelle(String numeroidentification, String sex, String nationnalite,
			String situztionlaretal) {
		super();
		this.numeroidentification = numeroidentification;
		this.sex = sex;
		this.nationnalite = nationnalite;
		this.situationmaretal = situztionlaretal;
	}

	public String getNumeroidentification() {
		return numeroidentification;
	}

	public void setNumeroidentification(String numeroidentification) {
		this.numeroidentification = numeroidentification;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNationnalite() {
		return nationnalite;
	}

	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}

	public String getSituationmaretal() {
		return situationmaretal;
	}

	public void setSituationmaretal(String situztionlaretal) {
		this.situationmaretal = situztionlaretal;
	}

	
	
	
	
}
