package nova.domain.seguimiento.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import nova.domain.seguimiento.model.dto.command.SeguimientoCreateCommand;
import nova.domain.seguimiento.port.SeguimientoRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SeguimientoCreateService {
    private final SeguimientoRepository repository;
    private final SeguimientoFactory factory;
    private final SeguimientoFactory seguimientoFactory;

    public boolean add(SeguimientoCreateCommand cmd) {
        var data = seguimientoFactory.create(cmd);
        return repository.registrar(data);
    }
}
