package com.sista.entities;

import java.io.Serializable;

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
	private float date_struc;
	@Column(name="appui_economique")
	private float appui_economique;
	@Column(name="appui_juridique")
	private float appui_juridique;
	private double qs100;
	private double qs101;

	@JsonBackReference(value="level1-structurelle")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Structurelle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Structurelle(Long structurelle_id, float date_struc, float appui_economique, float appui_juridique,
			double qs100, double qs101, Level1 level1) {
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

	public float getDate_struc() {
		return date_struc;
	}

	public void setDate_struc(float date_struc) {
		this.date_struc = date_struc;
	}

	public float getAppui_economique() {
		return appui_economique;
	}

	public void setAppui_economique(float appui_economique) {
		this.appui_economique = appui_economique;
	}

	public float getAppui_juridique() {
		return appui_juridique;
	}

	public void setAppui_juridique(float appui_juridique) {
		this.appui_juridique = appui_juridique;
	}

	public double getQs100() {
		return qs100;
	}

	public void setQs100(double qs100) {
		this.qs100 = qs100;
	}

	public double getQs101() {
		return qs101;
	}

	public void setQs101(double qs101) {
		this.qs101 = qs101;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	
	
	
	
} 
