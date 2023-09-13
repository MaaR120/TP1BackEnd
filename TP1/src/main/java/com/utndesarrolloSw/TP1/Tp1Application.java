package com.utndesarrolloSw.TP1;

import com.utndesarrolloSw.TP1.Infraestructura.repository.ClienteRepository;
import com.utndesarrolloSw.TP1.Infraestructura.repository.RubroRepository;
import com.utndesarrolloSw.TP1.entidades.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.UUID;


@AllArgsConstructor
@SpringBootApplication
public class Tp1Application {
	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	RubroRepository rubroRepository;

	public static void main(String[] args) {

		SpringApplication.run(Tp1Application.class, args);



	}

	@Bean
	public CommandLineRunner init(){
		return args -> {
			System.out.println("------------------------Estoy Funcionando------------------------");


			Cliente cliente=new Cliente();
			cliente.setNombre("Pedro");
			cliente.setApellido("Ramirez");
			cliente.setEmail("pedroramirez@gmail.com");
			cliente.setTelefono("261869584");


			Domicilio domicilio=new Domicilio();
			domicilio.setCalle("Olascoaga");
			domicilio.setNumero("232");
			domicilio.setLocalidad("Godoy Cruz");


			Pedido pedido1=new Pedido();
			pedido1.setEstado("En Preparacion");
			pedido1.setTipoEnvio("Aero");
			pedido1.setTotal(23322);


			Producto producto1=new Producto();
			producto1.setTiempoEstimadoCocina(30);
			producto1.setReceta("1. hervir 2. Condimentar 3. Servir");
			producto1.setDenominacion("Huevo Hervido");
			producto1.setTipo("Huevo");
			producto1.setPrecioCompra(80);
			producto1.setPrecioVenta(100);
			producto1.setStockActual(300);
			producto1.setStockMinimo(100);
			producto1.setUnidadMedida("ctdad");


			Factura factura1=new Factura();
			factura1.setTotal(2323);
			factura1.setDescuento(0);
			factura1.setNumero(2735);
			factura1.setFormaPago("Mercado Pago");


			DetallePedido detallePedido = new DetallePedido();
			detallePedido.setCantidad(3);
			detallePedido.setSubTotal(80);



			Rubro rubro = new Rubro();
			rubro.setDenominacion("Carnes");



			//Asociaciones
			rubro.addProducto(producto1);

			pedido1.setFactura(factura1);
			pedido1.addDetallePedido(detallePedido);

			detallePedido.setProducto(producto1);

			cliente.addPedido(pedido1);
			cliente.addDomicilio(domicilio);

			clienteRepository.save(cliente);
			rubroRepository.save(rubro);

		};
	}




}
