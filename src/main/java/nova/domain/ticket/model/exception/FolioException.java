package nova.domain.ticket.model.exception;

import nova.domain.exception.EntityException;

public class FolioException extends EntityException {
    public FolioException(int code, String message) {
        super(code, message);
    }
}
