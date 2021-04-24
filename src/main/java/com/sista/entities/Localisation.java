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
	private BigDecimal id1;
	private BigDecimal id2;
	private BigDecimal id3;
	private BigDecimal coordonnees;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private BigDecimal sexe;
	private BigDecimal date;
	private BigDecimal nationalite;
	
	@Lob 
	private String autre_nat;
	private BigDecimal nom_site;
	@Lob
	private String autre_site;
	private BigDecimal telephone;
	private BigDecimal age;
	private BigDecimal situation_matrim;
	private BigDecimal niveau_scol;
	
	@JsonBackReference(value="level1-localisation_identification")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Localisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Localisation(Long localisation_id, BigDecimal id1, BigDecimal id2, BigDecimal id3, BigDecimal coordonnees,
			BigDecimal longitude, BigDecimal latitude, BigDecimal sexe, BigDecimal date, BigDecimal nationalite,
			String autre_nat, BigDecimal nom_site, String autre_site, BigDecimal telephone, BigDecimal age,
			BigDecimal situation_matrim, BigDecimal niveau_scol, Level1 level1) {
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

	public BigDecimal getId1() {
		return id1;
	}

	public void setId1(BigDecimal id1) {
		this.id1 = id1;
	}

	public BigDecimal getId2() {
		return id2;
	}

	public void setId2(BigDecimal id2) {
		this.id2 = id2;
	}

	public BigDecimal getId3() {
		return id3;
	}

	public void setId3(BigDecimal id3) {
		this.id3 = id3;
	}

	public BigDecimal getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(BigDecimal coordonnees) {
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

	public BigDecimal getSexe() {
		return sexe;
	}

	public void setSexe(BigDecimal sexe) {
		this.sexe = sexe;
	}

	public BigDecimal getDate() {
		return date;
	}

	public void setDate(BigDecimal date) {
		this.date = date;
	}

	public BigDecimal getNationalite() {
		return nationalite;
	}

	public void setNationalite(BigDecimal nationalite) {
		this.nationalite = nationalite;
	}

	public String getAutre_nat() {
		return autre_nat;
	}

	public void setAutre_nat(String autre_nat) {
		this.autre_nat = autre_nat;
	}

	public BigDecimal getNom_site() {
		return nom_site;
	}

	public void setNom_site(BigDecimal nom_site) {
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

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public BigDecimal getSituation_matrim() {
		return situation_matrim;
	}

	public void setSituation_matrim(BigDecimal situation_matrim) {
		this.situation_matrim = situation_matrim;
	}

	public BigDecimal getNiveau_scol() {
		return niveau_scol;
	}

	public void setNiveau_scol(BigDecimal niveau_scol) {
		this.niveau_scol = niveau_scol;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	
	
	
}
