package nova.application.unidad.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.unidad.mapper.UnidadDtoMapper;
import nova.domain.unidad.model.dto.UnidadDto;
import nova.domain.unidad.port.UnidadDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UnidadesHandler implements Handler<List<UnidadDto>, Void> {
    private final UnidadDao dao;
    private final UnidadDtoMapper mapper;

    @Override
    public List<UnidadDto> execute(Void cmd) {
        return mapper.toResponseList(dao.getAllUnidades());
    }
}
