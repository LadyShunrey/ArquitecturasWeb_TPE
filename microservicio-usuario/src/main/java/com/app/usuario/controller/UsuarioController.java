package com.app.usuario.controller;

import com.app.usuario.domain.Usuario;
import com.app.usuario.dto.UsuarioDTO;
import com.app.usuario.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/dni/{dni}")
    public Optional<UsuarioDTO> buscarUsuarioPorDni(@PathVariable Long dni){
        return this.usuarioService.buscarUsuarioPorDni(dni);
    }

    @PostMapping("")
    public Usuario agregarUsuario(Usuario usuario) throws Exception{
        return this.usuarioService.agregarUsuario(usuario);
    }

    @PutMapping("")//preguntar que es lo que hay que poner acá
    public Usuario actualizarUsuario (Usuario usuario){
        return this.usuarioService.actualizarUsuario(usuario);
    }

    @DeleteMapping("/dni/{dni}")
    public void eliminarUsuario(@PathVariable Long dni){
        this.usuarioService.eliminarUsuario(dni);
    }

    @GetMapping("")
    public List<UsuarioDTO> listarUsuarios(){
        return this.usuarioService.listarUsuarios();
    }
}
