package com.example.parcial2.repositorios;
import com.example.parcial2.ayudas.TipoSala;
import com.example.parcial2.modelos.Sala;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ISalaRepositorio {

    List<Sala> findByTipoSala(TipoSala tipoSala);
    Optional<Sala> findById(Long id);
    Sala save(Sala sala);

}
