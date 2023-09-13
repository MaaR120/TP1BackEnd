package com.utndesarrolloSw.TP1.Infraestructura.repository;

import com.utndesarrolloSw.TP1.entidades.Domicilio;
import com.utndesarrolloSw.TP1.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RubroRepository extends JpaRepository<Rubro,Long> {
}
