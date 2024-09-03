package nova.domain.horario.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class HorarioOperativo {
    private Operatividad operatividad;
    private List<Horario> horarios;
}
