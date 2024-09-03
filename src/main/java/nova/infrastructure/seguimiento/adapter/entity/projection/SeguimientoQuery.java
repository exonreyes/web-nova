package nova.infrastructure.seguimiento.adapter.entity.projection;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class SeguimientoQuery {
    private Integer ticketId;
    private String estatusNombre;
    private String agente;
    private LocalDateTime creado;
    private LocalDateTime actualizado;
    private String descripcion;
}