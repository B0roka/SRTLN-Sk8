<template>
    <footer class="bg-purple-400 border-t-2 border-yellow-300 p-3 flex flex-col justify-between w-full h-auto">
        <div class="flex flex-col md:flex-row justify-between items-start w-full flex-grow">
            <!-- Sección izquierda (Sobre nosotros) -->
            <div class="w-full md:w-1/3 flex flex-col text-center md:text-left">
                <RouterLink to="/sobre-nosotros">
                    <h2 class="text-2xl md:text-4xl font-bold hover:text-yellow-300">Sobre nosotros</h2>
                </RouterLink>
                <p class="text-lg text-gray-700">
                    Conoce más sobre nuestra historia y cómo estamos impulsando el skateboarding en el sur de México.
                </p>
            </div>

            <!-- Sección central (Redes sociales) -->
            <div class="w-full md:w-1/3 flex flex-col items-center">
                <h2 class="text-xl font-bold text-yellow-300 mb-3">Síguenos</h2>
                <ul class="flex space-x-6">
                    <li><font-awesome-icon :icon="['fab', 'instagram']" class="text-4xl md:text-6xl text-white hover:text-yellow-300" /></li>
                    <li><font-awesome-icon :icon="['fab', 'facebook']" class="text-4xl md:text-6xl text-white hover:text-yellow-300" /></li>
                    <li><font-awesome-icon :icon="['fab', 'youtube']" class="text-4xl md:text-6xl text-white hover:text-yellow-300" /></li>
                </ul>
            </div>

            <!-- Sección derecha (Mapa) -->
            <div class="w-full md:w-1/3 flex justify-center">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2683.359331708076!2d-92.93038421930264!3d17.986032512184934!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x85edd83062118481%3A0x4e251bf9b6e54147!2sSekta%20Skateshop!5e0!3m2!1ses-419!2smx!4v1742391306804!5m2!1ses-419!2smx" 
                    class="w-full h-40 md:w-96 md:h-48 rounded-md"
                    loading="lazy"
                    style="border:0;">
                </iframe>
            </div>
        </div>

        <!-- Copyright -->
        <div class="flex justify-center items-center text-white text-lg md:text-2xl w-full">
            <h2>© SRTLN SK8 2025</h2>
        </div>
    </footer>
</template>

<style scoped>
    footer {
        width: 100%;
        height: auto; /* 🔥 Permite que se ajuste dinámicamente */
        display: flex;
        flex-direction: column;
        justify-content: space-between;
    }


    footer h2:hover {
        transform: scale(1.05);
    }

    ul li {
        transition: color 0.3s ease-in-out;
    }

</style>

