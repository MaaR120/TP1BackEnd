package com.utndesarrolloSw.TP1.infraestructura.repository;


import com.utndesarrolloSw.TP1.Infraestructura.repository.ClienteRepository;
import com.utndesarrolloSw.TP1.entidades.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ClienteRepositoryTest {
    @Autowired
    public ClienteRepository repository;

    @Test
    public void saveTest(){
        Cliente cliente= Cliente.builder()
                .id(null)
                .nombre(UUID.randomUUID().toString())
                .email(UUID.randomUUID().toString())
                .telefono(String.valueOf(new Random().nextLong()))
                .apellido(UUID.randomUUID().toString()).build();
        Cliente clienteresult=repository.save(cliente);
        assertTrue(Objects.nonNull(clienteresult.getId()));
        assertEquals(clienteresult.getNombre(),cliente.getNombre());
    }
    @Test
    public void findByIdTest(){
        Cliente cliente= Cliente.builder()
                .id(null)
                .nombre(UUID.randomUUID().toString())
                .email(UUID.randomUUID().toString())
                .telefono(String.valueOf(new Random().nextLong()))
                .apellido(UUID.randomUUID().toString()).build();
        Cliente clienteresult=repository.save(cliente);
        Optional<Cliente> clientebuscado=repository.findById(clienteresult.getId());
        assertTrue(clientebuscado.isPresent());
        assertEquals(clientebuscado.get().getNombre(),cliente.getNombre());
    }


}
