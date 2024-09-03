package nova.application.unidad.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.unidad.mapper.UnidadDtoMapper;
import nova.domain.contacto.direccion.model.dto.TelefonoDto;
import nova.domain.contacto.exception.TelefonoNotFoundException;
import nova.domain.unidad.port.UnidadDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class TelefonoByIdHandler implements Handler<TelefonoDto, Integer> {
    private final UnidadDao dao;
    private final UnidadDtoMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public TelefonoDto execute(Integer param) {
        return dao.getTelefono(param)
                .map(unidad -> mapper.toTelefonoResponse(unidad.getTelefono()))
                .orElseThrow(() -> new TelefonoNotFoundException("Sin resultados"));
    }
}
