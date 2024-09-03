package nova.domain.horario.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nova.domain.unidad.model.dto.UnidadDto;

@Getter
@AllArgsConstructor
public class UnidadAsignacionDto {
    private UnidadDto unidad;
    private HorarioDto horario;
}
