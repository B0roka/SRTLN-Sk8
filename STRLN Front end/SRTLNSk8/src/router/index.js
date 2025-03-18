import { createRouter, createWebHistory } from 'vue-router';
import index from '@/views/index.vue';
import iniciarSesion from '@/views/iniciarSesion.vue';
import sobreNosotros from '@/views/sobreNosotros.vue';
import registrarUsuario from '@/views/registrarUsuario.vue';
import verClientes from '@/views/verClientes.vue';
import adminDashboard from '@/views/administracion/adminDashboard.vue';

const routes = [
    { path: '/', component: index} ,
    { path: '/login', component: iniciarSesion} ,
    { path: '/sobre-nosotros', component: sobreNosotros} ,
    { path: '/req/signup', component: registrarUsuario},
    { path: '/ver-clientes', component: verClientes},
    { path: '/admin', component: adminDashboard}, 
]

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
