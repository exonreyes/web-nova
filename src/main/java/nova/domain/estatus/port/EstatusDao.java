package nova.domain.estatus.port;

import nova.domain.estatus.model.entity.Estatus;

import java.util.List;

public interface EstatusDao {
    List<Estatus> getAllEstatus();
}
