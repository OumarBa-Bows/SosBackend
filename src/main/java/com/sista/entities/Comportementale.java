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
	
	private BigDecimal interv_1;
	private BigDecimal date_comp;
	private BigDecimal entretien;
	private BigDecimal causerie;
	private BigDecimal orientation;
	@Column(name="aide_socail")
	private BigDecimal aide_social;
	private BigDecimal dep_hp;
	private BigDecimal outils_iec;
	private BigDecimal outils_utilise;
	private BigDecimal distrubition_iec;
	private String themes;
	private BigDecimal qs40;
	private BigDecimal qs41;
	private BigDecimal qs42;
	private BigDecimal qs43;
	private BigDecimal qs44;
	private BigDecimal qs45;
	private BigDecimal qs46;

	@JsonBackReference(value="level1-comportementale")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Comportementale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comportementale(Long comportementale_id, BigDecimal interv_1, BigDecimal date_comp, BigDecimal entretien,
			BigDecimal causerie, BigDecimal orientation, BigDecimal aide_social, BigDecimal dep_hp,
			BigDecimal outils_iec, BigDecimal outils_utilise, BigDecimal distrubition_iec, String themes,
			BigDecimal qs40, BigDecimal qs41, BigDecimal qs42, BigDecimal qs43, BigDecimal qs44, BigDecimal qs45,
			BigDecimal qs46, Level1 level1) {
		super();
		this.comportementale_id = comportementale_id;
		this.interv_1 = interv_1;
		this.date_comp = date_comp;
		this.entretien = entretien;
		this.causerie = causerie;
		this.orientation = orientation;
		this.aide_social = aide_social;
		this.dep_hp = dep_hp;
		this.outils_iec = outils_iec;
		this.outils_utilise = outils_utilise;
		this.distrubition_iec = distrubition_iec;
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

	public BigDecimal getInterv_1() {
		return interv_1;
	}

	public void setInterv_1(BigDecimal interv_1) {
		this.interv_1 = interv_1;
	}

	public BigDecimal getDate_comp() {
		return date_comp;
	}

	public void setDate_comp(BigDecimal date_comp) {
		this.date_comp = date_comp;
	}

	public BigDecimal getEntretien() {
		return entretien;
	}

	public void setEntretien(BigDecimal entretien) {
		this.entretien = entretien;
	}

	public BigDecimal getCauserie() {
		return causerie;
	}

	public void setCauserie(BigDecimal causerie) {
		this.causerie = causerie;
	}

	public BigDecimal getOrientation() {
		return orientation;
	}

	public void setOrientation(BigDecimal orientation) {
		this.orientation = orientation;
	}

	public BigDecimal getAide_social() {
		return aide_social;
	}

	public void setAide_social(BigDecimal aide_social) {
		this.aide_social = aide_social;
	}

	public BigDecimal getDep_hp() {
		return dep_hp;
	}

	public void setDep_hp(BigDecimal dep_hp) {
		this.dep_hp = dep_hp;
	}

	public BigDecimal getOutils_iec() {
		return outils_iec;
	}

	public void setOutils_iec(BigDecimal outils_iec) {
		this.outils_iec = outils_iec;
	}

	public BigDecimal getOutils_utilise() {
		return outils_utilise;
	}

	public void setOutils_utilise(BigDecimal outils_utilise) {
		this.outils_utilise = outils_utilise;
	}

	public BigDecimal getDistrubition_iec() {
		return distrubition_iec;
	}

	public void setDistrubition_iec(BigDecimal distrubition_iec) {
		this.distrubition_iec = distrubition_iec;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public BigDecimal getQs40() {
		return qs40;
	}

	public void setQs40(BigDecimal qs40) {
		this.qs40 = qs40;
	}

	public BigDecimal getQs41() {
		return qs41;
	}

	public void setQs41(BigDecimal qs41) {
		this.qs41 = qs41;
	}

	public BigDecimal getQs42() {
		return qs42;
	}

	public void setQs42(BigDecimal qs42) {
		this.qs42 = qs42;
	}

	public BigDecimal getQs43() {
		return qs43;
	}

	public void setQs43(BigDecimal qs43) {
		this.qs43 = qs43;
	}

	public BigDecimal getQs44() {
		return qs44;
	}

	public void setQs44(BigDecimal qs44) {
		this.qs44 = qs44;
	}

	public BigDecimal getQs45() {
		return qs45;
	}

	public void setQs45(BigDecimal qs45) {
		this.qs45 = qs45;
	}

	public BigDecimal getQs46() {
		return qs46;
	}

	public void setQs46(BigDecimal qs46) {
		this.qs46 = qs46;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	
	
	
	
} 

