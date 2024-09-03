package nova.application.unidad.mapper;

import nova.domain.contacto.direccion.model.dto.DireccionDto;
import nova.domain.contacto.direccion.model.dto.TelefonoDto;
import nova.domain.contacto.direccion.model.entity.Direccion;
import nova.domain.contacto.telefono.Telefono;
import nova.domain.unidad.model.dto.UnidadContactoDto;
import nova.domain.unidad.model.dto.UnidadDto;
import nova.domain.unidad.model.entity.Unidad;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UnidadDtoMapper {
    UnidadContactoDto toContactoResponse(Unidad unidad);

    DireccionDto toDireccionResponse(Direccion direccion);

    TelefonoDto toTelefonoResponse(Telefono telefono);

    UnidadDto toResponse(Unidad unidad);

    List<UnidadDto> toResponseList(List<Unidad> unidades);
}