package nova.domain.horario.port.in;

import nova.domain.horario.model.entity.Horario;

import java.util.List;

public interface HorarioDao {
    List<Horario> getAllOperatividad();

    List<Horario> getOperatividadByIdUnidad(Integer id);
}