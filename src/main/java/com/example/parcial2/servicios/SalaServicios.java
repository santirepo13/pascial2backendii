package com.example.parcial2.servicios;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicios {

    @Autowired
    private ISalaRepositorio salaRepositorio;

    public Sala guardarSala(Sala sala) throws Exception {
        try {
            return this.salaRepositorio.save(sala);
        } catch (Exception error) {
            throw new Exception("Error guardando sala", error);
        }
    }

}
