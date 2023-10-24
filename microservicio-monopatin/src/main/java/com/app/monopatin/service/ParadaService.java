package com.app.monopatin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.monopatin.domain.Parada;
import com.app.monopatin.dto.ParadaDTO;
import com.app.monopatin.repository.ParadaRepository;

import jakarta.transaction.Transactional;

@Service
public class ParadaService {
	private ParadaRepository paradaRepository;

	public ParadaService(ParadaRepository paradaRepository) {
		this.paradaRepository = paradaRepository;
	}
	
	@Transactional
	public Parada save(Parada entity) throws Exception{
		try {
			return this.paradaRepository.save(entity);
		}catch(Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	
	public List<ParadaDTO> listarParadas(){
		return this.paradaRepository.listarParadas().stream().map(parada -> new ParadaDTO(parada.getIdParada(), parada.getUbicacion())).toList();
	}
}
