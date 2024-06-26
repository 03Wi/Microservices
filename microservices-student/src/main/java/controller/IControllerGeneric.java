package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface IControllerGeneric <T, ID>{

    @GetMapping
    ResponseEntity<T> findAll();

    @GetMapping
    ResponseEntity<T> findById(ID id);

    @PostMapping
    ResponseEntity<T> save(T t);

    @DeleteMapping
    ResponseEntity<T> deleteById(ID id);


}
