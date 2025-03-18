<template>
    <div id="verClientes" class="bg-green-400 min-h-screen min-w-max flex items-center justify-center flex-col">
      <h1 class="mb-8">Lista de Clientes registrados</h1>
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
  </template>
  
  <script>
  export default {
    name: 'VerClientes',
    data() {
      return {
        clientes: [],
      };
    },
    created() {
      this.fetchClientes();
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
    },
  };
  </script>
  