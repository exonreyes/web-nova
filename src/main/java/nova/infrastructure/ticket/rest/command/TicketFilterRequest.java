package nova.infrastructure.ticket.rest.command;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class TicketFilterRequest {
    private Integer idUnidad;
    private Integer idEstatus;
    private Integer idArea;

    @NotNull(message = "Debe asignar una pagina a consultar")
    private Integer pagina;

    @NotNull(message = "Debe asignar el número de filas a consultar")
    @Min(value = 1)
    private Integer filas;

    private String folio;

    @PastOrPresent
    private LocalDateTime desde;

    @PastOrPresent
    private LocalDateTime hasta;
}
