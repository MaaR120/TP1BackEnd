package com.utndesarrolloSw.TP1.Infraestructura.repository;

import com.utndesarrolloSw.TP1.entidades.Domicilio;
import com.utndesarrolloSw.TP1.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
