package com.softlond.store.services.contracts;

import com.softlond.store.entities.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICategoryService {

    public ResponseEntity<List<Category>> findAll();

    public ResponseEntity<List<Category>> create(Category category);

    public ResponseEntity<List<Category>> update(Category category);

    public ResponseEntity<Boolean> delete(Long id);

}
