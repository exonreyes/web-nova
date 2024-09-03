package nova.infrastructure.unidad.rest.controller;

import lombok.RequiredArgsConstructor;
import nova.application.unidad.query.ContactoByIdHandler;
import nova.application.unidad.query.DireccionByIdHandler;
import nova.application.unidad.query.TelefonoByIdHandler;
import nova.application.unidad.query.UnidadesHandler;
import nova.infrastructure.web.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("unidad")
public class UnidadQueryController {
    private final UnidadesHandler unidadesHandler;
    private final TelefonoByIdHandler telefonoHandler;
    private final DireccionByIdHandler direccionHandler;
    private final ContactoByIdHandler contactoHandler;

    @GetMapping
    public ResponseEntity<ApiResponse> getAllUnidades() {
        return ResponseEntity.ok(ApiResponse.builder().data(unidadesHandler.execute(null)).build());
    }

    @GetMapping("telefono")
    public ResponseEntity<ApiResponse> getTelefono(@RequestParam("idUnidad") Integer idUnidad) {
        return ResponseEntity.ok(ApiResponse.builder().data(telefonoHandler.execute(idUnidad)).build());
    }

    @GetMapping("direccion")
    public ResponseEntity<ApiResponse> getDireccion(@RequestParam("idUnidad") Integer idUnidad) {
        return ResponseEntity.ok(ApiResponse.builder().data(direccionHandler.execute(idUnidad)).build());
    }

    @GetMapping("contacto")
    public ResponseEntity<ApiResponse> getContacto(@RequestParam("idUnidad") Integer id) {
        return ResponseEntity.ok(ApiResponse.builder().data(contactoHandler.execute(id)).build());
    }

}
