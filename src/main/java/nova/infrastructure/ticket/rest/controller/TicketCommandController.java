package nova.infrastructure.ticket.rest.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import nova.application.ticket.command.TicketCreateHandler;
import nova.infrastructure.ticket.rest.command.TicketCreateRequest;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
@RequiredArgsConstructor
public class TicketCommandController {
    private final TicketCreateHandler createHandler;

    @PostMapping("nuevo")
    public ResponseEntity<ApiResponse> save(@Valid @RequestBody TicketCreateRequest params) {
        return ResponseEntity.ok(ApiResponse.builder().data(createHandler.execute(params)).message("Ticket registrado").code(HttpStatus.OK.value()).build());
    }
}
