package com.sista.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Table(name="localisation_identification")
@Entity
public class Localisation implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="`localisation_identification-id`")
	private Long localisation_id;
	private float id1;
	private float id2;
	private float id3;
	private float coordonnees;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private float sexe;
	private float date;
	private float nationalite;
	
	@Lob 
	private String autre_nat;
	private float nom_site;
	@Lob
	private String autre_site;
	private BigDecimal telephone;
	private float age;
	private float situation_matrim;
	private float niveau_scol;
	
	@JsonBackReference(value="level1-localisation_identification")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Localisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Localisation(Long localisation_id, float id1, float id2, float id3, float coordonnees, BigDecimal longitude,
			BigDecimal latitude, float sexe, float date, float nationalite, String autre_nat, float nom_site,
			String autre_site, BigDecimal telephone, float age, float situation_matrim, float niveau_scol,
			Level1 level1) {
		super();
		this.localisation_id = localisation_id;
		this.id1 = id1;
		this.id2 = id2;
		this.id3 = id3;
		this.coordonnees = coordonnees;
		this.longitude = longitude;
		this.latitude = latitude;
		this.sexe = sexe;
		this.date = date;
		this.nationalite = nationalite;
		this.autre_nat = autre_nat;
		this.nom_site = nom_site;
		this.autre_site = autre_site;
		this.telephone = telephone;
		this.age = age;
		this.situation_matrim = situation_matrim;
		this.niveau_scol = niveau_scol;
		this.level1 = level1;
	}

	public Long getLocalisation_id() {
		return localisation_id;
	}

	public void setLocalisation_id(Long localisation_id) {
		this.localisation_id = localisation_id;
	}

	public float getId1() {
		return id1;
	}

	public void setId1(float id1) {
		this.id1 = id1;
	}

	public float getId2() {
		return id2;
	}

	public void setId2(float id2) {
		this.id2 = id2;
	}

	public float getId3() {
		return id3;
	}

	public void setId3(float id3) {
		this.id3 = id3;
	}

	public float getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(float coordonnees) {
		this.coordonnees = coordonnees;
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

	public float getSexe() {
		return sexe;
	}

	public void setSexe(float sexe) {
		this.sexe = sexe;
	}

	public float getDate() {
		return date;
	}

	public void setDate(float date) {
		this.date = date;
	}

	public float getNationalite() {
		return nationalite;
	}

	public void setNationalite(float nationalite) {
		this.nationalite = nationalite;
	}

	public String getAutre_nat() {
		return autre_nat;
	}

	public void setAutre_nat(String autre_nat) {
		this.autre_nat = autre_nat;
	}

	public float getNom_site() {
		return nom_site;
	}

	public void setNom_site(float nom_site) {
		this.nom_site = nom_site;
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

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public float getSituation_matrim() {
		return situation_matrim;
	}

	public void setSituation_matrim(float situation_matrim) {
		this.situation_matrim = situation_matrim;
	}

	public float getNiveau_scol() {
		return niveau_scol;
	}

	public void setNiveau_scol(float niveau_scol) {
		this.niveau_scol = niveau_scol;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	
	
	
}
