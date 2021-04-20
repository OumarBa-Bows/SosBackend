package com.sista.entities;


import java.io.Serializable;
import java.math.BigDecimal;

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
	
	private BigDecimal date_bio;
	//@Column(precision=1, scale=0)
	private BigDecimal test_vih;
	//@Column(name="resultat_depistage", precision=1, scale=0)
	@Column(name="resultat_depistage")
	private BigDecimal result_despistage;
	private BigDecimal action;
	private BigDecimal depistage_cta;
	private BigDecimal resultat_cta;
	private BigDecimal mise_arv;
	private BigDecimal date_arv;
	@Lob
	private String pourquoi;
	private BigDecimal consultation_ist;
	private BigDecimal dep_hpa;
	@Lob
	private String str_sep_hp;
	@Lob
	private String resul_hp;
	private BigDecimal hp_orient;
	private BigDecimal qs50;
	private BigDecimal qs51;
	private BigDecimal qs52;
	private BigDecimal qs53;
	private BigDecimal qs54;
	private BigDecimal qs55;
	private BigDecimal autres;
	
	
	@JsonBackReference(value="level1-biomedicale")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Biomedicale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Biomedicale(int biomedicale, BigDecimal date_bio, BigDecimal test_vih, BigDecimal result_despistage,
			BigDecimal action, BigDecimal depistage_cta, BigDecimal resultat_cta, BigDecimal mise_arv,
			BigDecimal date_arv, String pourquoi, BigDecimal consultation_ist, BigDecimal dep_hpa, String str_sep_hp,
			String resul_hp, BigDecimal hp_orient, BigDecimal qs50, BigDecimal qs51, BigDecimal qs52, BigDecimal qs53,
			BigDecimal qs54, BigDecimal qs55, BigDecimal autres, Level1 level1) {
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

	public BigDecimal getDate_bio() {
		return date_bio;
	}

	public void setDate_bio(BigDecimal date_bio) {
		this.date_bio = date_bio;
	}

	public BigDecimal getTest_vih() {
		return test_vih;
	}

	public void setTest_vih(BigDecimal test_vih) {
		this.test_vih = test_vih;
	}

	public BigDecimal getResult_despistage() {
		return result_despistage;
	}

	public void setResult_despistage(BigDecimal result_despistage) {
		this.result_despistage = result_despistage;
	}

	public BigDecimal getAction() {
		return action;
	}

	public void setAction(BigDecimal action) {
		this.action = action;
	}

	public BigDecimal getDepistage_cta() {
		return depistage_cta;
	}

	public void setDepistage_cta(BigDecimal depistage_cta) {
		this.depistage_cta = depistage_cta;
	}

	public BigDecimal getResultat_cta() {
		return resultat_cta;
	}

	public void setResultat_cta(BigDecimal resultat_cta) {
		this.resultat_cta = resultat_cta;
	}

	public BigDecimal getMise_arv() {
		return mise_arv;
	}

	public void setMise_arv(BigDecimal mise_arv) {
		this.mise_arv = mise_arv;
	}

	public BigDecimal getDate_arv() {
		return date_arv;
	}

	public void setDate_arv(BigDecimal date_arv) {
		this.date_arv = date_arv;
	}

	public String getPourquoi() {
		return pourquoi;
	}

	public void setPourquoi(String pourquoi) {
		this.pourquoi = pourquoi;
	}

	public BigDecimal getConsultation_ist() {
		return consultation_ist;
	}

	public void setConsultation_ist(BigDecimal consultation_ist) {
		this.consultation_ist = consultation_ist;
	}

	public BigDecimal getDep_hpa() {
		return dep_hpa;
	}

	public void setDep_hpa(BigDecimal dep_hpa) {
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

	public BigDecimal getHp_orient() {
		return hp_orient;
	}

	public void setHp_orient(BigDecimal hp_orient) {
		this.hp_orient = hp_orient;
	}

	public BigDecimal getQs50() {
		return qs50;
	}

	public void setQs50(BigDecimal qs50) {
		this.qs50 = qs50;
	}

	public BigDecimal getQs51() {
		return qs51;
	}

	public void setQs51(BigDecimal qs51) {
		this.qs51 = qs51;
	}

	public BigDecimal getQs52() {
		return qs52;
	}

	public void setQs52(BigDecimal qs52) {
		this.qs52 = qs52;
	}

	public BigDecimal getQs53() {
		return qs53;
	}

	public void setQs53(BigDecimal qs53) {
		this.qs53 = qs53;
	}

	public BigDecimal getQs54() {
		return qs54;
	}

	public void setQs54(BigDecimal qs54) {
		this.qs54 = qs54;
	}

	public BigDecimal getQs55() {
		return qs55;
	}

	public void setQs55(BigDecimal qs55) {
		this.qs55 = qs55;
	}

	public BigDecimal getAutres() {
		return autres;
	}

	public void setAutres(BigDecimal autres) {
		this.autres = autres;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	


	

	
	
} 

