package com.sista.services;

import java.util.List;

import com.sista.dto.ComportementaleValue;

public interface comportvalueservice {
	//retoune la list des étiquetes comportementale à partir du level id
	public List<ComportementaleValue> listcomportementalevalue(Long levelId);
	
	//retourne un objet de comportementalevalue(étiquetes comportementale) à partir de id comportementale
	public ComportementaleValue findByIdComportementale(Long idcomp);
}
