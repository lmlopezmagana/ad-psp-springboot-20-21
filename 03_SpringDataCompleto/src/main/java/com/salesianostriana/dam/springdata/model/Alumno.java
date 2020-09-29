package com.salesianostriana.dam.springdata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Alumno {

    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private LocalDate fechaNacimiento;


}
