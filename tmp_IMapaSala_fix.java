package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaSala {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "tipoSala", target = "tipoSala")
    @Mapping(source = "capacidad", target = "capacidad")
    @Mapping(source = "cine", target = "cine")
    SalaDTO toDTO(Sala sala);

    List<SalaDTO> toDTOs(List<Sala> salas);
}
