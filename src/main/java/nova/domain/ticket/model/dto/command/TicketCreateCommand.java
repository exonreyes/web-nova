package nova.domain.ticket.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TicketCreateCommand {
    private Integer id;
    private Integer idReporte;
    private String folio;
    private Integer idEstatus;
    private Integer idUnidad;
    private String agente;
    private String descripcion;
}
