package nova.domain.seguimiento.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SeguimientoCreateCommand {
    private String agente;
    private Integer idEstatus;
    private String descripcion;
    private Integer idTicket;
}
