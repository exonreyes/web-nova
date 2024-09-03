package nova.infrastructure.seguimiento.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import nova.domain.seguimiento.model.entity.Seguimiento;
import nova.domain.seguimiento.port.SeguimientoDao;
import nova.infrastructure.seguimiento.adapter.entity.projection.SeguimientoQuery;
import nova.infrastructure.seguimiento.adapter.jpa.SeguimientoAdapterRepository;
import nova.infrastructure.seguimiento.adapter.mapper.SeguimientoModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SeguimientoJpaDao implements SeguimientoDao {
    private final SeguimientoAdapterRepository repository;
    private final SeguimientoModelMapper mapper;

    @Override
    public List<Seguimiento> getSeguimientoByTicketId(Integer idTicket) {
        return mapper.lisToDomain(repository.findByTicket_IdOrderByCreadoDesc(idTicket, SeguimientoQuery.class));
    }
}
