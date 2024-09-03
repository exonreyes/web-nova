package nova.infrastructure.horario.rest.controller;

import lombok.RequiredArgsConstructor;
import nova.application.horario.query.HorarioUnidadHandler;
import nova.application.horario.query.HorariosHandler;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("horario")
@RequiredArgsConstructor
public class HorarioQueryController {
    private final HorariosHandler handler;
    private final HorarioUnidadHandler horarioByUnidadHandler;

    @GetMapping
    public ResponseEntity<ApiResponse> getAllHorarios() {
        return ResponseEntity.ok(ApiResponse.builder().data(handler.execute(null)).code(200).build());
    }

    @GetMapping("unidad")
    public ResponseEntity<ApiResponse> getHorario(@RequestParam("idUnidad") Integer id) {
        return ResponseEntity.ok(ApiResponse.builder().data(horarioByUnidadHandler.execute(id)).build());
    }

}
