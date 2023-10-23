package com.app.usuario.repository;

import com.app.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("FROM Usuario u WHERE u.dni= :dni")
    public Optional<Usuario> buscarPorDni(Long dni);

    @Query("DELETE FROM Usuario u WHERE u.dni= :dni")
    public Optional<Usuario> eliminarUsuarioPorDni(Long dni);
}
