package nova.application.unidad.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.unidad.mapper.UnidadDtoMapper;
import nova.domain.contacto.exception.DireccionNotFoundException;
import nova.domain.unidad.model.dto.UnidadContactoDto;
import nova.domain.unidad.port.UnidadDao;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContactoByIdHandler implements Handler<UnidadContactoDto, Integer> {
    private final UnidadDtoMapper mapper;
    private final UnidadDao dao;

    @Override
    public UnidadContactoDto execute(Integer idUnidad) {
        return dao.getContacto(idUnidad).map(mapper::toContactoResponse).orElseThrow(() -> new DireccionNotFoundException("Sin resultado"));
    }
}
