package com.sista.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sista.entities.Intervention;


public interface InterventionRepository extends JpaRepository<Intervention, Long> {

	/*@Query("Select i From Intervention i")
	public List<Intervention> toutItern();*/
}
