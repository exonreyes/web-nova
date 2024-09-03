package nova.domain.contacto.telefono;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TelefonoExtension extends Telefono {
    private List<Extension> extensiones = new ArrayList<Extension>();
}
