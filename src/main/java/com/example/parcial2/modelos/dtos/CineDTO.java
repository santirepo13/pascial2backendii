package com.example.parcial2.modelos.dtos;
import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.Sala;
import java.util.ArrayList;


public class CineDTO {


    private Long id;
    private String nombre;
    private String nit;
    private DetalleCine detalle;
    private ArrayList<Sala> salas;

    public CineDTO(Long id, String nombre, String nit, DetalleCine detalle, ArrayList<Sala> salas) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
}
