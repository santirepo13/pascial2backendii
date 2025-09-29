package com.example.parcial2.servicios;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import com.example.parcial2.modelos.mapas.IMapaCine;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicios {
    @Autowired
    private ICineRepositorio cineRepositorio;
    @Autowired
    private IMapaCine mapaCine;


    //Guardamos Un Nuevo Cine

    public CineDTO guardarCine(Cine Cine) throws Exception {
        try  {
            return this.mapaCine.toDTO(this.cineRepositorio.save(Cine));
        } catch (Exception error) {
            throw new RuntimeException("Error procesando petición", error);
        }
        }
        }



