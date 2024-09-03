package nova.domain.unidad.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nova.domain.contacto.direccion.model.entity.Direccion;
import nova.domain.contacto.telefono.Telefono;
import nova.domain.horario.model.entity.Operatividad;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Unidad {
    private Integer id;
    private String clave;
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;
    private List<Operatividad> horarios;

    public Unidad(Integer id, String clave, String nombre) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
    }

    public Unidad(Integer id) {
        this.id = id;
    }
}
