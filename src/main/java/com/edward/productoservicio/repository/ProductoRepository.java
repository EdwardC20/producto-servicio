package com.edward.productoservicio.repository;

import com.edward.productoservicio.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {
}
