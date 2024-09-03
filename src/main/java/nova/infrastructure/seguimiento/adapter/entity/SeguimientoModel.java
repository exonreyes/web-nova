package nova.infrastructure.seguimiento.adapter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import nova.infrastructure.estatus.adapter.entity.EstatusModel;
import nova.infrastructure.ticket.adapter.entity.TicketModel;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ticket_seguimiento", schema = "comialex")
public class SeguimientoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_ticket", nullable = false)
    private TicketModel ticket;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estatus", nullable = false)
    private EstatusModel estatus;

    @Size(max = 50)
    @Column(name = "agente", length = 50)
    private String agente;

    @NotNull
    @Column(name = "creado", nullable = false)
    private LocalDateTime creado;

    @Column(name = "actualizado")
    private LocalDateTime actualizado;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

}