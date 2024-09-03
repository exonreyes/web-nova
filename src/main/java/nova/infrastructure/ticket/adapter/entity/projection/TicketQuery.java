package nova.infrastructure.ticket.adapter.entity.projection;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class TicketQuery {
    private Integer id;
    private String reporteAreaNombre;
    private String reporteNombre;
    private Integer unidadId;
    private String unidadClave;
    private String unidadNombre;
    private String estatusNombre;
    private String folio;
    private LocalDateTime creado;
    private Integer nivel;
}
