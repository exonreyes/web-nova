package nova.infrastructure.web;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
@Builder
public class PagedResponse<T> {
    private List<T> data;
    private Map pagination;
}