<template>
    <div class="p-6 text-center">
        <h2 class="text-2xl font-bold mb-4">Mi Carrito</h2>
        <div v-if="carritoStore.carrito.length">
            <ul>
            <li v-for="producto in carritoStore.carrito" :key="producto.id" class="border rounded-md p-4 mb-2 flex justify-between items-center">
                <div class="flex items-center space-x-4">
                <img :src="producto.img" alt="Imagen del producto" class="w-16 h-16 object-cover rounded-md" />
                <div>
                    <h3 class="text-lg font-semibold">{{ producto.nombre }}</h3>
                    <p class="text-gray-500">{{ producto.precio }}</p>
                </div>
                </div>
                <button class="bg-red-500 text-white py-1 px-3 rounded hover:bg-red-600" @click="carritoStore.toggleCarrito(producto)">
                Eliminar
                </button>
            </li>
            </ul>

            <!--Total a pagar-->
            <div class="mt-6 text-lg font-semibold">
                <p>Subtotal: ${{ carritoStore.totalProductos.toFixed(2) }}</p>
                <p>Envio: ${{ carritoStore.envio.toFixed(2) }}</p>
                <p class="text-xl font-bold mt-2">Total: ${{ carritoStore.totalConEnvio.toFixed(2) }}</p>
            </div>

            <!--Boton para realizar la compra-->
            <button class="bg-green-500 text-white py-2 px-6 rounded mt-4 hover:bg-green-600 transition-colors"
            @click="carritoStore.carrito = []">
                Comprar
            </button>
        </div>
        <p v-else class="text-gray-500">Tu carrito está vacío.</p>
</div>

</template>

<script>
import { useCarritoStore } from '@/store/carritoStore'; 

export default {
  setup() {
    const carritoStore = useCarritoStore(); // Importar el store de carrito
    return { carritoStore }; // Retornar el store para usarlo en el template
  },
};
</script>