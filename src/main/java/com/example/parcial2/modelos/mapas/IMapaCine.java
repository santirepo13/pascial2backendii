package com.example.parcial2.modelos.mapas;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaCine {

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "nit", target = "nit")
    @Mapping(source = "detalle", target = "detalle")
    @Mapping(source = "salas", target = "salas")
    CineDTO toDTO(Cine cine);

    List<CineDTO> toDTOs(List<Cine> cines);
}
