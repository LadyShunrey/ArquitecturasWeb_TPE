package com.app.monopatin.service;

import java.util.List;
import java.util.Optional;

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
	public Parada agregarParada(Parada parada) throws Exception{
		try {
			return this.paradaRepository.save(parada);
		}catch(Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	
	public List<ParadaDTO> listarParadas(){
		return this.paradaRepository.findAll().stream().map(parada -> new ParadaDTO(parada.getIdParada(), parada.getLatitud(), parada.getLongitud())).toList();
	}
	@Transactional
	public Optional<ParadaDTO> buscarParadaPorId(Long idParada) {
		return this.paradaRepository.findById(idParada).map(parada->new ParadaDTO(parada.getIdParada(), parada.getLatitud(), parada.getLongitud()));
	}

	public void eliminarParada(Long idParada) {
		this.paradaRepository.deleteById(idParada);
	}
	@Transactional
	public Parada actualizarParada(Parada parada) {
		// Obtenemos el registro a actualizar
		Parada registroActualizado = paradaRepository.findById(parada.getIdParada()).orElseThrow();

		// Actualizamos los datos que queremos modificar
		registroActualizado.setLatitud(parada.getLatitud());
		registroActualizado.setLongitud(parada.getLongitud());

		// Guardamos el registro actualizado
		paradaRepository.save(registroActualizado);

		return registroActualizado;
	}
}
