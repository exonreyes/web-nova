package nova.domain.ticket.service;

import lombok.RequiredArgsConstructor;
import nova.domain.ticket.port.TicketDao;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FolioValidator {
    private final TicketDao ticketDao;

    public boolean exist(String folio) {
        return ticketDao.existsByFolio(folio);
    }
}
