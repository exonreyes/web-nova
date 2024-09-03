package nova.domain.horario.port.out;

import nova.domain.horario.model.entity.Horario;
import nova.domain.horario.model.entity.Operatividad;

import java.util.List;

public interface HorarioGroupService {
    List<Operatividad> groupByOperatividad(List<Horario> horarios);
}
