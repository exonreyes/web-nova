package nova.domain.ticket.service;

import nova.application.ticket.query.FilterTicketCommand;
import org.springframework.stereotype.Service;

@Service
public class TicketSearchValidator {
    private void resetPagination(FilterTicketCommand cmd) {
        cmd.setPagina(0);
        cmd.setFilas(2);
    }

    private void validateIdUnidad(FilterTicketCommand cmd) {
        if (cmd.getIdUnidad() != null && cmd.getIdUnidad() < 1) {
            cmd.setIdUnidad(null);
        }
    }

    public void checkFilter(FilterTicketCommand cmd) {
        if (existFolio(cmd.getFolio())) {
            resetPagination(cmd);
        }
        validateIdUnidad(cmd);
    }

    private boolean existFolio(String folio) {
        return folio != null && !folio.isBlank();
    }
}
