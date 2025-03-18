package com.b0roka.SRTLN_sk8.repositorio;

import com.b0roka.SRTLN_sk8.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCorreoElectronico(String correoElectronico);
}
