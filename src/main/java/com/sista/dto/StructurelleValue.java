package com.sista.dto;

public class StructurelleValue {

	private String date_intervention;
	private String appui_economique;
	private String appui_jurique;
	private String orientation;
	private String formation_specique;
	
	public StructurelleValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StructurelleValue(String intervention, String appui_economique, String appui_jurique, String orientation,
			String formation_specique) {
		super();
		this.date_intervention = intervention;
		this.appui_economique = appui_economique;
		this.appui_jurique = appui_jurique;
		this.orientation = orientation;
		this.formation_specique = formation_specique;
	}

	public String getDate_intervention() {
		return date_intervention;
	}

	public void setDate_intervention(String intervention) {
		this.date_intervention = intervention;
	}

	public String getAppui_economique() {
		return appui_economique;
	}

	public void setAppui_economique(String appui_economique) {
		this.appui_economique = appui_economique;
	}

	public String getAppui_jurique() {
		return appui_jurique;
	}

	public void setAppui_jurique(String appui_jurique) {
		this.appui_jurique = appui_jurique;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getFormation_specique() {
		return formation_specique;
	}

	public void setFormation_specique(String formation_specique) {
		this.formation_specique = formation_specique;
	}
	
	
	
	
}
