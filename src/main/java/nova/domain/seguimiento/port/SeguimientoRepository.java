package nova.domain.seguimiento.port;

import nova.domain.seguimiento.model.entity.Seguimiento;

public interface SeguimientoRepository {
    Boolean registrar(Seguimiento seguimiento);
}
