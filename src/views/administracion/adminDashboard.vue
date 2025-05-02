<script setup>
  import logo from '@/assets/img/logo-srtln.png'
import { errorMessages } from 'vue/compiler-sfc';
</script>

<template>

    <VaNavbar
        color="#AE83EB"
        class="mb-3"
      >
        <template #left>
          <VaNavbarItem class="logo">
            <img v-bind:src="logo" alt="Logo SRTLN" class="h-18 w-auto transition-transform duration-300 hover:scale-110">
          </VaNavbarItem>
        </template>
        <template #right>
          <VaNavbarItem class="hidden sm:block">
            <RouterLink to="/"><VaButton color="warning"> Salir </VaButton></RouterLink>
          </VaNavbarItem>
        </template>
      </VaNavbar>

    <div class="">
      <!-- Contenido principal -->
      <main class="flex-1 p-6 bg-gray-100 overflow-auto text-center">
        <h1 class="text-2xl font-bold mb-4">Admin Dashboard</h1>
        <p>Aquí puedes administrar los datos del sistema.</p>

        <div class="grid grid-cols-2 grid-rows-1 gap-2">
          <div id="verClientes" class="bg-green-300 min-h-screen min-w-max flex items-center justify-center flex-col">
            <h2 class="mb-8">Lista de Clientes registrados</h2>
            <div class="bg-white p-8 rounded-lg shadow-md w-full max-w-sm">
              <ul>
                <li v-for="cliente in clientes" :key="cliente.id" class="mb-2">
                  <strong>Nombre:</strong> {{ cliente.nombre }}<br>
                  <strong>Apellidos:</strong> {{ cliente.apellidos }}<br>
                  <strong>Correo electronico:</strong> {{ cliente.correoElectronico }}
                </li>
              </ul>
            </div>
          </div>
          <div id="resultados" class="bg-green-300 min-h-screen min-w-max flex items-center justify-center flex-col">
            <h1>Panel de Administración</h1>
            <p>Número de usuarios registrados: {{ numeroDeUsuarios }}</p>
          </div>
        </div>
      </main>
    </div>
  </template>


<script>
  export default {
    name: 'VerClientes',
    data() {
      return {
        clientes: [], //lista de clientes
        numeroDeUsuarios: 0, //numero de usuarios registrados
        loading: false, //indicador de pruebas
        testResults: null, //Resultados de las pruebas
        error: null, //manejo de errores
      };
    },
    created() {
      this.fetchClientes();
      this.fetchNumeroDeUsuarios();
    },
    methods: {
      async fetchClientes() {
        try {
          let response = await fetch('http://localhost:8080/clientes', {
            method: 'GET',
            headers: {
              'Content-Type': 'application/json',
            },
          });
  
          if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
          }
  
          this.clientes = await response.json();
        } catch (error) {
          console.error('Error:', error);
        }
      },
        async fetchNumeroDeUsuarios() {
        try {
          let response = await fetch('http://localhost:8080/clientes/count', {
            method: 'GET',
            headers: {
              'Content-Type': 'application/json',
            },
          });

          if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
          }

          this.numeroDeUsuarios = await response.json(); // Asigna el valor al estado
        } catch (error) {
          console.error('Error al obtener el número de usuarios registrados:', error);
        }
      },
    },
  };

  
  </script>