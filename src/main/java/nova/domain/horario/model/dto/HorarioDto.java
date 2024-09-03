package nova.domain.horario.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HorarioDto {
    private Integer id;
    private String apertura;
    private String cierre;
}
