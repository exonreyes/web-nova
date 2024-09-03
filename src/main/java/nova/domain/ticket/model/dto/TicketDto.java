package nova.domain.ticket.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class TicketDto {
    private Integer id;
    private String folio;
    private String unidad;
    private String reporte;
    private String area;
    private LocalDateTime creado;
    private String estatus;
}
