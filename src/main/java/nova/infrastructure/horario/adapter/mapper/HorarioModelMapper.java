package nova.infrastructure.horario.adapter.mapper;

import nova.domain.horario.model.entity.Horario;
import nova.infrastructure.horario.adapter.entity.HorarioModel;
import nova.infrastructure.horario.adapter.entity.projection.HorarioQuery;
import nova.infrastructure.horario.adapter.entity.projection.HorarioUnidadQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HorarioModelMapper {
    @Mapping(target = "operatividad.id", source = "operatividadId")
    @Mapping(target = "operatividad.nombre", source = "operatividadNombre")
    @Mapping(target = "unidad.id", source = "unidadId")
    @Mapping(target = "unidad.clave", source = "unidadClave")
    @Mapping(target = "unidad.nombre", source = "unidadNombre")
    Horario queryToDomain(HorarioQuery query);

    @Mapping(target = "operatividad.id", source = "operatividadId")
    @Mapping(target = "operatividad.nombre", source = "operatividadNombre")
    Horario queryToDomain(HorarioUnidadQuery query);

    List<Horario> toHorarioUnidadList(List<HorarioUnidadQuery> queryList);

    List<Horario> toListQuery(List<HorarioQuery> queryList);

    Horario toDto(HorarioModel horarioModel);

    List<Horario> toDto(List<HorarioQuery> horarioModel);
}