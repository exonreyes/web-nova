package nova.domain.ticket.port;

import nova.domain.ticket.model.entity.Ticket;

public interface TicketRepository {

    Ticket save(Ticket ticket);
}
