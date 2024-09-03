package nova.infrastructure.ticket.rest.command;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class TicketCreateRequest {
    @NotNull
    private Integer idReporte;

    private String folio;
    private Integer idEstatus;

    @NotNull
    private Integer idUnidad;
    private String agente;
    private String descripcion;
}
