<script setup>
    import logo from '@/assets/img/logo-srtln.png';
    import { ref } from 'vue';

    const searchQuery = ref('');
</script>

<template>
   <header class="bg-purple-400 flex flex-wrap justify-between items-center p-3">
        <!-- Barra de búsqueda (siempre visible en desktop) -->
        <div class="hidden md:flex items-center bg-white rounded-lg shadow-md p-1.5 w-auto">
            <input v-model="searchQuery" type="text" placeholder="Buscar..." class="p-2 rounded-l-lg outline-none">
            <button @click="buscar" class="bg-transparent text-gray-500 p-2 hover:text-gray-700 transition-colors">
                <font-awesome-icon :icon="['fas', 'search']" class="text-xl"/>
            </button>
        </div>

        <!-- Botón hamburguesa en móviles -->
        <button class="md:hidden text-white text-3xl p-2" @click="mostrarMenu = !mostrarMenu">☰</button>

        <!-- Logo centrado -->
        <div class="flex-grow flex justify-center">
            <RouterLink to="/">
            <img v-bind:src="logo" alt="Logo SRTLN" class="h-16 md:h-20 max-w-[180px] w-auto transition-transform duration-300 hover:scale-110 pb-1">
            </RouterLink>
        </div>

        <!-- Íconos de navegación (siempre visibles en desktop) -->
        <nav class="hidden md:flex space-x-6 text-lg">
            <RouterLink to="/carrito" class="text-white hover:text-gray-300">
            <font-awesome-icon :icon="['fas', 'shopping-cart']" class="text-3xl md:text-4xl"/>
            </RouterLink>
            <RouterLink to="/favoritos" class="text-white hover:text-gray-300">
            <font-awesome-icon :icon="['fas', 'heart']" class="text-3xl md:text-4xl"/>
            </RouterLink>
            <RouterLink to="/login" class="text-white hover:text-gray-300">
            <font-awesome-icon :icon="['fas', 'circle-user']" class="text-3xl md:text-4xl"/>
            </RouterLink>
        </nav>

        <!-- Menú móvil desplegable -->
        <div v-if="mostrarMenu" class="absolute top-16 left-0 w-full bg-purple-500 shadow-md rounded-md p-4 flex flex-col items-center space-y-4 md:hidden">
            <RouterLink to="/carrito" class="text-white hover:text-gray-300 text-lg">Carrito</RouterLink>
            <RouterLink to="/favoritos" class="text-white hover:text-gray-300 text-lg">Favoritos</RouterLink>
            <RouterLink to="/login" class="text-white hover:text-gray-300 text-lg">Login</RouterLink>

            <!-- Barra de búsqueda (solo en móviles dentro del menú) -->
            <div class="bg-white rounded-lg shadow-md p-1.5 mt-4 w-full">
                <input v-model="searchQuery" type="text" placeholder="Buscar..." class="p-2 rounded-l-lg outline-none w-full">
                <button @click="buscar" class="bg-transparent text-gray-500 p-2 hover:text-gray-700 transition-colors">
                    <font-awesome-icon :icon="['fas', 'search']" class="text-xl"/>
                </button>
            </div>
        </div>
    </header>


</template>

<style scoped>
  @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
  
  *{
    font-family: "Indie Flower", serif;
   }
   
</style>