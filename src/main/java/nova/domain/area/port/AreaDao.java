package nova.domain.area.port;

import nova.domain.area.model.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> getAllAreas();

    List<Area> getAllAreasWithReportes();
}
