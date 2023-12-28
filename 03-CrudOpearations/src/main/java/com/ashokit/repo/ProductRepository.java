package com.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Products;

@Repository
public interface ProductRepository  extends CrudRepository<Products, Integer>{

}
