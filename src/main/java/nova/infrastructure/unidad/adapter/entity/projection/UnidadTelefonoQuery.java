package nova.infrastructure.unidad.adapter.entity.projection;

import lombok.Getter;
import lombok.Setter;
import nova.domain.contacto.telefono.Telefono;

@Getter
@Setter
public final class UnidadTelefonoQuery {
    private final Integer id;
    private final Telefono telefono;

    public UnidadTelefonoQuery(Integer id, Integer telefonoId, String telefonoTelefono) {
        this.id = id;
        this.telefono = new Telefono(telefonoId, telefonoTelefono, null);
    }

}