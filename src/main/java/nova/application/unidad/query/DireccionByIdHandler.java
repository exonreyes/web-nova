package nova.application.unidad.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.unidad.mapper.UnidadDtoMapper;
import nova.domain.contacto.direccion.model.dto.DireccionDto;
import nova.domain.contacto.exception.DireccionNotFoundException;
import nova.domain.unidad.port.UnidadDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@RequiredArgsConstructor
public class DireccionByIdHandler implements Handler<DireccionDto, Integer> {
    private final UnidadDtoMapper mapper;
    private final UnidadDao dao;

    @Override
    public DireccionDto execute(Integer idUnidad) {
        return dao.getDireccion(idUnidad).map(unidad -> mapper.toDireccionResponse(unidad.getDireccion())).orElseThrow(() -> new DireccionNotFoundException("Sin resultado"));
    }
}
