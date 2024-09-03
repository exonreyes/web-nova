package nova.application.horario.query;

import lombok.RequiredArgsConstructor;
import nova.application.base.Handler;
import nova.application.horario.mapper.HorarioDtoMapper;
import nova.domain.horario.model.dto.AsignacionesDto;
import nova.domain.horario.port.in.HorarioDao;
import nova.domain.horario.port.out.HorarioGroupService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HorariosHandler implements Handler<List<AsignacionesDto>, Void> {
    private final HorarioDao dao;
    private final HorarioDtoMapper mapper;
    private final HorarioGroupService groupService;

    @Override
    public List<AsignacionesDto> execute(Void cmd) {
        return mapper.toListResponse(groupService.groupByOperatividad(dao.getAllOperatividad()));
    }
}
