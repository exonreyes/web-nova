package nova.application.ticket.command;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.ticket.mapper.TicketResponseMapper;
import nova.domain.ticket.model.dto.TicketDto;
import nova.domain.ticket.model.dto.command.TicketCreateCommand;
import nova.domain.ticket.service.TicketCreateService;
import nova.domain.ticket.service.TicketSearchService;
import nova.infrastructure.ticket.rest.command.TicketCreateRequest;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketCreateHandler implements Handler<TicketDto, TicketCreateRequest> {
    private final TicketCreateService service;
    private final TicketSearchService searchTicket;
    private final TicketResponseMapper responseMapper;

    @Override
    @Transactional
    public TicketDto execute(TicketCreateRequest params) {
        var cmd = new TicketCreateCommand(0, params.getIdReporte(), params.getFolio(), params.getIdEstatus(), params.getIdUnidad(), params.getAgente(), params.getDescripcion());
        var result = service.create(cmd);
        return responseMapper.toDto(searchTicket.searchById(result.getId()));
    }
}