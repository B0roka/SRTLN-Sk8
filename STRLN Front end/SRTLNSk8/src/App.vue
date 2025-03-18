<script setup>
  import { useRoute } from 'vue-router';
  import Navbar from './components/Navbar.vue';
  import Sidebar from './components/Sidebar.vue';
  import Footer from './components/Footer.vue';

  const route = useRoute();
</script>

<template>
  <div id="app" class="flex flex-col h-screen">
    <Navbar class="h-22" v-if="route.path !== '/admin'" />

    <!--Contenedor principal-->
    <div class="flex flex-1">
      <Sidebar class="w-64 h-full" v-if="route.path !== '/admin'"/>
      <!--contenido-->
      <div class="flex-1 p- 14 overflow-auto">
        <router-view />
      </div>
    </div>
    <Footer class="h-24" v-if="route.path !== '/admin'"/>
  </div>
  
</template>

