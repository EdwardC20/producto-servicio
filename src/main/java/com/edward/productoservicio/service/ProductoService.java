package com.edward.productoservicio.service;

import com.edward.productoservicio.dto.ProductoRequest;
import com.edward.productoservicio.dto.ProductoResponse;
import com.edward.productoservicio.model.Producto;
import com.edward.productoservicio.repository.ProductoRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    public void crearProductoService(ProductoRequest producto){
        Producto nuevo = Producto.builder()
            .nombre(producto.getNombre())
            .descripcion(producto.getDescripcion())
            .precio(producto.getPrecio())
            .build();
        repository.save(nuevo);
        log.info("el producto {} fue guardado en la base de datos",producto.getNombre());
    }

    // public List<ProductoResponse> obtenerproductos(){
    //      List<Producto> todos = repository.findAll();
    //      todos.stream().map(producto -> mapToProductoResponse());
    // }

    // private ProductoResponse mapToProductoResponse() {
    //     return ProductoResponse.builder().;
    // }
}
