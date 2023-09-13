package com.utndesarrolloSw.TP1.Infraestructura.repository;

import com.utndesarrolloSw.TP1.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
