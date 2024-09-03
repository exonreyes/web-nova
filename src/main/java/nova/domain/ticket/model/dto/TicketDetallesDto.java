package nova.domain.ticket.model.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TicketDetallesDto extends TicketDto {
    private String nota;
    private String agente;

    public TicketDetallesDto(Integer id, String folio, String unidad, String reporte, String area, LocalDateTime creado, String estatus) {
        super(id, folio, unidad, reporte, area, creado, estatus);
    }
}
