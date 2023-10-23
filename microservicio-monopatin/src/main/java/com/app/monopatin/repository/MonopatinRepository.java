package com.app.monopatin.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.monopatin.domain.Monopatin;

@Repository
public interface MonopatinRepository extends JpaRepository<Monopatin, Long>{
	@Query("FROM Monopatin m ORDER BY m.idMonopatin")
	public List<Monopatin> getAllMonopatinOrderByID();
	
	@Query("DELETE FROM Monopatin m WHERE m.idMonopatin= :idMonopatin")
	public Optional<Monopatin> eliminarMonopatinPorID(Long idMonopatin);
}
