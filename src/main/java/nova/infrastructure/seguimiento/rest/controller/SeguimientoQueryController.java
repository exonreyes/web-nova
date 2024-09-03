package nova.infrastructure.seguimiento.rest.controller;

import lombok.RequiredArgsConstructor;
import nova.application.seguimiento.query.SeguimientoHandler;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seguimiento")
@RequiredArgsConstructor
public class SeguimientoQueryController {
    private final SeguimientoHandler seguimientosHandler;

    @GetMapping()
    public ResponseEntity<ApiResponse> getSeguimiento(@RequestParam("idTicket") Integer id) {
        return ResponseEntity.ok(ApiResponse.builder()
                .data(seguimientosHandler.execute(id))
                .code(HttpStatus.OK.value()).build());
    }
}
