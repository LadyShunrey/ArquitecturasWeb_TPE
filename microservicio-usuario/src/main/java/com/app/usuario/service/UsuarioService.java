package com.app.usuario.service;

import com.app.usuario.domain.Usuario;
import com.app.usuario.dto.UsuarioDTO;
import com.app.usuario.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario agregarUsuario(Usuario entity) throws Exception{
        try {
            return this.usuarioRepository.save(entity);
        }
        catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        // Obtenemos el registro a actualizar
        Usuario registroActualizado = usuarioRepository.findById(usuario.getIdUsuario()).orElseThrow();

        // Actualizamos los datos que queremos modificar
        registroActualizado.setNombre(usuario.getNombre());
        registroActualizado.setApellido(usuario.getApellido());
        registroActualizado.setEmail(usuario.getEmail());

        // Guardamos el registro actualizado
        usuarioRepository.save(registroActualizado);

        return registroActualizado;
    }

   public void eliminarUsuario(Long dni){
        this.usuarioRepository.eliminarUsuarioPorDni(dni);
   }

   public Optional<UsuarioDTO> buscarUsuarioPorDni(Long dni){
       return this.usuarioRepository.buscarPorDni(dni).map(usuario->new UsuarioDTO(usuario.getIdUsuario(), usuario.getNombreUsuario(), usuario.getNombre(), usuario.getApellido(), usuario.getNumeroCelular(), usuario.getEmail(), usuario.getDni(), usuario.getLatitud(), usuario.getLongitud()));
   }

    public List<UsuarioDTO> listarUsuarios() {
        return this.usuarioRepository.findAll().stream().map(usuario->new UsuarioDTO(usuario.getIdUsuario(), usuario.getNombreUsuario(), usuario.getNombre(), usuario.getApellido(), usuario.getNumeroCelular(), usuario.getEmail(), usuario.getDni(), usuario.getLatitud(), usuario.getLongitud())).toList();
    }
}
