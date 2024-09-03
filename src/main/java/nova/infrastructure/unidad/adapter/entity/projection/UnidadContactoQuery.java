package nova.infrastructure.unidad.adapter.entity.projection;

import lombok.Getter;
import lombok.Setter;
import nova.domain.contacto.direccion.model.entity.Direccion;
import nova.domain.contacto.telefono.Telefono;
import nova.infrastructure.unidad.adapter.entity.UnidadModel;

import java.io.Serializable;

/**
 * DTO for {@link UnidadModel}
 */
@Getter
@Setter
public class UnidadContactoQuery implements Serializable {
    private Integer id;
    private String clave;
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;

    public UnidadContactoQuery(Integer id, String clave, String nombre, Integer direccionId, String direccionDireccion, Integer telefonoId, String telefonoTelefono) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = new Telefono(telefonoId, telefonoTelefono, null);
        this.direccion = new Direccion(direccionId, direccionDireccion);
    }
}