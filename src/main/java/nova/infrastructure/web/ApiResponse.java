package nova.infrastructure.web;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public final class ApiResponse {
    private Object data;
    private String message;
    private Integer code;
}
