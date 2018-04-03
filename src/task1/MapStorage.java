package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by sergey.kliepikov on 4/2/18.
 */
public class MapStorage<T extends Entity<ID>, ID> implements Storage<T, ID> {

    Map<ID, T> hMap = new HashMap<>();


    @Override
    public Optional<T> findById(ID id) {
        return Optional.of(hMap.get(id));

    }

    @Override
    public void save(T entity) {
        hMap.put(entity.getID(), entity);

    }

    @Override
    public void deleteById(ID id) {
        hMap.remove(id, hMap.get(id));
    }
}
