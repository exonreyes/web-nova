package nova.infrastructure.ticket.adapter.jpa;

import nova.infrastructure.ticket.adapter.entity.TicketModel;
import nova.infrastructure.ticket.adapter.entity.projection.TicketDetallesQuery;
import nova.infrastructure.ticket.adapter.entity.projection.TicketQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Optional;

public interface TicketAdapterRepository extends JpaRepository<TicketModel, Integer> {

    @Query("select new nova.infrastructure.ticket.adapter.entity.projection.TicketQuery(" +
            "t.id,t.reporte.area.nombre, t.reporte.nombre, t.unidad.id, t.unidad.clave, t.unidad.nombre, " +
            "t.estatus.nombre, t.folio, t.creado, t.nivel) " +
            "from TicketModel t " +
            "where (:id_unidad IS NULL OR t.unidad.id = :id_unidad) " +
            "and (:id_area IS NULL OR t.reporte.area.id = :id_area) " +
            "and (:id_estado IS NULL OR t.estatus.id = :id_estado) " +
            "and (:desde IS NULL OR t.creado >= :desde) " +
            "and (:hasta IS NULL OR t.creado <= :hasta) " +
            "and (:folio IS NULL OR t.folio = :folio) " +
            "and t.activo = true")
    Page<TicketQuery> obtenerTickets(@Param("id_unidad") Integer idUnidad,
                                     @Param("id_area") Integer idArea,
                                     @Param("id_estado") Integer idEstado,
                                     @Param("desde") LocalDateTime desde,
                                     @Param("hasta") LocalDateTime hasta,
                                     @Param("folio") String folio,
                                     Pageable pageable);

    @Query("select new nova.infrastructure.ticket.adapter.entity.projection.TicketDetallesQuery(" +
            "t.id,t.reporte.area.nombre, t.reporte.nombre, t.unidad.id, t.unidad.clave, t.unidad.nombre, " +
            "t.estatus.nombre, t.folio, t.creado, t.nivel,t.agente,t.descripcion) " +
            "from TicketModel t " +
            "where t.folio = :folio and t.activo = true")
    Optional<TicketDetallesQuery> obtenerDetalles(@Param("folio") String folio);

    <T> Optional<T> findById(Integer integer, Class<T> type);

    boolean existsByFolio(String folio);
}