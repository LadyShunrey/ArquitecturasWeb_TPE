package com.app.viaje.repository;

import com.app.viaje.domain.Tarifa;
import com.app.viaje.dto.TarifaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

}
