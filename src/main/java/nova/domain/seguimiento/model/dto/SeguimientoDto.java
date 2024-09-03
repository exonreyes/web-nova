package nova.domain.seguimiento.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link nova.domain.seguimiento.model.entity.Seguimiento}
 */
@AllArgsConstructor
@Getter
@Setter
public class SeguimientoDto implements Serializable {
    private Integer id;
    private String estatus;
    private String agente;
    private LocalDateTime creado;
    private LocalDateTime actualizado;
    private String descripcion;
}