package com.app.monopatin.service;

import java.util.List;

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
	public Monopatin save(Monopatin entity) throws Exception {
		try {
			return this.monopatinRepository.save(entity);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public List<MonopatinDTO> getAllMonopatinOrderByID() {
		return this.monopatinRepository.getAllMonopatinOrderByID().stream()
				.map(monopatin -> new MonopatinDTO(monopatin.getIdMonopatin(), monopatin.isEnMantenimiento(), monopatin.getUbicacion()))
				.toList();

	}
}
