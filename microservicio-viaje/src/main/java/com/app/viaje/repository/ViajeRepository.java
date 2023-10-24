package com.app.viaje.repository;

import com.app.viaje.domain.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {

    @Query("FROM Viaje v")
    public List<Object>getAllViajes();

}
