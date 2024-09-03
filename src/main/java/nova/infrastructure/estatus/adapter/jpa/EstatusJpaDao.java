package nova.infrastructure.estatus.adapter.jpa;

import lombok.RequiredArgsConstructor;
import nova.domain.estatus.model.entity.Estatus;
import nova.domain.estatus.port.EstatusDao;
import nova.infrastructure.estatus.adapter.EstatusRepository;
import nova.infrastructure.estatus.adapter.mapper.EstatusModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EstatusJpaDao implements EstatusDao {
    private final EstatusRepository repository;
    private final EstatusModelMapper mapper;

    @Override
    public List<Estatus> getAllEstatus() {
        return mapper.toDto(repository.findAll());
    }
}
