package nova.domain.unidad.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nova.domain.horario.model.dto.AsignacionDto;

import java.util.List;

@AllArgsConstructor
@Getter
public class UnidadOperatividadDto {
    private Integer id;
    private List<AsignacionDto> operatividades;
}