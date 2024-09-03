package nova.infrastructure.horario.adapter.entity.projection;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalTime;

@AllArgsConstructor
@Getter
public class HorarioQuery implements Serializable {
    private final Integer id;
    private final Integer unidadId;
    private final String unidadClave;
    private final String unidadNombre;
    private final LocalTime apertura;
    private final LocalTime cierre;
    private final Integer operatividadId;
    private final String operatividadNombre;
}
