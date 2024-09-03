package nova.domain.unidad.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nova.domain.contacto.direccion.model.dto.DireccionDto;
import nova.domain.contacto.direccion.model.dto.TelefonoDto;

@Getter
@AllArgsConstructor
public class UnidadContactoDto {
    private Integer id;
    private TelefonoDto telefono;
    private DireccionDto direccion;
}
