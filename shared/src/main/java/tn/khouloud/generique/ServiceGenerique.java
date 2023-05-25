package tn.khouloud.generique;

import java.util.List;
import java.util.Map;

public interface ServiceGenerique<T, ID>{
    T add(T entity);
    List<T> getAll();
    T getOne(ID id);
    T update(ID id, Map<Object, Object> fields);
    void delete(ID id);

}
