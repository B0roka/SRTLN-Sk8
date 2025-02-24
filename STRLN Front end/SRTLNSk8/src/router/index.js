import { createRouter, createWebHistory } from 'vue-router';
import index from '@/views/index.vue';
import iniciarSesion from '@/views/iniciarSesion.vue';
import sobreNosotros from '@/views/sobreNosotros.vue';

const routes = [
    { path: '/', component: index} ,
    { path: '/login', component: iniciarSesion} ,
    { path: '/sobre-nosotros', component: sobreNosotros} ,
]

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;