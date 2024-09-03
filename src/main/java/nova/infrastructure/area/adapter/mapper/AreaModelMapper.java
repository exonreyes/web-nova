package nova.infrastructure.area.adapter.mapper;

import nova.domain.area.model.entity.Area;
import nova.infrastructure.area.adapter.entity.AreaModel;
import nova.infrastructure.area.adapter.entity.projection.AreaQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AreaModelMapper {
    Area toDto(AreaModel areaModel);

    List<Area> toDtoInfo(List<AreaQuery> info);

    List<Area> toDto(List<AreaModel> areaModel);
}