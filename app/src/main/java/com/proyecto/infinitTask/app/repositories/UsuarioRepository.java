package com.proyecto.infinitTask.app.repositories;

import com.proyecto.infinitTask.app.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    //Usuario findByIdWithRoles(@Param("usuarioId") int id);
}