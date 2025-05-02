<script setup>
    import logo from '@/assets/img/logo-srtln.png'
</script>

<!--Manejo del inicio de sesion-->
<script>
    export default {
        data() {
            return {
                username: "",
                password: "",
            };
        },
        methods: {
            async handleLogin() {
                try {
                    const response = await fetch('http://localhost:8080/login', {
                        method: 'POST',
                        headers: { 'Content-Type': 'application/x-www-form-urlencoded'},
                        body: new URLSearchParams({
                            username: this.username,
                            password: this.password,
                        }),
                    });
                    if (response.ok) {
                        //redirige al usuario tras el inicio de sesion exitoso
                        window.location.href = '/';
                    } else {
                        alert('Credenciales invalidas.');
                    }
                } catch (error) {
                    console.error('Error al iniciar sesion:', error);
                }
            }
        }
    }
</script>

<template>
    <div id="ladoDerecho" class="bg-gray-100 min-h-screen min-w-max flex items-center justify-center flex-col">
        <img :src="logo" alt="Logo SRTLN" class="max-w-full h-auto mb-8">
        <div class="bg-white p-8 rounded-lg shadow-md w-full max-w-sm">
            <div class="flex justify-center mb-6">
                <font-awesome-icon class="text-center text-5xl" :icon="['fas', 'circle-user']" />
            </div>
        <h2 class="text-2xl font-bold mb-6 text-center">Iniciar Sesión</h2>
        <form @submit.prevent="handleLogin">
            <div class="mb-4">
            <label for="email" class="block text-gray-700">Correo Electrónico:</label>
            <input type="email" id="email" v-model="username" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <div class="mb-4">
            <label for="password" class="block text-gray-700">Contraseña:</label>
            <input type="password" id="password" v-model="password" class="mt-1 px-3 py-2 bg-white border border-gray-300 rounded-md shadow-sm focus:outline-none focus:border-blue-500 focus:ring-1 focus:ring-blue-500 w-full" required>
            </div>
            <button type="submit" class="w-full bg-blue-500 text-white py-2 rounded-md hover:bg-blue-600 focus:outline-none focus:bg-blue-600">Iniciar Sesión</button>
            <p>¿Te olvidaste de la contraseña? <a href="#" class="text-blue-500 hover:bg-blue-100">Restablecer contraseña</a></p>
            <p>¿No eres miembro? <RouterLink to="/req/signup"><a href="/src/views/registrarUsuario.vue" class="text-blue-500 hover:bg-blue-100">Registrate</a></RouterLink></p>
        </form>
        </div>
    </div>

    <div id="ladoIzquierdo" class="min-h-screen min-w-1">
        <img src="/src/assets/img/converseBanner.jpg" alt="w-full h-full">
    </div>
</template>

<style scoped>
    #ladoDerecho {
        font-size: 105%;
        padding: 15px;
        margin: 0px 10px 10px 10px;
        width: 800px;
        height: 30%;
        float: left;
    }

    #ladoDerecho  {

    }

    #ladoIzquierdo {
        background-image: url(/src/assets/img/converseBanner.jpg);
        width: 770px;
        float: right;
    }

    
</style>