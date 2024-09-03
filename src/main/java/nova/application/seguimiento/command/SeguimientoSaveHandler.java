package nova.application.seguimiento.command;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.domain.seguimiento.model.dto.command.SeguimientoCreateCommand;
import nova.domain.seguimiento.service.SeguimientoCreateService;
import nova.infrastructure.seguimiento.rest.command.SeguimientoCreateRequest;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SeguimientoSaveHandler implements Handler<Boolean, SeguimientoCreateRequest> {
    private final SeguimientoCreateService service;

    @Override
    public Boolean execute(SeguimientoCreateRequest params) {
        var command = new SeguimientoCreateCommand(params.getAgente(), params.getIdEstatus(), params.getDescripcion(), params.getIdTicket());
        return service.add(command);
    }
}
