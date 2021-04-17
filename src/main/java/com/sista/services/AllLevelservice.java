package com.sista.services;

import java.math.BigDecimal;
import java.util.List;

import com.sista.dto.AllLevels;

public interface AllLevelservice {
	
	//recherche allevels(all cases)
	public List<AllLevels> levels();
	
	//recherche allevels(all cases) à partir du nom de la structure
	public List<AllLevels> findByStructureName(String struc);
	
	//recherche allevles(all cases) entre deux dates
	public List<AllLevels> findByDate(BigDecimal date1, BigDecimal date2);

}
