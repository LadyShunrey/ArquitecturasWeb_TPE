package com.app.cuenta.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.cuenta.domain.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long>{
	
	@Query("FROM Cuenta c WHERE c.idCuenta= :idCuenta")
	public Optional<Cuenta> buscarCuentaPorID(Long idCuenta);
	
	
}
