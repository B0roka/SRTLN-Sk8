<script setup>
    import logo from '@/assets/img/logo-srtln.png'
</script>

<template>
    <header class="bg-purple-400 flex justify-between items-center p-2.5 md:p-4">
        <a href="#" class="btn">
            <RouterLink to="/ver-clientes">
                <button class=" text-white font-bold py-2 px-4 rounded hover:bg-blue-600 transition-colors text-4xl">Ver clientes</button>
            </RouterLink>
        </a>
        <div class="cursor-pointer">
            <RouterLink to="/"><img v-bind:src="logo" alt="Logo SRTLN" class="h-18 w-auto transition-transform duration-300 hover:scale-110"></RouterLink>
        </div>
        <nav class="space-x-9">
            <ul class="flex space-x-9 list-none tracking-widest">
                <li><RouterLink to="/carrito" class="font-medium text-lg"><font-awesome-icon :icon="['fas', 'shopping-cart']" class="text-4xl" /></RouterLink></li>
                <li><RouterLink to="/favoritos" class="font-medium text-lg"><font-awesome-icon :icon="['fas', 'heart']" class="text-4xl" /></RouterLink></li>
                <li><RouterLink to="/login"><font-awesome-icon :icon="['fas', 'circle-user',]"  class="text-4xl"/></RouterLink></li>
            </ul>
        </nav>
    </header>
</template>

<style scoped>
  @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
  
  *{
    font-family: "Indie Flower", serif;
   }
</style>