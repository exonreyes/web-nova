package nova.application.area.mapper;

import nova.domain.area.model.dto.AreaDto;
import nova.domain.area.model.entity.Area;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AreaDtoMapper {
    AreaDto toResponse(Area area);

    List<AreaDto> toResponseList(List<Area> areas);
}