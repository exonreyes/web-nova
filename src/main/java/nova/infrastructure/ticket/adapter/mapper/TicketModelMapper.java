package nova.infrastructure.ticket.adapter.mapper;

import nova.domain.ticket.model.dto.command.TicketCreateCommand;
import nova.domain.ticket.model.entity.Ticket;
import nova.infrastructure.ticket.adapter.entity.TicketModel;
import nova.infrastructure.ticket.adapter.entity.projection.TicketDetallesQuery;
import nova.infrastructure.ticket.adapter.entity.projection.TicketQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketModelMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "reporteNombre", target = "reporte.nombre")
    @Mapping(source = "reporteAreaNombre", target = "area.nombre")
    @Mapping(source = "estatusNombre", target = "estatus.nombre")
    @Mapping(source = "unidadId", target = "unidad.id")
    @Mapping(source = "unidadClave", target = "unidad.clave")
    @Mapping(source = "unidadNombre", target = "unidad.nombre")
    Ticket toDomain(TicketQuery dto);

    List<Ticket> listQueryToDomain(List<TicketQuery> data);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "reporteNombre", target = "reporte.nombre")
    @Mapping(source = "reporteAreaNombre", target = "area.nombre")
    @Mapping(source = "estatusNombre", target = "estatus.nombre")
    @Mapping(source = "unidadId", target = "unidad.id")
    @Mapping(source = "unidadClave", target = "unidad.clave")
    @Mapping(source = "unidadNombre", target = "unidad.nombre")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "agente", target = "agente")
    Ticket toDomain(TicketDetallesQuery dto);

    TicketModel toEntity(Ticket ticket);

    @Mapping(target = "estatus.id", source = "idEstatus")
    @Mapping(target = "reporte.id", source = "idReporte")
    @Mapping(target = "unidad.id", source = "idUnidad")
    TicketModel toEntity(TicketCreateCommand cmd);

    Ticket toDomain(TicketModel model);
}