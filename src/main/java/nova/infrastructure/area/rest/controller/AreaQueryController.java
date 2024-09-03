package nova.infrastructure.area.rest.controller;

import lombok.RequiredArgsConstructor;
import nova.application.area.handler.query.AreaReportesHandler;
import nova.application.area.handler.query.AreasHandler;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("area")
@RequiredArgsConstructor
public class AreaQueryController {
    private final AreasHandler allAreas;
    private final AreaReportesHandler areaAllWithReportes;

    @GetMapping
    public ResponseEntity<ApiResponse> getAllAreas() {
        return ResponseEntity.ok(ApiResponse.builder().data(allAreas.execute(null)).message("Areas registradas").build());
    }

    @GetMapping("reportes")
    public ResponseEntity<ApiResponse> getAllAreasWithReportes() {
        return ResponseEntity.ok(ApiResponse.builder().data(areaAllWithReportes.execute(null)).build());
    }
}
