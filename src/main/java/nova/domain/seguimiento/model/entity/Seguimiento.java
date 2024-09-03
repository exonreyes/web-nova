package nova.domain.seguimiento.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nova.domain.estatus.model.entity.Estatus;
import nova.domain.ticket.model.entity.Ticket;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Builder
public class Seguimiento {
    private final Integer id;
    private final Ticket ticket;
    private final Estatus estatus;
    private final String agente;
    private final LocalDateTime creado;
    private final LocalDateTime actualizado;
    private final String descripcion;
}
