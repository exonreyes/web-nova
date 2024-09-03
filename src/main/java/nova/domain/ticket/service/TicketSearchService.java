package nova.domain.ticket.service;

import lombok.RequiredArgsConstructor;
import nova.application.ticket.query.FilterTicketCommand;
import nova.domain.ticket.model.entity.Ticket;
import nova.domain.ticket.model.exception.TicketNotFoundException;
import nova.domain.ticket.port.TicketDao;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class TicketSearchService {
    private final TicketDao dao;
    private final TicketSearchValidator ticketSearchValidator;

    public Map<String, Object> search(FilterTicketCommand cmd) {
        ticketSearchValidator.checkFilter(cmd);
        return dao.getTicketsByFiltro(cmd, "creado");
    }

    public Ticket searchById(Integer id) {
        return dao.getById(id).orElseThrow(() -> new TicketNotFoundException("No se pudo obtener el ticket procesado"));
    }
}
