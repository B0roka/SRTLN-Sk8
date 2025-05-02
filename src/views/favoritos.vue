<template>
    <div class="p-6 text-center">
      <h2 class="text-2xl font-bold mb-4">Mis Favoritos</h2>
      <div v-if="favoritosStore.favoritos.length">
        <!-- Iterar sobre los productos favoritos -->
        <ul>
          <li
            v-for="producto in favoritosStore.favoritos"
            :key="producto.id"
            class="border rounded-md p-4 mb-2 flex justify-between items-center"
          >
            <div class="flex items-center space-x-4">
              <img :src="producto.img" alt="imagen del producto" class="w-16 h-16 object-cover rounded-md" />
            </div>
            <div>
              <h3 class="text-lg font-semibold">{{ producto.nombre }}</h3>
              <p class="text-gray-500">{{ producto.precio }}</p>
            </div>
            <button
              class="bg-red-500 text-white py-1 px-3 rounded hover:bg-red-600"
              @click="favoritosStore.toggleFavorito(producto)"
            >
              Eliminar
            </button>
          </li>
        </ul>
      </div>
      <p v-else class="text-gray-500">No hay productos en favoritos.</p>
    </div>
  </template>
  
  <script>
  import { useFavoritosStore } from '../store/favoritosStore';
  
  export default {
    setup() {
      const favoritosStore = useFavoritosStore(); // Importar el store de favoritos
      return { favoritosStore }; // Retornar el store para usarlo en el template
    },
  };
  </script>
  
  <style scoped>
  /* Agrega estilos personalizados si los necesitas */
  </style>
  