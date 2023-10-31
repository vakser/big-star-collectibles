package com.example.collectibles.dao;

import com.example.collectibles.beans.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Query("select p from Product p where p.name like %:searchString%")
    List<Product> searchByName(@Param("searchString") String keyword);
}
