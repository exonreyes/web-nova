package nova.domain.horario.service;

import nova.domain.horario.model.entity.Horario;
import nova.domain.horario.model.entity.Operatividad;
import nova.domain.horario.port.out.HorarioGroupService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HorarioGroupAllocator implements HorarioGroupService {

    @Override
    public List<Operatividad> groupByOperatividad(List<Horario> horarios) {
        Map<Integer, Operatividad> operatividadesMap = new HashMap<>();
        for (Horario horario : horarios) {
            Operatividad operatividad = operatividadesMap
                    .computeIfAbsent(horario.getOperatividad().getId(),
                            id -> new Operatividad(id, horario.getOperatividad().getNombre(), new ArrayList<>())
                    );
            operatividad.getHorarios().add(horario);
        }
        return new ArrayList<>(operatividadesMap.values());
    }
}
