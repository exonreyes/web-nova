package nova.infrastructure.area.adapter.jpa;

import nova.infrastructure.area.adapter.entity.AreaModel;
import nova.infrastructure.area.adapter.entity.projection.AreaQuery;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AreaRepository extends JpaRepository<AreaModel, Integer> {
    //    @Query("select a from AreaModel a order by a.nombre")
    @Query("SELECT new nova.infrastructure.area.adapter.entity.projection.AreaQuery(id, nombre) " +
            "FROM AreaModel")
    List<AreaQuery> obtenerAreas();

    @EntityGraph(attributePaths = {"reportes"})
    @Query("from AreaModel")
    List<AreaModel> obtenerConReportes();
}