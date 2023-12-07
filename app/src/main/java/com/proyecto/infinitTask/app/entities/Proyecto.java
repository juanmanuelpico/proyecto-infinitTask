package com.proyecto.infinitTask.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proyecto")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="activo")
    private boolean activo;

    @Column(name="fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name="fecha_fin")
    private LocalDateTime fechaFin;

    @ManyToMany(mappedBy = "proyectos")
    private Set<Usuario> usuarios = new HashSet<>();

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private Set<Tarea> tareas = new HashSet<>();

}
