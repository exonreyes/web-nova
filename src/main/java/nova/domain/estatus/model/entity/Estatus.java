package nova.domain.estatus.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@Getter
public class Estatus {
    private Integer id;
    private String nombre;

    public Estatus(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(Integer id) {
        this.id = Objects.requireNonNull(id, "El id no puede ser nulo");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}