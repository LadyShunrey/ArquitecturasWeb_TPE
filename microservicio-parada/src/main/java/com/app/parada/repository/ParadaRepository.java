package com.app.parada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.parada.domain.Parada;

@Repository
public interface ParadaRepository extends JpaRepository<Parada, Long>{
	
	@Query("FROM Parada p")
	public List<Parada> listarParadas();
	
}
