package com.utndesarrolloSw.TP1.Infraestructura.repository;

import com.utndesarrolloSw.TP1.entidades.Domicilio;
import com.utndesarrolloSw.TP1.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
