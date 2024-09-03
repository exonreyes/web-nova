package nova.infrastructure.unidad.adapter.entity.projection;

import lombok.Getter;
import lombok.Setter;
import nova.domain.contacto.direccion.model.entity.Direccion;

@Getter
@Setter
public final class UnidadDireccionQuery {
    private final Integer id;
    private final Direccion direccion;

    public UnidadDireccionQuery(Integer id, Integer direccionId,
                                String direccionDireccion) {
        this.id = id;
        this.direccion = new Direccion(direccionId, direccionDireccion);
    }
}