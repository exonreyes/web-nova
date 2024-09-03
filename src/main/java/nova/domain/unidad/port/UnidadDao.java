package nova.domain.unidad.port;

import nova.domain.unidad.model.entity.Unidad;

import java.util.List;
import java.util.Optional;

public interface UnidadDao {
    List<Unidad> getAllUnidades();

    Optional<Unidad> getDireccion(Integer idUnidad);

    Optional<Unidad> getTelefono(Integer idUnidad);

    Optional<Unidad> getContacto(Integer idUnidad);

}
