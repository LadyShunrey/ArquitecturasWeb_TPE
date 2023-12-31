package com.app.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.usuario.domain.Cuenta;
import com.app.usuario.dto.CuentaDTO;
import com.app.usuario.repository.CuentaRepository;

import jakarta.transaction.Transactional;

@Service
public class CuentaService {
	private CuentaRepository cuentaRepository;

	public CuentaService(CuentaRepository cuentaRepository) {
		super();
		this.cuentaRepository = cuentaRepository;
	}
	
	@Transactional
	public Cuenta agregarCuenta(Cuenta cuenta) throws Exception{
		try {
			return this.cuentaRepository.save(cuenta);
		}catch(Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	@Transactional
	public Optional<CuentaDTO> buscarCuentaPorID(Long idCuenta){
		return this.cuentaRepository.buscarCuentaPorID(idCuenta).map(cuenta -> new CuentaDTO(cuenta.getIdCuenta(), cuenta.getFechaAlta(), cuenta.getCuentaPago(), cuenta.getDineroDisponible()));
	}

	public void eliminarCuentaPorID(Long idCuenta){
		this.cuentaRepository.eliminarCuentaPorID(idCuenta);
	}

	public List<CuentaDTO> listarCuentas() {
		return this.cuentaRepository.findAll().stream().map(cuenta -> new CuentaDTO(cuenta.getIdCuenta(), cuenta.getFechaAlta(), cuenta.getCuentaPago(), cuenta.getDineroDisponible())).toList();
	}
	@Transactional
	public Cuenta actualizarCuenta (Cuenta cuenta){
		// Obtenemos el registro a actualizar
		Cuenta registroActualizado = cuentaRepository.findById(cuenta.getIdCuenta()).orElseThrow();

		// Actualizamos los datos que queremos modificar
		registroActualizado.setFechaAlta(cuenta.getFechaAlta());
		registroActualizado.setCuentaPago(cuenta.getCuentaPago());
		registroActualizado.setDineroDisponible(cuenta.getDineroDisponible());

		// Guardamos el registro actualizado
		cuentaRepository.save(registroActualizado);

		return registroActualizado;
	}
}
