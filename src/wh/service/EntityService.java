package wh.service;

import java.util.List;

public interface EntityService<T> {
    T getById(Long id);
    List<T> findAll();
    void save(T obj);
}
