<script setup>
    import logo from '@/assets/img/logo-srtln.png'

</script>

<script>
    export default {
        data() {
            return {
                    nombre: '',
                    apellidos: '',
                    correoElectronico: '',
                    contraseña: '',
                    direccion: '',
                    telefono: '',
                    fechaRegistro: ''
            };
        },
        methods: {
            async handleRegister() {
                try {
                    const response = await fetch('http://localhost:8080/req/signup', {
                        method: 'POST',
                        headers: { 'Content-Type': 'application/json'},
                        body: JSON.stringify({
                            nombre: this.nombre,
                            apellidos: this.apellidos,
                            correoElectronico: this.correoElectronico,
                            contraseña: this.contraseña,
                            direccion: this.direccion,
                            telefono: this.telefono,
                        }),
                    });
                    if (response.ok) {
                        alert('¡Registro exitoso! Bienvenido a SRTLN SK8');
                        window.location.href = '/login'; //nos redirige al formulario para iniciar sesion
                    } else {
                        alert('Error al registrarse. Intenta nuevamente');
                    }
                } catch (error){
                    console.error('Error al registrarse:', error);
                }
            }
        }

        
        }
    
</script>

<template>
    <div id="ladoDerecho" class="bg-green-300 min-h-screen min-w-max flex items-center justify-center flex-col">
        <img :src="logo" alt="Logo SRTLN" class="max-w-full h-auto mb-8">
        <h1 class="">¡Bienvenido!</h1>
        <div class="bg-white p-8 rounded-lg shadow-md w-full max-w-sm">
        <h2 class="text-2xl font-bold mb-6 text-center">Registrate</h2>
        <form @submit.prevent="handleRegister">
            <!--nombre-->
            <div class="mb-4">
            <label for="nombre" class="block text-gray-700">Nombre:</label>
            <input type="text" id="nombre" name="nombre" v-model="nombre" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <!--Apellidos-->
            <div class="mb-4">
            <label for="apellidos" class="block text-gray-700">Apellidos:</label>
            <input type="text" id="apellidos" name="apellidos" v-model="apellidos" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <!--Correo electronico-->
            <div class="mb-4">
            <label for="correoElectronico" class="block text-gray-700">Correo electronico:</label>
            <input type="email" id="correoElectronico" name="correoElectronico" v-model="correoElectronico" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <!--Contraseña-->
            <div class="mb-4">
            <label for="contraseña" class="block text-gray-700">Contraseña:</label>
            <input type="password" id="contraseña" name="contraseña" v-model="contraseña" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>

            <!--Añadir modulo de confirmacion de contraseña
            <div class="mb-4">
            <label for="contraseña" class="block text-gray-700">Confirmar contraseña:</label>
            <input type="password" id="contraseña" v-model="password" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            -->
            <button type="submit" class="w-full bg-blue-500 text-white py-2 rounded-md hover:bg-blue-600 focus:outline-none focus:bg-blue-600">Registrarse</button>
            
        </form>
        </div>
  </div>
</template>

<style scoped>
    
</style>