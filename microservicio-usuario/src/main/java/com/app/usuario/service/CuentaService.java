package com.app.usuario.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.cuenta.domain.Cuenta;
import com.app.cuenta.dto.CuentaDTO;
import com.app.cuenta.repository.CuentaRepository;

import jakarta.transaction.Transactional;

@Service
public class CuentaService {
	private CuentaRepository cuentaRepository;

	public CuentaService(CuentaRepository cuentaRepository) {
		super();
		this.cuentaRepository = cuentaRepository;
	}
	
	@Transactional
	public Cuenta save(Cuenta entity) throws Exception{
		try {
			return this.cuentaRepository.save(entity);
		}catch(Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	
	public Optional<CuentaDTO> buscarCuentaPorID(Long idCuenta){
		return this.cuentaRepository.buscarCuentaPorID(idCuenta).map(cuenta -> new CuentaDTO(cuenta.getIdCuenta(), cuenta.getFechaAlta(), cuenta.getDineroDisponible()));
	}
	
	
	public void eliminarCuentaPorID(Long idCuenta){
		this.cuentaRepository.eliminarCuentaPorID(idCuenta);
	}
}
