package nova.infrastructure.area.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import nova.domain.area.model.entity.Area;
import nova.domain.area.port.AreaDao;
import nova.infrastructure.area.adapter.jpa.AreaRepository;
import nova.infrastructure.area.adapter.mapper.AreaModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AreaJpaDao implements AreaDao {
    private final AreaModelMapper modelMapper;
    private final AreaRepository repository;

    @Override
    public List<Area> getAllAreas() {

        return modelMapper.toDtoInfo(repository.obtenerAreas());
    }

    @Override
    public List<Area> getAllAreasWithReportes() {
        return modelMapper.toDto(repository.obtenerConReportes());
    }
}
