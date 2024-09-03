package nova.infrastructure.horario.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import nova.domain.horario.model.entity.Horario;
import nova.domain.horario.model.entity.Operatividad;
import nova.domain.horario.port.in.HorarioDao;
import nova.infrastructure.horario.adapter.entity.HorarioModel;
import nova.infrastructure.horario.adapter.entity.projection.HorarioQuery;
import nova.infrastructure.horario.adapter.jpa.HorarioRepository;
import nova.infrastructure.horario.adapter.mapper.HorarioModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class HorarioJpaDao implements HorarioDao {
    private final HorarioRepository repository;
    private final HorarioModelMapper mapper;

    @Override
    public List<Horario> getAllOperatividad() {
        return mapper.toListQuery(repository.findBy(HorarioQuery.class));
//
//        // Agrupar por operatividad
//        Map<Integer, Operatividad> operatividadesMap = horarios.stream()
//                .collect(Collectors.toMap(
//                        horario -> horario.getOperatividad().getId(),
//                        horario -> {
//                            Operatividad operatividad = new Operatividad();
//                            operatividad.setId(horario.getOperatividad().getId());
//                            operatividad.setNombre(horario.getOperatividad().getNombre());
//                            return operatividad;
//                        },
//                        (existing, replacement) -> existing // Merge function (in case of duplicate IDs)
//                ));
//
//        // Añadir horarios a cada operatividad
//        horarios.forEach(horario -> {
//            Operatividad operatividad = operatividadesMap.get(horario.getOperatividad().getId());
//            if (operatividad != null) {
//                operatividad.getHorarios().add(horario);
//            }
//        });
//
//        return operatividadesMap.values().stream().collect(Collectors.toList());
        // Obtener todos los horarios con la operatividad

        // Agrupar por operatividad y añadir horarios en un solo paso
    }

    @Override
    public List<Horario> getOperatividadByIdUnidad(Integer id) {
        List<Horario> data = new ArrayList<>();
        for (HorarioModel horario : repository.findByUnidad_Id(id)) {
            data.add(new Horario(horario.getId(), new Operatividad(horario.getOperatividad().getId(), horario.getOperatividad().getNombre()), horario.getApertura(), horario.getCierre()));
        }
        return data;
    }
}
