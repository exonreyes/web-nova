package nova.domain.seguimiento.port;

import nova.domain.seguimiento.model.entity.Seguimiento;

import java.util.List;

public interface SeguimientoDao {
    List<Seguimiento> getSeguimientoByTicketId(Integer idTicket);
}
