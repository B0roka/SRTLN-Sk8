<template>
    <main>
        <Navbar />

        <!-- tabla-->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Ver clientes</h1>

                    <a href="/add" class="btn btn-primary">Agregar clientes</a>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Apellidos</th>
                                <th scope="col">Email</th>
                                <th scope="col">Numero de telefono</th>
                                <th scope="col">Genero</th>
                                <th scope="col">Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="cliente in clientes" :key="cliente.id">
                                <th scope="row">{{ cliente.id }}</th>
                                <td>{{ cliente.nombre }}</td>
                                <td>{{ cliente.email }}</td>
                                <td>{{ cliente.telefono }}</td>
                                <td>{{ cliente.genero }}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </main>
</template>

<script>

    import Navbar from '../components/barraNavegacion.vue'

    export default{
        name: 'VerClientes',
        components: {
            Navbar
        },
        data(){
            return{
                clientes: []
            }
        },

        methods: {
            getClientes(){
                fetch('http://localhost:8080/clientes')
                .then(res => res.json)
                .then(data => {
                    this.clientes = data
                    console.log(data)
                })
            },

            deleteClientes(id){
                fetch('http://localhost:8080/cliente/${id}', {
                    method: 'DELETE'
                })
                .then(data => {
                    console.log(data)
                    this.getClientes()
                })
            }
        }
    }

</script>