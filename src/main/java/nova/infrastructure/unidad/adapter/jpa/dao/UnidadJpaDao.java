package nova.infrastructure.unidad.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import nova.domain.unidad.model.entity.Unidad;
import nova.domain.unidad.port.UnidadDao;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadContactoQuery;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadDireccionQuery;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadQuery;
import nova.infrastructure.unidad.adapter.entity.projection.UnidadTelefonoQuery;
import nova.infrastructure.unidad.adapter.jpa.UnidadRepository;
import nova.infrastructure.unidad.adapter.mapper.UnidadModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UnidadJpaDao implements UnidadDao {
    private final UnidadRepository repository;
    private final UnidadModelMapper mapper;

    @Override
    public List<Unidad> getAllUnidades() {
        return mapper.toInfoDto(repository.findBy(UnidadQuery.class));
    }

    @Override
    public Optional<Unidad> getDireccion(Integer idUnidad) {
        return repository.findById(idUnidad, UnidadDireccionQuery.class).map(mapper::toDto);
    }

    @Override
    public Optional<Unidad> getTelefono(Integer idUnidad) {
        return repository.findById(idUnidad, UnidadTelefonoQuery.class).map(mapper::toDto);
    }

    @Override
    public Optional<Unidad> getContacto(Integer idUnidad) {
        return repository.findById(idUnidad, UnidadContactoQuery.class).map(mapper::toDto);
    }

}
