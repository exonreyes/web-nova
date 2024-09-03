package nova.domain.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Pagination {
    private long currentPage;
    private long totalPages;
    private long items;
    private long totalItems;

}
