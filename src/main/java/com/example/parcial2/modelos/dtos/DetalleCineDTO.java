package com.example.parcial2.modelos.dtos;
import com.example.parcial2.ayudas.Ciudad;
import com.example.parcial2.modelos.Cine;


public class DetalleCineDTO {
    long id;
    String direccion;
    Ciudad ciudad;
    String telefono;
    Cine cine;


    public DetalleCineDTO(Long id, String direccion, Ciudad ciudad, String telefono, Cine cine) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.cine = cine;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
