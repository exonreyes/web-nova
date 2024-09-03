package nova.domain.ticket.model.exception;

import nova.domain.exception.EntityException;

public class TicketNotFoundException extends EntityException {
    public TicketNotFoundException(String message) {
        super(3, message);
    }
}
