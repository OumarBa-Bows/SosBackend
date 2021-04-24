package com.sista.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name="inf_intervenant")
@Entity
public class Inf_intervenant implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="`inf_intervenant-id`")
	private Long inf_intervenant_id;

	private BigDecimal intervenant;
	private BigDecimal nom_interv;
	private BigDecimal date_interview;
	private BigDecimal heur_intervention;
	private BigDecimal date_modif;
	private BigDecimal heure_modif;
	private BigDecimal type_cas;
	
	@JsonBackReference(value="level1-inf_intervenant")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Inf_intervenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inf_intervenant(Long inf_intervenant_id, BigDecimal intervenant, BigDecimal nom_interv,
			BigDecimal date_interview, BigDecimal heur_intervention, BigDecimal date_modif, BigDecimal heure_modif,
			BigDecimal type_cas, Level1 level1) {
		super();
		this.inf_intervenant_id = inf_intervenant_id;
		this.intervenant = intervenant;
		this.nom_interv = nom_interv;
		this.date_interview = date_interview;
		this.heur_intervention = heur_intervention;
		this.date_modif = date_modif;
		this.heure_modif = heure_modif;
		this.type_cas = type_cas;
		this.level1 = level1;
	}

	public Long getInf_intervenant_id() {
		return inf_intervenant_id;
	}

	public void setInf_intervenant_id(Long inf_intervenant_id) {
		this.inf_intervenant_id = inf_intervenant_id;
	}

	public BigDecimal getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(BigDecimal intervenant) {
		this.intervenant = intervenant;
	}

	public BigDecimal getNom_interv() {
		return nom_interv;
	}

	public void setNom_interv(BigDecimal nom_interv) {
		this.nom_interv = nom_interv;
	}

	public BigDecimal getDate_interview() {
		return date_interview;
	}

	public void setDate_interview(BigDecimal date_interview) {
		this.date_interview = date_interview;
	}

	public BigDecimal getHeur_intervention() {
		return heur_intervention;
	}

	public void setHeur_intervention(BigDecimal heur_intervention) {
		this.heur_intervention = heur_intervention;
	}

	public BigDecimal getDate_modif() {
		return date_modif;
	}

	public void setDate_modif(BigDecimal date_modif) {
		this.date_modif = date_modif;
	}

	public BigDecimal getHeure_modif() {
		return heure_modif;
	}

	public void setHeure_modif(BigDecimal heure_modif) {
		this.heure_modif = heure_modif;
	}

	public BigDecimal getType_cas() {
		return type_cas;
	}

	public void setType_cas(BigDecimal type_cas) {
		this.type_cas = type_cas;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	

	
}
