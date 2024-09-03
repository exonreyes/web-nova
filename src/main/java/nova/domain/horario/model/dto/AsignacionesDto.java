package nova.domain.horario.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class AsignacionesDto {
    private OperatividadDto operatividad;
    private List<UnidadAsignacionDto> horarios;
}
