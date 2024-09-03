package nova.domain.unidad.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UnidadDto {
    private Integer id;
    private String nombre;
    private String clave;
}