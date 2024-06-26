package service;

import java.util.List;

public interface ICrud <T, ID> {

    List<T> findAll();

    T findById(ID id);

    T save(T t);

    void deleteById(ID id);
}
