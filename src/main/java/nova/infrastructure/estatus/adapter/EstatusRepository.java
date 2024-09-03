package nova.infrastructure.estatus.adapter;

import nova.infrastructure.estatus.adapter.entity.EstatusModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstatusRepository extends JpaRepository<EstatusModel, Integer> {
}