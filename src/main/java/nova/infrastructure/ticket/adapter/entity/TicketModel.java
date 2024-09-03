package nova.infrastructure.ticket.adapter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import nova.infrastructure.area.adapter.entity.ReporteModel;
import nova.infrastructure.estatus.adapter.entity.EstatusModel;
import nova.infrastructure.unidad.adapter.entity.UnidadModel;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ticket", schema = "comialex")
public class TicketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_reporte", nullable = false)
    private ReporteModel reporte;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_unidad", nullable = false)
    private UnidadModel unidad;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estatus", nullable = false)
    private EstatusModel estatus;

    @Size(max = 80)
    @NotNull
    @Column(name = "folio", nullable = false, length = 80)
    private String folio;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @Size(max = 50)
    @Column(name = "agente", length = 50)
    private String agente;

    @NotNull
    @Column(name = "creado", nullable = false)
    private LocalDateTime creado;

    @Column(name = "actualizado")
    private LocalDateTime actualizado;

    @NotNull
    @Column(name = "activo", nullable = false)
    private Boolean activo = false;

    @NotNull
    @Column(name = "publicar", nullable = false)
    private Boolean publicar = false;

    @NotNull
    @Column(name = "nivel", nullable = false)
    private Integer nivel;

}