package nova.infrastructure.seguimiento.adapter.jpa.repository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import nova.domain.exception.EntityException;
import nova.domain.seguimiento.model.entity.Seguimiento;
import nova.domain.seguimiento.port.SeguimientoRepository;
import nova.infrastructure.seguimiento.adapter.jpa.SeguimientoAdapterRepository;
import nova.infrastructure.seguimiento.adapter.mapper.SeguimientoModelMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
@RequiredArgsConstructor
public class SeguimientoJpaRepository implements SeguimientoRepository {
    private final SeguimientoAdapterRepository repository;
    private final SeguimientoModelMapper mapper;

    @Override
    public Boolean registrar(Seguimiento cmd) {
        var ticket = mapper.toEntity(cmd);
        try {
            var ticketResponse = repository.save(ticket);
            return true;
        } catch (Exception e) {
            throw new EntityException(4, "Error al registra el seguimiento");
        }
    }
}
