package nova.application.horario.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.domain.horario.model.entity.Horario;
import nova.domain.horario.port.in.HorarioDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HorarioUnidadHandler implements Handler<List<Horario>, Integer> {
    private final HorarioDao horarioDao;

    @Override
    public List<Horario> execute(Integer idUnidad) {
        return horarioDao.getOperatividadByIdUnidad(idUnidad);
    }
}
