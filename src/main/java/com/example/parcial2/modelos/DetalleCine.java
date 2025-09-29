package com.example.parcial2.modelos;
import com.example.parcial2.ayudas.Ciudad;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "detalles_cine")

public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="Direccion", nullable = false, unique = false, length = 80)
    private String direccion;
    @Column (name="Ciudad", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private Ciudad ciudad;
    @Column (name="Telefono", nullable = false, unique = true, length = 20)
    private String telefono;

    @OneToOne
    @JoinColumn(name = "cine_id", referencedColumnName = "id")
    @JsonManagedReference(value = "cine-detalle")
    private Cine cine;

    public DetalleCine() {
    }

    public DetalleCine(Long id, String direccion, Ciudad ciudad, String telefono, Cine cine) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.cine = cine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
