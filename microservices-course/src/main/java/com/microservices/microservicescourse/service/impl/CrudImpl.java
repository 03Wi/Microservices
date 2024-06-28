package com.microservices.microservicescourse.service.impl;

import com.microservices.microservicescourse.repository.IGenericRepo;
import com.microservices.microservicescourse.service.ICrud;

import java.util.List;

public abstract class CrudImpl <T, ID> implements ICrud<T, ID> {

    public abstract IGenericRepo<T, ID> getRepo ();

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow();
    }

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public void deleteById(ID id) {

    }
}
