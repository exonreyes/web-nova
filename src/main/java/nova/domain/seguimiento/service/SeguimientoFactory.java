package nova.domain.seguimiento.service;

import nova.domain.estatus.model.entity.Estatus;
import nova.domain.seguimiento.model.dto.command.SeguimientoCreateCommand;
import nova.domain.seguimiento.model.entity.Seguimiento;
import nova.domain.ticket.model.entity.Ticket;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class SeguimientoFactory {
    public Seguimiento create(SeguimientoCreateCommand cmd) {
        return Seguimiento
                .builder()
                .ticket(Ticket.builder().id(cmd.getIdTicket()).build())
                .estatus(new Estatus(cmd.getIdEstatus(), null))
                .agente(Optional.ofNullable(cmd.getAgente())
                        .filter(agente -> !agente.isBlank())
                        .orElse("N/A"))
                .descripcion(Optional.ofNullable(cmd.getDescripcion()).filter(descripcion -> !descripcion.isBlank()).orElse("N/A"))
                .creado(LocalDateTime.now())
                .build();
    }
}
