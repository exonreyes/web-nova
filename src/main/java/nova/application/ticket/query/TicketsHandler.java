package nova.application.ticket.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.domain.ticket.service.TicketSearchService;
import nova.infrastructure.ticket.rest.command.TicketFilterRequest;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class TicketsHandler implements Handler<Map<String, Object>, TicketFilterRequest> {
    private final TicketSearchService searchService;

    @Override
    public Map<String, Object> execute(TicketFilterRequest params) {
        FilterTicketCommand command = new FilterTicketCommand(params.getIdUnidad(), params.getIdArea(), params.getIdEstatus(), params.getPagina(), params.getFilas(), params.getDesde(), params.getHasta(), params.getFolio());
        return searchService.search(command);
    }
}