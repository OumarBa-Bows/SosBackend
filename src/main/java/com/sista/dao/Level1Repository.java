package com.sista.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sista.entities.Inf_intervenant;
import com.sista.entities.Level1;
import com.sista.entities.Structurelle;

public interface Level1Repository extends JpaRepository<Level1, Long>{
	
	
	@Query("Select struc FROM Structurelle struc, Level1 l WHERE l.level=?1 AND struc.level1.level = l.level")
	public List<Structurelle> findallStructure(Long levelId);
	
	@Query("Select inf FROM Inf_intervenant inf, Level1 l WHERE l.level=?1 AND inf.level1.level = l.level")
	public List<Inf_intervenant> findAllIntervenant(Long levelId);
	
	
}
