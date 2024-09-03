package nova.domain.contacto.telefono;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Telefono {
    private Integer id;
    private String telefono;
    private TipoTelefono tipo;
}
