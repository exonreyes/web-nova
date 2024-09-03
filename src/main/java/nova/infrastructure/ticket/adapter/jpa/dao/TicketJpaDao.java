package nova.infrastructure.ticket.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import nova.application.ticket.query.FilterTicketCommand;
import nova.domain.base.Pagination;
import nova.domain.ticket.model.entity.Ticket;
import nova.domain.ticket.port.TicketDao;
import nova.infrastructure.ticket.adapter.entity.projection.TicketQuery;
import nova.infrastructure.ticket.adapter.jpa.TicketAdapterRepository;
import nova.infrastructure.ticket.adapter.mapper.TicketModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TicketJpaDao implements TicketDao {
    private final TicketAdapterRepository repository;
    private final TicketModelMapper mapper;

    @Override
    public Map<String, Object> getTicketsByFiltro(FilterTicketCommand cmd, String orderBy) {
        PageRequest pageRequest = PageRequest.of(cmd.getPagina(), cmd.getFilas(), Sort.by(orderBy).descending());
        Page<TicketQuery> pageResponse = repository.obtenerTickets(
                cmd.getIdUnidad(),
                cmd.getIdArea(),
                cmd.getIdEstatus(),
                cmd.getDesde(),
                cmd.getHasta(),
                cmd.getFolio(),
                pageRequest
        );
        List<Ticket> tickets = mapper.listQueryToDomain(pageResponse.getContent());
        Pagination pagination = Pagination.builder()
                .items(pageResponse.getNumberOfElements())
                .totalPages(pageResponse.getTotalPages())
                .totalItems(pageResponse.getTotalElements())
                .build();
        return Map.of("pagination", pagination, "data", tickets);
    }

    @Override
    public Optional<Ticket> getDetallesByFolio(String folio) {
        return repository.obtenerDetalles(folio).map(mapper::toDomain);
    }

    @Override
    public Optional<Ticket> getById(Integer id) {
        return repository.findById(id, TicketQuery.class).map(mapper::toDomain);
    }

    @Override
    public Boolean existsByFolio(String folio) {
        return repository.existsByFolio(folio);
    }

    @Override
    public Optional<Ticket> getSeguimientoByFolio(String folio) {
        return Optional.empty();
    }
}
