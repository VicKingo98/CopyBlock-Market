package com.copyblock.market.persistence;

import com.copyblock.market.persistence.crud.ProductoCrudRepository;
import com.copyblock.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
