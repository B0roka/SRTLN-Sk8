<script setup>
   import { ref } from 'vue';
   import { useFavoritosStore } from '@/store/favoritosStore';
   import { useCarritoStore } from '@/store/carritoStore';

   const favoritosStore = useFavoritosStore();
   const carritoStore = useCarritoStore();

    const productos = ref([
        {
            id: 3,
            nombre: "Girl - Beastie Boys",
            precio: "$2300.90",
            img: "/img/girl.jpeg",
        },
        {
            id: 5,
            nombre: "Nomad skateboards - 2pac",
            precio: "$1000.90",
            img: "/img/categorias/decks/2pac.jpg",
        },
        {
            id: 6,
            nombre: "Zero - Misfits",
            precio: "$2500.90",
            img: "/img/categorias/decks/misfits.jpg",
        },
        {
            id: 7,
            nombre: "Baker - original",
            precio: "$1000.90",
            img: "/img/categorias/decks/baker.jpeg",
        },
        {
            id: 8,
            nombre: "Heroin - Huevo",
            precio: "$999.90",
            img: "/img/categorias/decks/nail.jpg",
        },
        {
            id: 9,
            nombre: "Primitive - My hero academia",
            precio: "$1000.90",
            img: "/img/categorias/decks/hero.jpg",
        },
        {
            id: 10,
            nombre: "TAco - Abstratco",
            precio: "$799.50",
            img: "/img/categorias/decks/taco.jpeg",
        },
        {
            id: 11,
            nombre: "Santa Cruz - Screaming Hand",
            precio: "$1500.50",
            img: "/img/categorias/decks/santa.jpeg",
        },
    ]);

</script>

<template>
    <div class="container mx-auto px-4 flex flex-col items-center justify-start mt-10">
        <img class="border-4 rounded border-yellow-300 border-dashed my-5 max-w-full md:max-w-[900px] h-auto p-4" 
            src="../../assets/img/categorias/Tablas.jpeg" alt="tablas de skate">
        
        <h1 class="text-lg sm:text-xl md:text-3xl font-bold text-center">Tablas de skateboarding</h1>
        <p class="text-sm sm:text-lg md:text-xl text-gray-700 text-center">
            Los mejores diseños y las mejores shapes de skate solo los puedes encontrar en tu sk8shop favorita
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