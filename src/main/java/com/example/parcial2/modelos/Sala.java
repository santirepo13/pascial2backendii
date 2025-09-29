package com.example.parcial2.modelos;
import com.example.parcial2.ayudas.TipoSala;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="Nombre Sala", nullable = false, unique = false, length = 30)
    private String nombre;
    @Column (name="Aforo", nullable = false, unique = false, length = 320)
    private Integer capacidad;
    @Column (name="Tipo Sala", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private TipoSala tipoSala;

    @ManyToOne
    @JoinColumn(name = "cine_id", referencedColumnName = "id")
    @JsonBackReference(value = "cine-salas")
    private Cine cine;

    public Sala() {
    }

    public Sala(Long id, String nombre, Integer capacidad, TipoSala tipoSala, Cine cine) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.cine = cine;
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

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
