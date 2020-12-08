package org.sbru.springframework.repositories;

import org.sbru.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
