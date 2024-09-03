package nova.application.seguimiento.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.seguimiento.mapper.SeguimientoMapper;
import nova.domain.seguimiento.model.dto.SeguimientoDto;
import nova.domain.seguimiento.port.SeguimientoDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SeguimientoHandler implements Handler<List<SeguimientoDto>, Integer> {
    private final SeguimientoDao dao;
    private final SeguimientoMapper mapper;

    @Override
    public List<SeguimientoDto> execute(Integer params) {
        return dao.getSeguimientoByTicketId(params).stream().map(mapper::toDto).toList();
    }
}