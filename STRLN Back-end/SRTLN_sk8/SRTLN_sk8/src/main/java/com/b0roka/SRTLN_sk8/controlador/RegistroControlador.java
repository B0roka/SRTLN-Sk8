package com.b0roka.SRTLN_sk8.controlador;

import com.b0roka.SRTLN_sk8.modelo.Cliente;
import com.b0roka.SRTLN_sk8.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/req")
public class RegistroControlador {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/signup", consumes = "application/json")
    public Cliente createCliente(@RequestBody Cliente cliente){
        //codifica la contraseña
        cliente.setContraseña(passwordEncoder.encode(cliente.getContraseña()));
        //Establecer fecha de registro
        cliente.setFechaRegistro(LocalDate.now());
        //guarda el cliente en la db
        return clienteRepositorio.save(cliente);
    }
}
