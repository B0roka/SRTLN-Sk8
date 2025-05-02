<script>
    export default {
        name: 'sobreNosotros'
    }
</script>

<template>
    <div class="flex flex-col items-center justify-center">
        <h1 class="text-5xl mb-4 mt-4">Sobre nosostros</h1>
        <img src="/src/assets/img/tab.jpg" alt="" class="rounded-lg border-2 border-amber-300 border-dotted">
    </div>

    <div class="grid grid-cols-2 m-5">
        <div class="m-2">
            <h2 class="text-center text-4xl mb-2 font-bold">Nuestra historia</h2>
            <p class="text-2xl">Somos una marca de skateboarding nacida en Villahermosa, Tabasco, México en 2023
            estamos decididos a apoyar a la escena local y seguir expandiendo la buena vibra y la cultura por
            el sur y el resto de México, apoyamos skaters locales y foraneos, realizamos concursos que apoyan 
            la cultura skater en nuestro estado asi como damos mantenimiento a los skateparks de nuestra ciudad
            y sobre todo buscamos la sana convivencia entres skaters.</p>

            <h2 class="text-center text-4xl mb-2 mt-5 font-bold">¿Donde estamos ubicados?</h2>
            <p class="text-2xl">Nos ubicamos en la ciudad de Villahermosa Tabasco <em>"Villahell"</em>, tenemos una pequeña skateshop
            muy cerca del parque la choca, nuestros horarios de atención son de 9 de la mañana a 7 de la tarde, puedes ver nuestra 
            ubicación en google maps en el <a href="https://maps.app.goo.gl/LzZdSywM6JMXS4BPA" target="_blank" class="text-blue-500">siguiente link</a> o puedes scrollear hacia abajo 
            y ver en nuestro footer la ubicación, de todos modos si quieres
            seguir comprando despues de esa hora nuestra e-shop esta abierta las 24 horas del día.</p>
        </div>

        <div class="space-y-6">
            <div class="w-4/5 space-y-6 h-4/5">
                <img src="/src/assets/img/jkalis.jpg" alt="">
                <img src="/src/assets/img/alexis.jpeg" alt="">
            </div>
        </div>
    </div>
</template>

<style>
    @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
  
  *{
    font-family: "Indie Flower", serif;
    
   }
</style>