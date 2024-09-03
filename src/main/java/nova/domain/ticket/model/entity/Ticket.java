package nova.domain.ticket.model.entity;

import lombok.*;
import nova.domain.area.model.entity.Area;
import nova.domain.area.model.entity.Reporte;
import nova.domain.estatus.model.entity.Estatus;
import nova.domain.unidad.model.entity.Unidad;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Ticket implements Serializable {
    private Integer id;
    private Reporte reporte;
    private Area area;
    private Unidad unidad;
    private Estatus estatus;
    private String folio;
    private String descripcion;
    private String agente;
    private LocalDateTime creado;
    private LocalDateTime actualizado;
    private Boolean activo;
    private Boolean publicar;
    private Integer nivel;

    public void setDefaultStatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public void asignarFechaCreacion() {
        this.setCreado(LocalDateTime.now());
    }
}