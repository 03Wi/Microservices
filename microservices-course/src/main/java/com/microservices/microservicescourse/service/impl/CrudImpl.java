package com.microservices.microservicescourse.service.impl;

import com.microservices.microservicescourse.repository.IGenericRepo;
import com.microservices.microservicescourse.service.ICrud;

import java.util.List;

public abstract class CrudImpl <T, ID> implements ICrud<T, ID> {

    public abstract IGenericRepo<T, ID> getRepo ();

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public void deleteById(ID id) {

    }
}
