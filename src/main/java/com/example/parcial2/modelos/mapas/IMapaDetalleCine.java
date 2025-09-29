package com.example.parcial2.modelos.mapas;
import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.DetalleCineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaDetalleCine {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "ciudad", target = "ciudad")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "cine", target = "cine")
    DetalleCineDTO toDTO(DetalleCine detalleCine);

    List<DetalleCineDTO> toDTOs(List<DetalleCine> detalles);
}
