package com.sista.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sista.entities.Inf_intervenant;


public interface Inf_intervenantRepository extends JpaRepository<Inf_intervenant, Long>{

	public Optional<Inf_intervenant> findByintervenant(float intervenant);
}
