package nova.infrastructure.seguimiento.adapter.mapper;

import nova.domain.seguimiento.model.entity.Seguimiento;
import nova.infrastructure.seguimiento.adapter.entity.SeguimientoModel;
import nova.infrastructure.seguimiento.adapter.entity.projection.SeguimientoQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SeguimientoModelMapper {
    SeguimientoModel toEntity(Seguimiento seguimiento);

    Seguimiento toDomain(SeguimientoModel seguimientoModel);

    @Mapping(target = "ticket.id", source = "ticketId")
    @Mapping(target = "estatus.nombre", source = "estatusNombre")
    Seguimiento toDto(SeguimientoQuery seguimientoModel);

    List<Seguimiento> lisToDomain(List<SeguimientoQuery> data);
}