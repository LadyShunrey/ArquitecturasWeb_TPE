package com.app.monopatin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.monopatin.domain.Monopatin;
import com.app.monopatin.dto.MonopatinDTO;
import com.app.monopatin.repository.MonopatinRepository;

import jakarta.transaction.Transactional;

@Service
public class MonopatinService {
	private MonopatinRepository monopatinRepository;

	public MonopatinService(MonopatinRepository monopatinRepository) {
		this.monopatinRepository = monopatinRepository;
	}
	
	@Transactional
	public Monopatin agregarMonopatin(Monopatin monopatin) throws Exception {
		try {
			return this.monopatinRepository.save(monopatin);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<MonopatinDTO> listarMonopatinesOrdenadosPorId() {
		return this.monopatinRepository.getAllMonopatinOrderByID().stream()
				.map(monopatin -> new MonopatinDTO(monopatin.getIdMonopatin(), monopatin.isEnMantenimiento(), monopatin.getLatitud(), monopatin.getLongitud()))
				.toList();

	}

	public void eliminarMonopatin(Long idMonopatin) {
		this.monopatinRepository.eliminarMonopatinPorID(idMonopatin);
	}

	@Transactional
	public Monopatin actualizarMonopatin (Monopatin monopatin) {
		// Obtenemos el registro a actualizar
		Monopatin registroActualizado = monopatinRepository.findById(monopatin.getIdMonopatin()).orElseThrow();

		// Actualizamos los datos que queremos modificar
		registroActualizado.setKilometros(monopatin.getKilometros());
		registroActualizado.setTiempo(monopatin.getTiempo());
		registroActualizado.setEnMantenimiento(monopatin.isEnMantenimiento());

		// Guardamos el registro actualizado
		monopatinRepository.save(registroActualizado);

		return registroActualizado;
	}

	@Transactional
	public Optional<MonopatinDTO> getMonopatinById(Long idMonopatin) {
		return this.monopatinRepository.findById(idMonopatin).map(monopatin->new MonopatinDTO(monopatin.getIdMonopatin(), monopatin.isEnMantenimiento(), monopatin.getLatitud(), monopatin.getLongitud()));
	}
}
