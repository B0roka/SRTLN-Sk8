import { createRouter, createWebHistory } from 'vue-router';
import index from '@/views/index.vue';
import iniciarSesion from '@/views/iniciarSesion.vue';
import favoritos from '@/views/favoritos.vue';
import carrito from '@/views/carrito.vue';
import sobreNosotros from '@/views/sobreNosotros.vue';
import registrarUsuario from '@/views/registrarUsuario.vue';
import verClientes from '@/views/verClientes.vue';
import adminDashboard from '@/views/administracion/adminDashboard.vue';
import converse_as from '@/views/productos/converse_as.vue';
import girl from '@/views/productos/girl.vue';
import dc98 from '@/views/productos/dc98.vue';
import jorts from '@/views/productos/jorts.vue';
import tablas from '@/views/categorias/tablas.vue';
import trucks from '@/views/categorias/trucks.vue';
import converse from '@/views/categorias/converse.vue';
import dc from '@/views/categorias/dc.vue';

const routes = [
    { path: '/', component: index} ,
    { path: '/login', component: iniciarSesion} ,
    { path: '/favoritos', component: favoritos},
    { path: '/carrito', component: carrito},
    { path: '/sobre-nosotros', component: sobreNosotros} ,
    { path: '/req/signup', component: registrarUsuario},
    { path: '/ver-clientes', component: verClientes},
    { path: '/admin', component: adminDashboard}, 
    { path: '/converse_as_1', component: converse_as},
    { path: '/girl_beastie_boys', component: girl},
    { path: '/dickies_jorts', component: jorts},
    { path: '/dc_98_s', component: dc98},
    { path: '/tablas', component: tablas},
    { path: '/trucks', component: trucks},
    { path: '/convers', component: converse},
    { path: '/dc', component: dc},
]

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
