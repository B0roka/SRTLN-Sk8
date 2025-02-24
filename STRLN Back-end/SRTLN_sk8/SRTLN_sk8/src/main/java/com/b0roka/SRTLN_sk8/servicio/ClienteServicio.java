package com.b0roka.SRTLN_sk8.servicio;

import com.b0roka.SRTLN_sk8.modelo.Cliente;
import com.b0roka.SRTLN_sk8.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    //consultar todos los clientes
    public List<Cliente> getAllClientes(){
        return clienteRepositorio.findAll();
    }

    //consultar cliente por ID
    public Cliente getClienteById(Long id){
        Optional<Cliente> cliente = clienteRepositorio.findById(id);
        return cliente.orElse(null);
    }

    //crear cliente
    public Cliente createCliente(Cliente cliente){
        return clienteRepositorio.save(cliente);
    }

    //Actualizar cliente
    public Cliente updateCliente(Long id, Cliente clienteDetails) {
        Optional<Cliente> cliente = clienteRepositorio.findById(id);
        if (cliente.isPresent()) {
            Cliente existingCliente = cliente.get();
            existingCliente.setNombre(clienteDetails.getNombre());
            existingCliente.setCorreoElectronico(clienteDetails.getCorreoElectronico());
            return clienteRepositorio.save(existingCliente);
        }
        return null;
    }

    //eliminar cliente
    public void deleteCliente(Long id){
        clienteRepositorio.deleteById(id);
    }
}
