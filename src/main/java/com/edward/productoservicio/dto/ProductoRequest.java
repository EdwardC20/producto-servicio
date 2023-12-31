package com.edward.productoservicio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class ProductoRequest {
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
}
