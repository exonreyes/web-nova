package nova.domain.base;

import lombok.Getter;

import java.util.List;

@Getter
public class DataPagination<T> extends Pagination {
    private final List<T> data;
    private final int code;

    public DataPagination(long currentPage, long totalPages, long items, long totalItems, List<T> data, int code) {
        super(currentPage, totalPages, items, totalItems);
        this.data = data;
        this.code = code;
    }
}