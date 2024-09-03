package nova.domain.horario.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AsignacionDto {
    private OperatividadDto operatividad;
    private HorarioDto horario;
}
