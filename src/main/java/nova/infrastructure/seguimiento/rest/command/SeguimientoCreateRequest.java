package nova.infrastructure.seguimiento.rest.command;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SeguimientoCreateRequest {
    private String agente;
    @NotNull
    @Min(value = 1)
    private Integer idEstatus;
    private String descripcion;
    @NotNull
    @Min(value = 1)
    private Integer idTicket;
}
