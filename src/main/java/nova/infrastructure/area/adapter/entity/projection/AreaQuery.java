package nova.infrastructure.area.adapter.entity.projection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AreaQuery {
    private Integer id;
    private String nombre;

    public AreaQuery(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}