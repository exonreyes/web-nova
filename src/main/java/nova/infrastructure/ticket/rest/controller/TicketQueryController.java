package nova.infrastructure.ticket.rest.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import nova.application.ticket.query.TicketDetallesHandler;
import nova.application.ticket.query.TicketsHandler;
import nova.infrastructure.ticket.rest.command.TicketFilterRequest;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("ticket")
public class TicketQueryController {
    private final TicketsHandler ticketsHandler;
    private final TicketDetallesHandler detallesHandler;

    @GetMapping()
    public ResponseEntity<ApiResponse> getTicketsByFiltro(@Valid TicketFilterRequest filter) {
        return ResponseEntity.ok(ApiResponse.builder().code(HttpStatus.OK.value()).data(ticketsHandler.execute(filter)).build());
    }

    @GetMapping("detalles")
    public ResponseEntity<ApiResponse> getDetalles(@RequestParam("folio") String folio) {
        return ResponseEntity.ok(ApiResponse.builder().code(HttpStatus.OK.value()).data(detallesHandler.execute(folio)).build());
    }

}
