<script setup>
   import { ref } from 'vue';
   import { useFavoritosStore } from '@/store/favoritosStore';
   import { useCarritoStore } from '@/store/carritoStore';

   const favoritosStore = useFavoritosStore();
   const carritoStore = useCarritoStore();

    const productos = ref([
        {
            id: 12,
            nombre: "ACE - AF1 Hollow",
            precio: "$2300.90",
            img: "/img/categorias/trucks/Ace.jpeg",
        },
        {
            id: 13,
            nombre: "Independent- Forged Hollow",
            precio: "$2500.90",
            img: "/img/categorias/trucks/indy.jpg",
        },
        {
            id: 14,
            nombre: "Core - Standard",
            precio: "$1500.90",
            img: "/img/categorias/trucks/core.gif",
        },
        {
            id: 15,
            nombre: "Tensor - Aluminium Regular",
            precio: "$1200.90",
            img: "/img/categorias/trucks/tensor.jpeg",
        },
    ]);

</script>

<template>
    <div class="container mx-auto px-4 flex flex-col items-center justify-start mt-10">
        <img class="border-4 rounded border-yellow-300 border-dashed my-5 max-w-full md:max-w-[900px] h-auto p-4" 
            src="/img/categorias/trucks/main-truck.jpg" alt="tablas de skate">
        
        <h1 class="text-lg sm:text-xl md:text-3xl font-bold text-center">Trucks</h1>
        <p class="text-sm sm:text-lg md:text-xl text-gray-700 text-center">
            Los trucks mas duraderos para que hagas tus mejores grinds
        </p>
        <h2 class="mb-5 text-center"><em>SRTLN8 Sk8</em></h2>

        <!-- Grid de Productos -->
        <div class="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-6 pt-4 mb-10">
            <div v-for="producto in productos" :key="producto.id" 
                class="p-6 max-w-xs bg-white rounded-lg shadow-md flex flex-col items-center transition transform hover:scale-105">
                <RouterLink to="/converse_as_1">
                    <img :src="producto.img" alt="producto" class="w-32 h-32 object-cover rounded-md shadow-lg"> 
                    <h3 class="text-lg sm:text-xl font-semibold mt-4 text-gray-700 text-center">{{ producto.nombre }}</h3>
                    <p class="text-gray-500 mt-2">{{ producto.precio }}</p>
                </RouterLink>
                <span class="flex items-center mt-4 space-x-4">
                    <button class="bg-blue-500 text-white font-bold py-2 px-4 rounded hover:bg-blue-600 transition-colors"
                            @click="carritoStore.toggleCarrito(producto)">
                        {{ carritoStore.carrito.some(prod => prod.id === producto.id) ? 'Eliminar del carrito' : 'Añadir al carrito' }}
                    </button>
                    <font-awesome-icon :icon="favoritosStore.favoritos.some(fav => fav.id === producto.id) ? ['fas', 'heart'] : ['far', 'heart']"
                                    class="text-red-500 text-2xl cursor-pointer transition-colors hover:text-red-700"
                                    @click="favoritosStore.toggleFavorito(producto)" />
                </span>
            </div>
        </div>
    </div>

</template>