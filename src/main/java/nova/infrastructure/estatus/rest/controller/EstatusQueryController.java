package nova.infrastructure.estatus.rest.controller;

import lombok.RequiredArgsConstructor;
import nova.application.estatus.query.EstatusHandler;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("estatus")
@RestController
@RequiredArgsConstructor
public class EstatusQueryController {
    private final EstatusHandler allEstatus;

    @GetMapping
    public ResponseEntity<ApiResponse> getAllEstatus() {
        return ResponseEntity.ok(ApiResponse.builder().data(allEstatus.execute(null)).build());
    }
}
