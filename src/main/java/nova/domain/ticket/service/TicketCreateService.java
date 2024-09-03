package nova.domain.ticket.service;

import lombok.RequiredArgsConstructor;
import nova.domain.exception.EntityException;
import nova.domain.ticket.model.dto.command.TicketCreateCommand;
import nova.domain.ticket.model.entity.Ticket;
import nova.domain.ticket.port.TicketRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketCreateService {
    private final FolioValidator folioValidator;
    private final TicketRepository repository;
    private final TicketFactory factory;

    public Ticket create(TicketCreateCommand cmd) {
        if (folioValidator.exist(cmd.getFolio())) {
            throw new EntityException(5, "No se pudo registrar, el folio " + cmd.getFolio() + " ya fue asignado a otro ticket");
        }
        Ticket ticket = factory.newTicket(cmd);
        return repository.save(ticket);
    }
}