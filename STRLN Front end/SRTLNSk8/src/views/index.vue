<script setup>
    
</script>

<template>

    <div class="flex h-screen">
        <!--barra lateral de navegación-->
        <div class="w-64  bg-yellow-300 flex-shrink-0">
            <header class="text-center text-black text-4xl py-4">Nuestros productos</header>
            <ul>
                <li><a href="#" class="block text-black text-2xl py-4 px-10 border-b border-black hover:px-12 transition-all">Skates</a></li>
                <li><a href="#" class="block text-black text-2xl py-4 px-10 border-b border-black hover:px-12 transition-all">Tenis</a></li>
                <li><a href="#" class="block text-black text-2xl py-4 px-10 border-b border-black hover:px-12 transition-all">Ropa</a></li>
            </ul>
        </div>

        <!--contenido central de la pagina-->
        <div class="flex-grow flex flex-col items-center justify-start mt-10">
            <h1 class="text-4xl">Bienvenido a SRTLN SK8</h1>
            <h2 class="text-2xl">Lo mejor en skateboarding</h2>
            <img src="/src/assets/img/Kalis.jpg" alt="banner de la pagina" class="m-4 w-[75vh] p-4 border-double border-black border-2">

            <!--Articulos-->
            <div class=" flex flex-row pt-4 space-x-15">
                <!--contenedor de articulos-->
                <div class="p-4 max-w-sm bg-white rounded-lg shadow-md flex flex-col items-center">
                <img src="/src/assets/img/as-1.jpg" alt="producto" class="w-36 h-36 object-cover rounded-md"> 
                <h3 class="text-xl font-semibold mt-4">Converse - AS-1</h3>
                <P class="text-gray-500 mt-2">$1999.90</P>
                <button class="bg-blue-500 text-white font-bold py-2 px-4 rounded mt-4 hover:bg-blue-600 transition-colors">Añadir al carrito</button>
                </div>

                <div class="p-4 max-w-sm bg-white rounded-lg shadow-md flex flex-col items-center">
                <img src="/src/assets/img/Dc-Legacy-98-s.jpg" alt="producto" class="w-32 h-34 object-cover rounded-md"> 
                <h3 class="text-xl font-semibold mt-4">DC Shoes - Legacy 98 S</h3>
                <P class="text-gray-500 mt-2">$1999.90</P>
                <button class="bg-blue-500 text-white font-bold py-2 px-4 rounded mt-4 hover:bg-blue-600 transition-colors">Añadir al carrito</button>
                </div>

                <div class="p-4 max-w-sm bg-white rounded-lg shadow-md flex flex-col items-center">
                <img src="/src/assets/img/girl.jpeg" alt="producto" class="w-36 h-36 object-cover rounded-md"> 
                <h3 class="text-xl font-semibold mt-4">Girl - Beastie Boys</h3>
                <P class="text-gray-500 mt-2">$2300.90</P>
                <button class="bg-blue-500 text-white font-bold py-2 px-4 rounded mt-4 hover:bg-blue-600 transition-colors">Añadir al carrito</button>
                </div>

                <div class="p-4 max-w-sm bg-white rounded-lg shadow-md flex flex-col items-center">
                <img src="/src/assets/img/dickies-chort.jpg" alt="producto" class="w-36 h-36 object-cover rounded-md"> 
                <h3 class="text-xl font-semibold mt-4">Dickies - Jorts</h3>
                <P class="text-gray-500 mt-2">$1200.90</P>
                <button class="bg-blue-500 text-white font-bold py-2 px-4 rounded mt-4 hover:bg-blue-600 transition-colors">Añadir al carrito</button>
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
</style>
