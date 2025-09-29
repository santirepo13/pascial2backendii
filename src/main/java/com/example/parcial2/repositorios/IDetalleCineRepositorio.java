package com.example.parcial2.repositorios;
import com.example.parcial2.ayudas.Ciudad;
import com.example.parcial2.modelos.DetalleCine;
import java.util.List;
import java.util.Optional;

public interface IDetalleCineRepositorio {
    List<DetalleCine> findByCiudad(Ciudad ciudad);
    Optional<DetalleCine> findById(Long id);
    DetalleCine save(DetalleCine detallecine);

}
