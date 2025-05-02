<template>
    <div class="grid grid-cols-2 m-5 p-2.5">
        
        <div class="p-8">
            <!-- Imagen del producto -->
            <div class="mb-6">
                <img src="/src/assets/img/girl.jpeg" alt="producto" class="w-full max-w-md mx-auto rounded-lg shadow-md">
            </div>
            <!-- Título principal -->
            <h2 class="text-3xl font-bold text-gray-800 text-center mb-4">Beastie Boys - Shure Shot</h2>
            <!-- Descripción -->
            <p class="text-lg text-gray-600 mb-6">
                Una excelente tabla con un shape clasico con imagenes tomadas durante la grabaciòn del video musical de la canciòn Shure Shot
            </p>
            <!-- Características -->
            <h3 class="text-2xl font-semibold text-gray-800 mb-4">Medidas y recomendaciònes:</h3>
            <ul class="list-disc list-inside text-gray-700 space-y-2">
                <li>7.5 a 7.8" recomendado para niños principiantes y para patinadores muy técnicos.</li>
                <li>8.0 a 8.1" la medida promedio o standar para practicar modalidad de street.</li>
                <li>8.2 a 8.5" un intermedio entre modalidad street y transiciones en parques.</li>
                <li>8.5" o más ideal para "Park", rampas, bowl.</li>
            </ul>
        </div>


        <div class="ml-10 mt-10 text-center py-8">
            <h1 class="text-7xl font-bold text-gray-800">Girl - Beastie Boys</h1>
            <h2 class="text-5xl text-red-500 font-semibold mt-4">$2300.90</h2>
            <p class="text-xl text-gray-600 mt-4">
                La colecciòn de beastie boys x girl skateboards ha llegado a SRTLNSk8, en esta colaboraciòn 
                las tablas usan fotos tomadas por el legendario director Spike Jonze hacie la banda de rap
                de blancos màs famosa los "Beastie Boys".
            </p>
            <form class="mt-6 text-left inline-block">
                <!-- Selector de talla -->
                <div class="mb-4">
                    <label for="size" class="block text-lg font-medium text-gray-700">Medida:</label>
                    <select id="size" name="size" required class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-red-500 focus:border-red-500 text-gray-700">
                        <option value="" disabled selected>Selecciona una medida:</option>
                        <option value="8.0">8.0</option>
                        <option value="8.25">8.25</option>
                        <option value="8.5">8.5</option>
                    </select>
                </div>
                <!-- Campo de cantidad -->
                <div class="mb-4">
                    <label for="quantity" class="block text-lg font-medium text-gray-700">Cantidad:</label>
                    <input type="number" id="quantity" name="quantity" min="1" max="5" value="1" required
                        class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-red-500 focus:border-red-500 text-gray-700">
                </div>
                <!-- Botón para añadir al carrito -->
                <button type="submit" class="w-full px-4 py-2 text-lg font-semibold text-white bg-blue-500 rounded-md hover:bg-blue-600 focus:ring-2 focus:ring-offset-2 focus:ring-blue-500 cursor-pointer">
                    Añadir al carrito
                </button>
            </form>
        </div>

    </div>
</template>