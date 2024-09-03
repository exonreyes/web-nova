package nova.domain.area.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class AreaDto {
    private Integer id;
    private String nombre;
    private List<ReporteDto> reportes;
}