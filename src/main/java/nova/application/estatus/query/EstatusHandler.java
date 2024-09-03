package nova.application.estatus.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.estatus.mapper.EstatusDtoMapper;
import nova.domain.estatus.model.dto.EstatusDto;
import nova.domain.estatus.port.EstatusDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EstatusHandler implements Handler<List<EstatusDto>, Void> {
    private final EstatusDao estatusDao;
    private final EstatusDtoMapper responseMapper;

    @Override
    public List<EstatusDto> execute(Void cmd) {
        return responseMapper.toResponseList(estatusDao.getAllEstatus());
    }
}
