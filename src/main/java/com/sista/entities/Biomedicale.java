package com.sista.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name="biomedicale")
@Entity
public class Biomedicale implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="`biomedicale-id`")
	private int biomedicale;
	//@Column(precision=8, scale=0)
	
	private double date_bio;
	//@Column(precision=1, scale=0)
	private double test_vih;
	//@Column(name="resultat_depistage", precision=1, scale=0)
	@Column(name="resultat_depistage")
	private double result_despistage;
	private double action;
	private double depistage_cta;
	private double resultat_cta;
	private double mise_arv;
	private double date_arv;
	@Lob
	private String pourquoi;
	private double consultation_ist;
	private double dep_hpa;
	@Lob
	private String str_sep_hp;
	@Lob
	private String resul_hp;
	private double hp_orient;
	private double qs50;
	private double qs51;
	private double qs52;
	private double qs53;
	private double qs54;
	private double qs55;
	private double autres;
	
	
	@JsonBackReference(value="level1-biomedicale")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Biomedicale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Biomedicale(int biomedicale, double date_bio, double test_vih, double result_despistage, double action,
			double depistage_cta, double resultat_cta, double mise_arv, double date_arv, String pourquoi,
			double consultation_ist, double dep_hpa, String str_sep_hp, String resul_hp, double hp_orient, double qs50,
			double qs51, double qs52, double qs53, double qs54, double qs55, double autres, Level1 level1) {
		super();
		this.biomedicale = biomedicale;
		this.date_bio = date_bio;
		this.test_vih = test_vih;
		this.result_despistage = result_despistage;
		this.action = action;
		this.depistage_cta = depistage_cta;
		this.resultat_cta = resultat_cta;
		this.mise_arv = mise_arv;
		this.date_arv = date_arv;
		this.pourquoi = pourquoi;
		this.consultation_ist = consultation_ist;
		this.dep_hpa = dep_hpa;
		this.str_sep_hp = str_sep_hp;
		this.resul_hp = resul_hp;
		this.hp_orient = hp_orient;
		this.qs50 = qs50;
		this.qs51 = qs51;
		this.qs52 = qs52;
		this.qs53 = qs53;
		this.qs54 = qs54;
		this.qs55 = qs55;
		this.autres = autres;
		this.level1 = level1;
	}

	public int getBiomedicale() {
		return biomedicale;
	}

	public void setBiomedicale(int biomedicale) {
		this.biomedicale = biomedicale;
	}

	public double getDate_bio() {
		return date_bio;
	}

	public void setDate_bio(double date_bio) {
		this.date_bio = date_bio;
	}

	public double getTest_vih() {
		return test_vih;
	}

	public void setTest_vih(double test_vih) {
		this.test_vih = test_vih;
	}

	public double getResult_despistage() {
		return result_despistage;
	}

	public void setResult_despistage(double result_despistage) {
		this.result_despistage = result_despistage;
	}

	public double getAction() {
		return action;
	}

	public void setAction(double action) {
		this.action = action;
	}

	public double getDepistage_cta() {
		return depistage_cta;
	}

	public void setDepistage_cta(double depistage_cta) {
		this.depistage_cta = depistage_cta;
	}

	public double getResultat_cta() {
		return resultat_cta;
	}

	public void setResultat_cta(double resultat_cta) {
		this.resultat_cta = resultat_cta;
	}

	public double getMise_arv() {
		return mise_arv;
	}

	public void setMise_arv(double mise_arv) {
		this.mise_arv = mise_arv;
	}

	public double getDate_arv() {
		return date_arv;
	}

	public void setDate_arv(double date_arv) {
		this.date_arv = date_arv;
	}

	public String getPourquoi() {
		return pourquoi;
	}

	public void setPourquoi(String pourquoi) {
		this.pourquoi = pourquoi;
	}

	public double getConsultation_ist() {
		return consultation_ist;
	}

	public void setConsultation_ist(double consultation_ist) {
		this.consultation_ist = consultation_ist;
	}

	public double getDep_hpa() {
		return dep_hpa;
	}

	public void setDep_hpa(double dep_hpa) {
		this.dep_hpa = dep_hpa;
	}

	public String getStr_sep_hp() {
		return str_sep_hp;
	}

	public void setStr_sep_hp(String str_sep_hp) {
		this.str_sep_hp = str_sep_hp;
	}

	public String getResul_hp() {
		return resul_hp;
	}

	public void setResul_hp(String resul_hp) {
		this.resul_hp = resul_hp;
	}

	public double getHp_orient() {
		return hp_orient;
	}

	public void setHp_orient(double hp_orient) {
		this.hp_orient = hp_orient;
	}

	public double getQs50() {
		return qs50;
	}

	public void setQs50(double qs50) {
		this.qs50 = qs50;
	}

	public double getQs51() {
		return qs51;
	}

	public void setQs51(double qs51) {
		this.qs51 = qs51;
	}

	public double getQs52() {
		return qs52;
	}

	public void setQs52(double qs52) {
		this.qs52 = qs52;
	}

	public double getQs53() {
		return qs53;
	}

	public void setQs53(double qs53) {
		this.qs53 = qs53;
	}

	public double getQs54() {
		return qs54;
	}

	public void setQs54(double qs54) {
		this.qs54 = qs54;
	}

	public double getQs55() {
		return qs55;
	}

	public void setQs55(double qs55) {
		this.qs55 = qs55;
	}

	public double getAutres() {
		return autres;
	}

	public void setAutres(double autres) {
		this.autres = autres;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}



	

	
	
} 

