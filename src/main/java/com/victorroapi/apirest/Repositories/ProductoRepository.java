package com.victorroapi.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorroapi.apirest.Entities.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Long>{

}
