<script setup>
   import { ref } from 'vue';
   import { useFavoritosStore } from '@/store/favoritosStore';
   import { useCarritoStore } from '@/store/carritoStore';

   const favoritosStore = useFavoritosStore();
   const carritoStore = useCarritoStore();

    const productos = ref([
        {
            id: 2,
            nombre: "DC Shoes - Legacy 98 S",
            precio: "$1999.90",
            img: "/img/Dc-Legacy-98-s.jpg",
        },
        {
            id: 14,
            nombre: "Dc Shoes - Pure",
            precio: "$999.00",
            img: "/img/categorias/dc/pure.jpg",
        },
    ]);

</script>

<template>
    <div class="container mx-auto px-4 flex flex-col items-center justify-start mt-10">
        <img class="border-4 rounded border-yellow-300 border-dashed my-5 max-w-full md:max-w-[900px] h-auto p-4" 
            src="/img/Kalis.jpg" alt="tablas de skate">
        
        <h1 class="text-lg sm:text-xl md:text-3xl font-bold text-center">DC Shoes</h1>
        <p class="text-sm sm:text-lg md:text-xl text-gray-700 text-center">
            lo mejor del estilo urbano
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