package nova.domain.contacto.direccion.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {
    private Integer id;
    private String direccion;

    public Direccion(Integer id) {
        this.id = id;
    }

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
}
