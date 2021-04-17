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

@Table(name="intervention")
@Entity
public class Intervention implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="`intervention-id`")
	private Long interventionId;
	private float comp;
	private float bio; 
	private float struct;
	
	@JsonBackReference(value="level1-intervention")
	@ManyToOne
	@JoinColumn(name="`level-1-id`")
    private Level1 level1;
	
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intervention(Long interventionId, float comp, float bio, float struct, Level1 level1) {
		super();
		this.interventionId = interventionId;
		this.comp = comp;
		this.bio = bio;
		this.struct = struct;
		this.level1 = level1;
	}

	public Long getInterventionId() {
		return interventionId;
	}

	public void setInterventionId(Long interventionId) {
		this.interventionId = interventionId;
	}

	public float getComp() {
		return comp;
	}

	public void setComp(float comp) {
		this.comp = comp;
	}

	public float getBio() {
		return bio;
	}

	public void setBio(float bio) {
		this.bio = bio;
	}

	public float getStruct() {
		return struct;
	}

	public void setStruct(float struct) {
		this.struct = struct;
	}

	public Level1 getLevel1() {
		return level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}



	
	
	
	
}
