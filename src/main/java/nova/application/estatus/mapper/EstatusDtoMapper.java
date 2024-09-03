package nova.application.estatus.mapper;

import nova.domain.estatus.model.dto.EstatusDto;
import nova.domain.estatus.model.entity.Estatus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EstatusDtoMapper {
    EstatusDto toResponse(Estatus estatus);

    List<EstatusDto> toResponseList(List<Estatus> data);
}