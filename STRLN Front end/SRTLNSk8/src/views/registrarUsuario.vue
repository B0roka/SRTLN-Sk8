<script setup>
    import logo from '@/assets/img/logo-srtln.png'

</script>

<script>
    export default {
        name: 'addCliente',

        data() {
            return {
                cliente: {
                    nombre: '',
                    apellidos: '',
                    correoElectronico: '',
                    contraseña: '',
                    direccion: '',
                    telefono: '',
                    fechaRegistro: ''
                }
            }
        },

        methods: {
            addCliente() {
                fetch('http://localhost:8080/clientes', {
                    method: 'POST',
                    headers: {
                        'Content-type': 'application/json'
                    },
                    body: JSON.stringify(this.cliente)
                })
                .then(data =>{
                    console.log(data)
                    this.$router.push("/")
                })
            }
        }
    }
</script>

<template>
    <div id="ladoDerecho" class="bg-green-400 min-h-screen min-w-max flex items-center justify-center flex-col">
        <img :src="logo" alt="Logo SRTLN" class="max-w-full h-auto mb-8">
        <h1 class="">¡Bienvenido!</h1>
        <div class="bg-white p-8 rounded-lg shadow-md w-full max-w-sm">
        <h2 class="text-2xl font-bold mb-6 text-center">Registrate</h2>
        <form @submit.prevent="addCliente">
            <!--nombre-->
            <div class="mb-4">
            <label for="nombre" class="block text-gray-700">Nombre:</label>
            <input type="text" id="nombre" name="nombre" v-model="cliente.nombre" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <!--Apellidos-->
            <div class="mb-4">
            <label for="apellidos" class="block text-gray-700">Apellidos:</label>
            <input type="text" id="apellidos" name="apellidos" v-model="cliente.apellidos" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <!--Correo electronico-->
            <div class="mb-4">
            <label for="correoElectronico" class="block text-gray-700">Correo electronico:</label>
            <input type="email" id="correoElectronico" name="correoElectronico" v-model="cliente.correoElectronico" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <!--Contraseña-->
            <div class="mb-4">
            <label for="contraseña" class="block text-gray-700">Contraseña:</label>
            <input type="password" id="contraseña" name="contraseña" v-model="cliente.contraseña" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
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