import java.util.List;

public interface InterfaceBanco<T> {
    void save(T entity);
    void delete(T entity);
    void update(T entity);
    List<T> findAll();
}