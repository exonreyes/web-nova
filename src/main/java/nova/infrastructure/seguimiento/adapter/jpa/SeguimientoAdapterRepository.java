package nova.infrastructure.seguimiento.adapter.jpa;

import nova.infrastructure.seguimiento.adapter.entity.SeguimientoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeguimientoAdapterRepository extends JpaRepository<SeguimientoModel, Integer> {
    <T>
    List<T> findByTicket_IdOrderByCreadoDesc(@Param("id") Integer id, Class<T> type);
}