package nova.infrastructure.seguimiento.rest.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import nova.application.seguimiento.command.SeguimientoSaveHandler;
import nova.infrastructure.seguimiento.rest.command.SeguimientoCreateRequest;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seguimiento")
@RequiredArgsConstructor
public class SeguimientoCommandController {
    private final SeguimientoSaveHandler saveHandler;

    @PostMapping()
    public ResponseEntity<ApiResponse> saveSeguimiento(@Valid @RequestBody SeguimientoCreateRequest params) {
        return ResponseEntity.ok(ApiResponse.builder().data(saveHandler.execute(params)).message("Seguimiento registrado").code(HttpStatus.OK.value()).build());
    }
}
