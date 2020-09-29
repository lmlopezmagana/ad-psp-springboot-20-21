package com.salesianostriana.dam.springdata.repos;

import com.salesianostriana.dam.springdata.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio
    extends JpaRepository<Alumno, Long> {
}
