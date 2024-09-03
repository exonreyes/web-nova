package nova.domain.contacto.telefono;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Extension {
    private Integer id;
    private String numero;
    private String nombre;
    private boolean activo;

    public Extension(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

}
