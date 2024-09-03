package nova.domain.ticket.port;

import nova.application.ticket.query.FilterTicketCommand;
import nova.domain.ticket.model.entity.Ticket;

import java.util.Map;
import java.util.Optional;

public interface TicketDao {
    Map<String, Object> getTicketsByFiltro(FilterTicketCommand cmd, String orderBy);

    Optional<Ticket> getDetallesByFolio(String folio);

    Optional<Ticket> getById(Integer id);

    Boolean existsByFolio(String folio);

    Optional<Ticket> getSeguimientoByFolio(String folio);
}
