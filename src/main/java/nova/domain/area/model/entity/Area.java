package nova.domain.area.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class Area {
    private Integer id;
    private List<Reporte> reportes;
    private String nombre;

    public Area(Integer id, List<Reporte> reportes, String nombre) {
        setId(id);
        this.reportes = reportes;
        setNombre(nombre);
    }

    public void setId(Integer id) {
        this.id = Objects.requireNonNull(id, "El id no puede ser nulo");
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }
}