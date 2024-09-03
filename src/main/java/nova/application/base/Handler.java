package nova.application.base;

public interface Handler<T, K> {
    T execute(K params);
}
