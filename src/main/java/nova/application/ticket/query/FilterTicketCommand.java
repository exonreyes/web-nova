package nova.application.ticket.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class FilterTicketCommand {
    private Integer idUnidad, idArea, idEstatus, pagina, filas;
    private LocalDateTime desde, hasta;
    private String folio;
}
