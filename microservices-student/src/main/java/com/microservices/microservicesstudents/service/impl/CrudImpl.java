package com.microservices.microservicesstudents.service.impl;

import com.microservices.microservicesstudents.repository.IGenericRepo;
import com.microservices.microservicesstudents.service.ICrud;

import java.util.List;

public abstract class CrudImpl <T, ID> implements ICrud<T, ID> {

    public abstract IGenericRepo<T, ID> getRepo();

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().getReferenceById(id);
    }

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public void deleteById(ID id) {
        getRepo().deleteById(id);
    }
}
