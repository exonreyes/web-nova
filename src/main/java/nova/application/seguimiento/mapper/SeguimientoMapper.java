package nova.application.seguimiento.mapper;

import nova.domain.seguimiento.model.dto.SeguimientoDto;
import nova.domain.seguimiento.model.entity.Seguimiento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SeguimientoMapper {

    @Mapping(source = "estatus.nombre", target = "estatus")
    SeguimientoDto toDto(Seguimiento seguimiento);
}