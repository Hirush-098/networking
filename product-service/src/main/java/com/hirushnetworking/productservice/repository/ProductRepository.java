package com.hirushnetworking.productservice.repository;

import com.hirushnetworking.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
