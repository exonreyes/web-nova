package nova.infrastructure.unidad.adapter.jpa;

import nova.infrastructure.unidad.adapter.entity.UnidadModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UnidadRepository extends JpaRepository<UnidadModel, Integer> {
    <T> List<T> findBy(Class<T> type);

    <T> Optional<T> findById(Integer integer, Class<T> type);

}