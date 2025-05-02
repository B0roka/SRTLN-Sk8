<script setup>
   import { ref } from 'vue';
   import { useFavoritosStore } from '@/store/favoritosStore';
   import { useCarritoStore } from '@/store/carritoStore';

   const favoritosStore = useFavoritosStore();
   const carritoStore = useCarritoStore();

    const value = ref(0);
    const items = ref(["/img/Kalis.jpg",
        "/img/converseBanner.jpg"
    ]);

    const productos = ref([
        {
            id: 1,
            nombre: "Converse - AS-1",
            precio: "$1999.90",
            img: "/img/as-1.jpg",
        },
        {
            id: 2,
            nombre: "DC Shoes - Legacy 98 S",
            precio: "$1999.90",
            img: "/img/Dc-Legacy-98-s.jpg",
        },
        {
            id: 3,
            nombre: "Girl - Beastie Boys",
            precio: "$2300.90",
            img: "/img/girl.jpeg",
        },
        {
            id: 4,
            nombre: "Dickies - Jorts",
            precio: "$1200.90",
            img: "/img/dickies-chort.jpg",
        },
    ]);

</script>

<template>

    <div class="flex h-screen">

        <!--contenido central de la pagina-->
        <div class="flex-grow flex flex-col items-center justify-start mt-10">
            <h1 class="text-4xl">Bienvenido a SRTLN SK8</h1>
            <h2 class="text-2xl mb-6">Lo mejor en <em>"skateboring"</em></h2>

            <div class="w-full max-w-[900px] mx-auto text-center px-4">
                <h2 class="text-lg sm:text-xl md:text-2xl font-semibold text-gray-700 mb-4">🔥 Mira nuestro video promocional 🔥</h2>
                <iframe 
                    class="w-full max-w-[900px] rounded-lg shadow-md border-4 border-yellow-300 aspect-video object-cover"
                    src="https://www.youtube.com/embed/9RucpjO2_bQ" 
                    allowfullscreen>
                </iframe>
            </div>


            


            <!--Articulos-->
            <div class="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-6 pt-4 mb-4">
                <!--contenedor de articulos-->
                
                    <div v-for="producto in productos" :key="producto.id" class="p-6 max-w-sm bg-white rounded-lg shadow-md flex flex-col items-center transition transform hover:scale-105">
                    <RouterLink to="/converse_as_1">
                        <img :src="producto.img" alt="producto" class="w-36 h-36 object-cover rounded-md shadow-lg"> 
                        <h3 class="text-xl font-semibold mt-4 text-gray-700">{{ producto.nombre }}</h3>
                        <P class="text-gray-500 mt-2">{{ producto.precio }}</P>
                    </RouterLink>
                    <span class="flex items-center mt-4 space-x-4">
                        <button class="bg-blue-500 text-white font-bold py-2 px-4 rounded hover:bg-blue-600 transition-colors"
                        @click="carritoStore.toggleCarrito(producto)"
                        >
                        {{ carritoStore.carrito.some(prod => prod.id === producto.id) ? 'Eliminar del carrito' : 'Añadir al carrito' }}
                        </button>
                        <!-- icono de favoritos con funcionalidad-->
                        <font-awesome-icon :icon="favoritosStore.favoritos.some(fav => fav.id === producto.id) ? ['fas', 'heart'] : ['far', 'heart']" 
                            class="text-red-500 text-2xl cursor-pointer transition-colors hover:text-red-700"
                            @click="favoritosStore.toggleFavorito(producto)"
                        />
                    </span>
                    </div>
            </div>

        </div>
    </div>

</template>


<style scoped>
  @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
  
  *{
    font-family: "Indie Flower", serif;
   }

   video {
        min-height: 180px;
        max-height: 500px;
    }

</style>

