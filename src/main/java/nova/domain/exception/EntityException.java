package nova.domain.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class EntityException extends RuntimeException {
    private final int code;

    public EntityException(int code, String message) {
        super(message);
        this.code = code;
    }
}
