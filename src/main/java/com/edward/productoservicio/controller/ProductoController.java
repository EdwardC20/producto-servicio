package com.edward.productoservicio.controller;

import com.edward.productoservicio.dto.ProductoRequest;
import com.edward.productoservicio.dto.ProductoResponse;
import com.edward.productoservicio.service.ProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crearProducto(@RequestBody ProductoRequest producto){
        productoService.crearProductoService(producto);
    }

    // @GetMapping("")
    // @ResponseStatus(HttpStatus.OK)
    // public List<ProductoResponse> obtenerproductos(){
    //     productoService.
    // }
}
