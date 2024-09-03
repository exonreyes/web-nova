package nova.domain.ticket.service;

import nova.domain.area.model.entity.Reporte;
import nova.domain.estatus.model.entity.Estatus;
import nova.domain.ticket.model.constants.DefaultTicketParams;
import nova.domain.ticket.model.dto.command.TicketCreateCommand;
import nova.domain.ticket.model.entity.Ticket;
import nova.domain.unidad.model.entity.Unidad;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TicketFactory {
    public Ticket newTicket(TicketCreateCommand cmd) {
        return Ticket.builder()
                .folio(cmd.getFolio() == null ? new FolioBuilder().build() : cmd.getFolio())
                .unidad(new Unidad(cmd.getIdUnidad()))
                .reporte(new Reporte(cmd.getIdReporte(), null))
                .estatus(cmd.getIdEstatus() == null || cmd.getIdEstatus() == 0
                        ? new Estatus(DefaultTicketParams.ESTATUS, null)
                        : new Estatus(cmd.getIdEstatus(), null))
                .agente(Optional.ofNullable(cmd.getAgente())
                        .filter(agente -> !agente.isBlank())
                        .orElse(DefaultTicketParams.AGENTE))
                .creado(LocalDateTime.now()) // Mueve la asignación de la fecha a la construcción del objeto
                .nivel(DefaultTicketParams.NIVEL)
                .activo(true)
                .descripcion(Optional.ofNullable(cmd.getDescripcion()).filter(descripcion -> !descripcion.isBlank()).orElse(DefaultTicketParams.NOTA))
                .publicar(DefaultTicketParams.PUBLICAR)
                .build();
    }
}
