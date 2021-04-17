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

@Table(name="comportementale")
@Entity
public class Comportementale implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="`comportementale-id`")
	private Long comportementale_id;
	
	private float date_comp;
	private float entretien;
	private float causerie;
	private float orientation;
	@Column(name="aide_socail")
	private float aide_social;
	private float dep_hp;
	private float outils_iec;
	private BigDecimal outils_utilise;
	private float distribition_iec;
	private float preservatifs;
	private float gels;
	private String themes;
	private float qs40;
	private float qs41;
	private float qs42;
	private float qs43;
	private float qs44;
	private float qs45;
	private float qs46;

	@JsonBackReference(value="level1-comportementale")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Comportementale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comportementale(Long comportementale_id, float date_comp, float entretien, float causerie, float orientation,
			float aide_social, float dep_hp, float outils_iec, BigDecimal outils_utilise, float distribition_iec,
			float preservatifs, float gels, String themes, float qs40, float qs41, float qs42, float qs43, float qs44,
			float qs45, float qs46, Level1 level1) {
		super();
		this.comportementale_id = comportementale_id;
		this.date_comp = date_comp;
		this.entretien = entretien;
		this.causerie = causerie;
		this.orientation = orientation;
		this.aide_social = aide_social;
		this.dep_hp = dep_hp;
		this.outils_iec = outils_iec;
		this.outils_utilise = outils_utilise;
		this.distribition_iec = distribition_iec;
		this.preservatifs = preservatifs;
		this.gels = gels;
		this.themes = themes;
		this.qs40 = qs40;
		this.qs41 = qs41;
		this.qs42 = qs42;
		this.qs43 = qs43;
		this.qs44 = qs44;
		this.qs45 = qs45;
		this.qs46 = qs46;
		this.level1 = level1;
	}

	public Long getComportementale_id() {
		return comportementale_id;
	}

	public void setComportementale_id(Long comportementale_id) {
		this.comportementale_id = comportementale_id;
	}

	public float getDate_comp() {
		return date_comp;
	}

	public void setDate_comp(float date_comp) {
		this.date_comp = date_comp;
	}

	public float getEntretien() {
		return entretien;
	}

	public void setEntretien(float entretien) {
		this.entretien = entretien;
	}

	public float getCauserie() {
		return causerie;
	}

	public void setCauserie(float causerie) {
		this.causerie = causerie;
	}

	public float getOrientation() {
		return orientation;
	}

	public void setOrientation(float orientation) {
		this.orientation = orientation;
	}

	public float getAide_social() {
		return aide_social;
	}

	public void setAide_social(float aide_social) {
		this.aide_social = aide_social;
	}

	public float getDep_hp() {
		return dep_hp;
	}

	public void setDep_hp(float dep_hp) {
		this.dep_hp = dep_hp;
	}

	public float getOutils_iec() {
		return outils_iec;
	}

	public void setOutils_iec(float outils_iec) {
		this.outils_iec = outils_iec;
	}

	public BigDecimal getOutils_utilise() {
		return outils_utilise;
	}

	public void setOutils_utilise(BigDecimal outils_utilise) {
		this.outils_utilise = outils_utilise;
	}

	public float getDistribition_iec() {
		return distribition_iec;
	}

	public void setDistribition_iec(float distribition_iec) {
		this.distribition_iec = distribition_iec;
	}

	public float getPreservatifs() {
		return preservatifs;
	}

	public void setPreservatifs(float preservatifs) {
		this.preservatifs = preservatifs;
	}

	public float getGels() {
		return gels;
	}

	public void setGels(float gels) {
		this.gels = gels;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public float getQs40() {
		return qs40;
	}

	public void setQs40(float qs40) {
		this.qs40 = qs40;
	}

	public float getQs41() {
		return qs41;
	}

	public void setQs41(float qs41) {
		this.qs41 = qs41;
	}

	public float getQs42() {
		return qs42;
	}

	public void setQs42(float qs42) {
		this.qs42 = qs42;
	}

	public float getQs43() {
		return qs43;
	}

	public void setQs43(float qs43) {
		this.qs43 = qs43;
	}

	public float getQs44() {
		return qs44;
	}

	public void setQs44(float qs44) {
		this.qs44 = qs44;
	}

	public float getQs45() {
		return qs45;
	}

	public void setQs45(float qs45) {
		this.qs45 = qs45;
	}

	public float getQs46() {
		return qs46;
	}

	public void setQs46(float qs46) {
		this.qs46 = qs46;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	

	
	
	
} 

