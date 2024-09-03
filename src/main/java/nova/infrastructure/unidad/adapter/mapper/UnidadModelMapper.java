package nova.infrastructure.unidad.adapter.mapper;

import nova.domain.unidad.model.entity.Unidad;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadContactoQuery;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadDireccionQuery;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadQuery;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadTelefonoQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UnidadModelMapper {
    Unidad toDto(UnidadQuery model);

    Unidad toDto(UnidadTelefonoQuery model);

    Unidad toDto(UnidadDireccionQuery model);

    @Mapping(target = "telefono", source = "telefono")
    @Mapping(target = "direccion", source = "direccion")
    Unidad toDto(UnidadContactoQuery model);

    List<Unidad> toInfoDto(List<UnidadQuery> info);
}