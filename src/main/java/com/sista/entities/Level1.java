package com.sista.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name="`level-1`")
@Entity
public class Level1 implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="`level-1-id`")
	private Long level;

	@Column(name="id0")
	private String ido;
	private String 	id01;
	private String id02;
	private float id03;
	private float id04;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,  mappedBy="level1")
	private List<Biomedicale> biomedicale;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="level1")
	private List<Comportementale> comportementale;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="level1")
	private List<Intervention> intervation; 
	 
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="level1")
	private List<Inf_intervenant> inf_intervention;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="level1")
	private List<Localisation> localisation;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,  mappedBy="level1")
	//@JoinColumn(name="`level-1-id`")
	private List<Structurelle> structurelle;
	
	
	public Level1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Level1(Long level, String ido, String id01, String id02, float id03, float id04,
			List<Biomedicale> biomedicale, List<Comportementale> comportementale, List<Intervention> intervation,
			List<Inf_intervenant> inf_intervention, List<Localisation> localisation, List<Structurelle> structurelle) {
		super();
		this.level = level;
		this.ido = ido;
		this.id01 = id01;
		this.id02 = id02;
		this.id03 = id03;
		this.id04 = id04;
		this.biomedicale = biomedicale;
		this.comportementale = comportementale;
		this.intervation = intervation;
		this.inf_intervention = inf_intervention;
		this.localisation = localisation;
		this.structurelle = structurelle;
	}

	

	public Long getLevel() {
		return level;
	}





	public void setLevel(Long level) {
		this.level = level;
	}





	public List<Intervention> getIntervation() {
		return intervation;
	}





	public void setIntervation(List<Intervention> intervation) {
		this.intervation = intervation;
	}





	public String getIdo() {
		return ido;
	}

	public void setIdo(String ido) {
		this.ido = ido;
	}

	

	public String getId01() {
		return id01;
	}





	public void setId01(String id01) {
		this.id01 = id01;
	}





	public String getId02() {
		return id02;
	}





	public void setId02(String id02) {
		this.id02 = id02;
	}





	public double getId03() {
		return id03;
	}





	public void setId03(float id03) {
		this.id03 = id03;
	}





	public double getId04() {
		return id04;
	}





	public void setId04(float id04) {
		this.id04 = id04;
	}





	public List<Biomedicale> getBiomedicale() {
		return biomedicale;
	}

	public void setBiomedicale(List<Biomedicale> biomedicale) {
		this.biomedicale = biomedicale;
	}

	public List<Comportementale> getComportementale() {
		return comportementale;
	}

	public void setComportementale(List<Comportementale> comportementale) {
		this.comportementale = comportementale;
	}

	public List<Structurelle> getStructurelle() {
		return structurelle;
	}

	public void setStructurelle(List<Structurelle> structurelle) {
		this.structurelle = structurelle;
	}

	/*
	public List<Intervention> getIntervation() {
		return intervation;
	}

	public void setIntervation(List<Intervention> intervation) {
		this.intervation = intervation;
	} */

	public List<Inf_intervenant> getInf_intervention() {
		return inf_intervention;
	}

	public void setInf_intervention(List<Inf_intervenant> inf_intervention) {
		this.inf_intervention = inf_intervention;
	}

	public List<Localisation> getLocalisation() {
		return localisation;
	}

	public void setLocalisation(List<Localisation> localisation) {
		this.localisation = localisation;
	}


		
	
}
