package com.example.parcial2.servicios;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicios {

    @Autowired
    private IDetalleCineRepositorio detalleCineRepositorio;

    public DetalleCine guardarDetallecine(DetalleCine detallecine) throws Exception {
        try {
            return this.detalleCineRepositorio.save(detallecine);
        } catch (Exception error) {
            throw new Exception("Error guardando detalle de cine", error);
        }
    }

    }

