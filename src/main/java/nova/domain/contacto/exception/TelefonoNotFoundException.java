package nova.domain.contacto.exception;

import lombok.Getter;
import nova.domain.exception.EntityException;

@Getter
public class TelefonoNotFoundException extends EntityException {
    public TelefonoNotFoundException(String message) {
        super(1, message);
    }
}
