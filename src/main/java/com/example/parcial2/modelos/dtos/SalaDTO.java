package com.example.parcial2.modelos.dtos;
import com.example.parcial2.ayudas.TipoSala;
import com.example.parcial2.modelos.Cine;


public class SalaDTO {

    long id;
    String nombre;
    Integer capacidad;
    TipoSala tipoSala;
    Cine cine;

    public SalaDTO(Long id, String nombre, Integer capacidad, TipoSala tipoSala, Cine cine) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.cine = cine;
    }
}
