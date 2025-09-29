package com.example.parcial2.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import com.example.parcial2.modelos.DetalleCine;
import java.util.ArrayList;

@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="Nombre Cine", nullable = false, unique = false, length = 50)
    private String nombre;

    @Column (name="Nit", nullable = false, unique = true, length = 15)
    private String nit;



    @OneToOne(mappedBy = "cine")
    @JsonBackReference(value = "cine-detalle")
    private DetalleCine detalle;


    @OneToMany(mappedBy = "cine")
    @JsonManagedReference(value="cine-salas")
    private ArrayList<Sala> salas;

    public Cine() {
    }

    public Cine(Long id, String nombre, String nit, DetalleCine detalle, ArrayList<Sala> salas) {
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