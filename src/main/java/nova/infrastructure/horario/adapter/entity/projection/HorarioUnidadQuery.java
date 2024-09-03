package nova.infrastructure.horario.adapter.entity.projection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HorarioUnidadQuery implements Serializable {
    private Integer id;
    private Integer operatividadId;
    private String operatividadNombre;
    private LocalTime apertura;
    private LocalTime cierre;
}