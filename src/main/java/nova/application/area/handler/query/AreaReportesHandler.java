package nova.application.area.handler.query;

import lombok.RequiredArgsConstructor;
import nova.application.area.mapper.AreaDtoMapper;
import nova.application.base.Handler;
import nova.domain.area.model.dto.AreaDto;
import nova.domain.area.port.AreaDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AreaReportesHandler implements Handler<List<AreaDto>, Void> {
    private final AreaDao dao;
    private final AreaDtoMapper mapper;

    @Override
    public List<AreaDto> execute(Void cmd) {
        return mapper.toResponseList(dao.getAllAreasWithReportes());
    }
}
