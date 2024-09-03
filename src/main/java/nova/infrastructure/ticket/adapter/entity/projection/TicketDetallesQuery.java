package nova.infrastructure.ticket.adapter.entity.projection;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TicketDetallesQuery extends TicketQuery {
    private final String agente;
    private final String descripcion;

    public TicketDetallesQuery(Integer id, String reporteAreaNombre, String reporteNombre, Integer unidadId, String unidadClave, String unidadNombre, String estatusNombre, String folio, LocalDateTime creado, Integer nivel, String agente, String descripcion) {
        super(id, reporteAreaNombre, reporteNombre, unidadId, unidadClave, unidadNombre, estatusNombre, folio, creado, nivel);
        this.agente = agente;
        this.descripcion = descripcion;
    }
}
