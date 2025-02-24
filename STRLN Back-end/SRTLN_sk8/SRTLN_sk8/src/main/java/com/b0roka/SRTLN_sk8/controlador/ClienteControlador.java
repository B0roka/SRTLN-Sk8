package com.b0roka.SRTLN_sk8.controlador;


import com.b0roka.SRTLN_sk8.modelo.Cliente;
import com.b0roka.SRTLN_sk8.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteServicio.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteServicio.getClienteById(id);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteServicio.createCliente(cliente);
    }
}
