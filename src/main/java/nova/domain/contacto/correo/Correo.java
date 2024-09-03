package nova.domain.contacto.correo;

import lombok.Data;

@Data
public class Correo {
    private Integer id;
    private String email;
    private String passsword;
    private Proveedor tipo;
}
