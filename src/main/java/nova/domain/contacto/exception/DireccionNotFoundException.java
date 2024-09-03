package nova.domain.contacto.exception;

import nova.domain.exception.EntityException;

public class DireccionNotFoundException extends EntityException {
    public DireccionNotFoundException(String message) {
        super(2, message);
    }
}
