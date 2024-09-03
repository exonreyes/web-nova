package nova.application.ticket.mapper;

import nova.domain.ticket.model.dto.TicketDto;
import nova.domain.ticket.model.entity.Ticket;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketResponseMapper {
    @Mapping(target = "unidad", source = ".", qualifiedByName = "fullUnidad")
    @Mapping(target = "area", source = "area.nombre")
    @Mapping(target = "reporte", source = "reporte.nombre")
    @Mapping(target = "estatus", source = "estatus.nombre")
    TicketDto toDto(Ticket ticket);

    @Named("fullUnidad")
    default String toFullUnidad(Ticket ticket) {
        return ticket.getUnidad().getClave() + " " + ticket.getUnidad().getNombre();
    }
}