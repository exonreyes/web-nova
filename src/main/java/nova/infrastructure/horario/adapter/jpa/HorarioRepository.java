package nova.infrastructure.horario.adapter.jpa;

import nova.infrastructure.horario.adapter.entity.HorarioModel;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HorarioRepository extends JpaRepository<HorarioModel, Integer> {
    <T> List<T> findBy(Class<T> type);

    @EntityGraph(attributePaths = {"operatividad"})
    List<HorarioModel> findByUnidad_Id(Integer id);

}