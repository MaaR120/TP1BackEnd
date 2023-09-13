package com.utndesarrolloSw.TP1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Pedido> pedidoList=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Domicilio> domicilioList=new ArrayList<>();

    public void addDomicilio(Domicilio domi){
        this.domicilioList.add(domi);
    }
    public void addPedido(Pedido pedido){
        this.pedidoList.add(pedido);
    }
}
