package com.utndesarrolloSw.TP1.Infraestructura.repository;

import com.utndesarrolloSw.TP1.entidades.Domicilio;
import com.utndesarrolloSw.TP1.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
