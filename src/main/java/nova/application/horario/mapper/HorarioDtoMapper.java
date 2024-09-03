package nova.application.horario.mapper;

import nova.domain.horario.model.dto.*;
import nova.domain.horario.model.entity.Horario;
import nova.domain.horario.model.entity.Operatividad;
import nova.domain.unidad.model.dto.UnidadDto;
import nova.domain.unidad.model.entity.Unidad;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HorarioDtoMapper {

    // Mapea Operatividad a OperatividadResponse
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Named("toOperatividadResponse")
    OperatividadDto toOperatividadResponse(Operatividad operatividad);

    // Mapea Horario a HorarioResponse
    @Mapping(target = "id", source = "id")
    @Mapping(target = "apertura", source = "apertura", dateFormat = "HH:mm:ss")
    @Mapping(target = "cierre", source = "cierre", dateFormat = "HH:mm:ss")
    @Named("toHorarioResponse")
    HorarioDto toHorarioResponse(Horario horario);

    // Mapea Unidad a UnidadResponse
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "clave", source = "clave")
    UnidadDto toUnidadResponse(Unidad unidad);

    // Mapea Horario a UnidadAsignacionResponse
    @Mapping(target = "unidad", source = "unidad")
    @Mapping(target = "horario", source = "horario", qualifiedByName = "toHorarioResponse")
    UnidadAsignacionDto toUnidadAsignacionResponse(Horario horario);

    // Mapea Operatividad a AsignacionesResponse
    @Mapping(target = "operatividad", source = "operatividad", qualifiedByName = "toOperatividadResponse")
    @Mapping(target = "horarios", source = "horarios")
    AsignacionesDto toResponse(Operatividad operatividad);

    // Mapea Horario a AsignacionResponse
    @Mapping(target = "horario", source = "horario", qualifiedByName = "toHorarioResponse")
    @Mapping(target = "operatividad", source = "operatividad", qualifiedByName = "toOperatividadResponse")
    AsignacionDto toAsignacicon(Horario horario);

    // Lista de AsignacionesResponse
    List<AsignacionesDto> toListResponse(List<Operatividad> horarios);
}
