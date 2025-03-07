package com.b0roka.SRTLN_sk8.pruebas;

import com.b0roka.SRTLN_sk8.modelo.Cliente;
import com.b0roka.SRTLN_sk8.repositorio.ClienteRepositorio;
import com.b0roka.SRTLN_sk8.servicio.ClienteServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PruebaIntegracionCliente {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private ClienteServicio clienteServicio;

    @BeforeEach
    public void setUp() {
        clienteRepositorio.deleteAll();
    }

    @Test
    public void agregarClienteTest() throws Exception {

        //registro de los datos del cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellidos("Perez");
        cliente.setCorreoElectronico("juan@example.com");
        cliente.setContraseña("password");
        cliente.setDireccion("calle prueba 123");
        cliente.setTelefono("555-555-555");
        cliente.setFechaRegistro(LocalDate.now());

        mockMvc.perform(post("/clientes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"nombre\":\"Juan\",\"apellidos\":\"Perez\",\"correoElectronico\":\"juan@example.com\",\"contraseña\":\"password\",\"direccion\":\"Calle Falsa 123\",\"telefono\":\"555-555-5555\",\"fechaRegistro\":\"" + LocalDate.now() + "\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nombre").value("Juan"))
                .andExpect(jsonPath("$.correoElectronico").value("juan@example.com"));

    }

    @Test
    public void consultarClienteTest() throws Exception {
        mockMvc.perform(get("/clientes/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nombre").value("Juan"))
                .andExpect(jsonPath("$.apellidos").value("Perez"))
                .andExpect(jsonPath("$.correoElectronico").value("juan@example.com"));
    }
}
