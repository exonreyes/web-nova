package nova.application.ticket.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.domain.ticket.model.entity.Ticket;
import nova.domain.ticket.model.exception.TicketNotFoundException;
import nova.domain.ticket.port.TicketDao;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketDetallesHandler implements Handler<Ticket, String> {
    private final TicketDao dao;

    @Override
    public Ticket execute(String folio) {
        return dao.getDetallesByFolio(folio).orElseThrow(() -> new TicketNotFoundException("No se encontraron resultados para el folio " + folio));
    }
}
