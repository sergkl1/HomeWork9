package task1;

import java.util.Optional;

/**
 * Created by sergey.kliepikov on 4/2/18.
 */
public interface Storage<T extends Entity<ID>, ID> {

    Optional<T> findById(ID id);
    void save(T entity);
    void deleteById(ID id);
}
