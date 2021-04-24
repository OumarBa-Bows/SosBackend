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

@Table(name="structurelle")
@Entity
public class Structurelle implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="`structurelle-id`")
	private Long structurelle_id;
	
	@Column(name="date_struc")
	private BigDecimal date_struc;
	@Column(name="appui_economique")
	private BigDecimal appui_economique;
	@Column(name="appui_juridique")
	private BigDecimal appui_juridique;
	private BigDecimal qs100;
	private BigDecimal qs101;

	@JsonBackReference(value="level1-structurelle")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Structurelle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Structurelle(Long structurelle_id, BigDecimal date_struc, BigDecimal appui_economique, BigDecimal appui_juridique,
			BigDecimal qs100, BigDecimal qs101, Level1 level1) {
		super();
		this.structurelle_id = structurelle_id;
		this.date_struc = date_struc;
		this.appui_economique = appui_economique;
		this.appui_juridique = appui_juridique;
		this.qs100 = qs100;
		this.qs101 = qs101;
		this.level1 = level1;
	}

	public Long getStructurelle_id() {
		return structurelle_id;
	}

	public void setStructurelle_id(Long structurelle_id) {
		this.structurelle_id = structurelle_id;
	}

	public BigDecimal getDate_struc() {
		return date_struc;
	}

	public void setDate_struc(BigDecimal date_struc) {
		this.date_struc = date_struc;
	}

	public BigDecimal getAppui_economique() {
		return appui_economique;
	}

	public void setAppui_economique(BigDecimal appui_economique) {
		this.appui_economique = appui_economique;
	}

	public BigDecimal getAppui_juridique() {
		return appui_juridique;
	}

	public void setAppui_juridique(BigDecimal appui_juridique) {
		this.appui_juridique = appui_juridique;
	}

	public BigDecimal getQs100() {
		return qs100;
	}

	public void setQs100(BigDecimal qs100) {
		this.qs100 = qs100;
	}

	public BigDecimal getQs101() {
		return qs101;
	}

	public void setQs101(BigDecimal qs101) {
		this.qs101 = qs101;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	
	
	
	
} 
