package com.b0roka.SRTLN_sk8.servicio;

import com.b0roka.SRTLN_sk8.modelo.Cliente;
import com.b0roka.SRTLN_sk8.repositorio.ClienteRepositorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(ClienteServicio.class); //logger

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //consultar todos los clientes
    public List<Cliente> getAllClientes(){
        logger.info("Obteniendo los clientes registrados..");
        List<Cliente> clientes = clienteRepositorio.findAll();
        logger.debug("Cantidad de clientes obtenidos: {}", clientes.size());
        logger.info("Consulta de clientes completada. ");
        return clientes;
    }

    //consultar cliente por ID
    public Cliente getClienteById(Long id){
        logger.info("Buscando cliente con ID: {}", id);
        Optional<Cliente> cliente = clienteRepositorio.findById(id);
        if (cliente.isPresent()) {
            logger.info("Cliente encontrado: {}", cliente.get().getNombre());
            return cliente.get();
        } else {
            logger.warn("No se encontró ningún cliente con ID: {}", id);
            return null;
        }
    }

    //crear cliente
    public Cliente createCliente(Cliente cliente){
        logger.info("Creando nuevo cliente con correo: {}", cliente.getCorreoElectronico());
        cliente.setContraseña(passwordEncoder.encode(cliente.getContraseña()));
        cliente.setFechaRegistro(LocalDate.now());
        Cliente nuevoCliente = clienteRepositorio.save(cliente);
        logger.info("Cliente creado exitosamente con ID: {}", nuevoCliente.getId());
        return nuevoCliente;
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

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Optional<Cliente> cliente = clienteRepositorio.findByCorreoElectronico(correo);
        if (cliente.isPresent()) {
            Cliente userObj = cliente.get();
            logger.info("Cliente encontrado: {}", userObj.getCorreoElectronico());
            return User.builder()
                    .username(userObj.getCorreoElectronico())
                    .password(userObj.getContraseña())
                    .build();
        }else {
            logger.warn("No se encontró cliente con correo: {}", correo);
            throw new UsernameNotFoundException(correo);
        }

    }

    //Agarra el numero de usuario registrados en la pagina web
    public long getNumeroDeUsuarios(){
        logger.info("Consultando el número total de usuarios registrados.");
        long count = clienteRepositorio.count();
        logger.info("Número total de usuarios: {}", count);
        return count;
    }
}
