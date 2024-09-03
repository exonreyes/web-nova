package nova.infrastructure.ticket.adapter.jpa.repository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import nova.domain.exception.EntityException;
import nova.domain.ticket.model.entity.Ticket;
import nova.domain.ticket.port.TicketRepository;
import nova.infrastructure.ticket.adapter.jpa.TicketAdapterRepository;
import nova.infrastructure.ticket.adapter.mapper.TicketModelMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
@RequiredArgsConstructor
public class TicketJpaRepository implements TicketRepository {
    private final TicketAdapterRepository repository;
    private final TicketModelMapper mapper;

    @Override
    public Ticket save(Ticket cmd) {
        var ticket = mapper.toEntity(cmd);
        try {
            var ticketResponse = repository.save(ticket);
            return mapper.toDomain(ticketResponse);
        } catch (Exception e) {
            throw new EntityException(4, "No se pudo guardar el ticket");
        }
    }
}
