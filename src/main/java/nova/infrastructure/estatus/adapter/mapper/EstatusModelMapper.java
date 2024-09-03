package nova.infrastructure.estatus.adapter.mapper;

import nova.domain.estatus.model.entity.Estatus;
import nova.infrastructure.estatus.adapter.entity.EstatusModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EstatusModelMapper {
    Estatus toDto(EstatusModel estatusModel);

    List<Estatus> toDto(List<EstatusModel> estatusModel);
}