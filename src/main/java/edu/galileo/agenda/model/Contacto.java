package edu.galileo.agenda.model;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "Contacto")
@Data
public class Contacto {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
}
