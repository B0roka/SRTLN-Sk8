
<template>
    <div class="grid grid-cols-2 m-5 p-2.5">
        
        <div class="p-8">
            <!-- Imagen del producto -->
            <div class="mb-6">
                <img src="/src/assets/img/as-1.jpg" alt="producto" class="w-full max-w-md mx-auto rounded-lg shadow-md">
            </div>
            <!-- Título principal -->
            <h2 class="text-3xl font-bold text-gray-800 text-center mb-4">APUESTA POR LOS ALEXIS</h2>
            <!-- Descripción -->
            <p class="text-lg text-gray-600 mb-6">
                Los AS-1 Pro ideados por Alexis Sablone son todavía más duraderas y ofrecen más contacto con la tabla, junto con una precisión y un estilo incomparables.
                Ahora vuelven con materiales y colores inspirados en la naturaleza para lograr un estilo resistente.
            </p>
            <!-- Características -->
            <h3 class="text-2xl font-semibold text-gray-800 mb-4">Características</h3>
            <ul class="list-disc list-inside text-gray-700 space-y-2">
                <li>Parte superior de gamuza duradera y lona Cordura para un look de skate inspirado en la naturaleza</li>
                <li>Amortiguación CX para absorber los impactos y dar una comodidad superior</li>
                <li>Núcleo perfeccionado en el diseño cupsole para una amortiguación óptima</li>
                <li>Los materiales y colores hacen referencia a los estilos al aire libre para brindarle un aspecto y una sensación renovados.</li>
                <li>Un diseño en espiga en el exterior ayuda a brindar una tracción óptima.</li>
            </ul>
        </div>


        <div class="ml-10 mt-10 text-center py-8">
            <h1 class="text-7xl font-bold text-gray-800">Converse AS-1 Pro</h1>
            <h2 class="text-5xl text-red-500 font-semibold mt-4">$1999.90</h2>
            <p class="text-xl text-gray-600 mt-4">
                El pro model de Alexis Sablone ha llegado a SRTLNSk8 shop, un calzado completamente de gamuza con una durabilidad
                increíble para que raspes todos los trucos como si estuvieras en una video part.
            </p>
            <form class="mt-6 text-left inline-block">
                <!-- Selector de talla -->
                <div class="mb-4">
                    <label for="size" class="block text-lg font-medium text-gray-700">Talla:</label>
                    <select id="size" name="size" required class="mt-1 block w-full rounded-md border-gray-300 shadow-sm focus:ring-red-500 focus:border-red-500 text-gray-700">
                        <option value="" disabled selected>Selecciona una talla</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
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

<style scoped>
  
</style>