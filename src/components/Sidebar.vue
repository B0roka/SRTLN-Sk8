<script setup>
  import { ref } from 'vue';

  const isSidebarOpen = ref(false);
</script>

<template>

  <!-- Botón para abrir Sidebar en móviles -->
  <button class="md:hidden fixed top-4 left-4 bg-yellow-500 text-black p-2 rounded-lg" @click="isSidebarOpen = !isSidebarOpen">
    ☰ Menú
  </button>  

  <div :class="isSidebarOpen ? 'translate-x-0' : '-translate-x-full'"
      class="relative bg-yellow-300 w-60 max-w-xs shadow-md transform transition-transform md:translate-x-0 md:relative overflow-y-auto h-auto"
      id="sidebar">

      <!-- Botón para cerrar Sidebar (ahora dentro de la sidebar) -->
      <button class="absolute top-4 right-4 text-black text-2xl" @click="isSidebarOpen = false">
        ✖
      </button>

    <!--Añadir color-->
    <VaSidebar>
      <VaSidebarItem>
        <VaSidebarItemContent>
          <VaSidebarItemTitle class="text-2xl">Nuestros productos</VaSidebarItemTitle>
        </VaSidebarItemContent>
      </VaSidebarItem>

      <VaAccordion>
        <VaCollapse body-color="#00000022">
          <template #header="{ value: isCollapsed }">
            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Skateboarding</VaSidebarItemTitle>
                <VaSpacer />
                <VaIcon :name="isCollapsed ? 'va-arrow-up' : 'va-arrow-down'" />
              </VaSidebarItemContent>
            </VaSidebarItem>
          </template>

          <template #body>
            <VaSidebarItem>
              <RouterLink to="/tablas">
                <VaSidebarItemContent>
                  <VaSidebarItemTitle>Tablas</VaSidebarItemTitle>
                </VaSidebarItemContent>
              </RouterLink>
            </VaSidebarItem>

            <VaSidebarItem>
              <RouterLink to="/trucks">
                <VaSidebarItemContent>
                  <VaSidebarItemTitle>Trucks</VaSidebarItemTitle>
                </VaSidebarItemContent>
              </RouterLink>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Ruedas</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Baleros</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Bolts</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Lijas</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>
          </template>
        </VaCollapse>

        <VaCollapse body-color="#00000022">
          <template #header="{ value: isCollapsed }">
            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Tenis</VaSidebarItemTitle>
                <VaSpacer />
                <VaIcon :name="isCollapsed ? 'va-arrow-up' : 'va-arrow-down'" />
              </VaSidebarItemContent>
            </VaSidebarItem>
          </template>

          <template #body>
            <VaSidebarItem>
              <RouterLink to="/convers">
                <VaSidebarItemContent>
                  <VaSidebarItemTitle>Converse</VaSidebarItemTitle>
                </VaSidebarItemContent>
              </RouterLink>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>DC Shoes Co</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Vans</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Adidas</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Nike SB</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>
          </template>
        </VaCollapse>


        <VaCollapse body-color="#00000022">
          <template #header="{ value: isCollapsed }">
            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Ropa</VaSidebarItemTitle>
                <VaSpacer />
                <VaIcon :name="isCollapsed ? 'va-arrow-up' : 'va-arrow-down'" />
              </VaSidebarItemContent>
            </VaSidebarItem>
          </template>

          <template #body>
            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Playeras</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Camisas</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Pantalones, Pants</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Shorts</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Calcetas</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>

            <VaSidebarItem>
              <VaSidebarItemContent>
                <VaSidebarItemTitle>Acessorios</VaSidebarItemTitle>
              </VaSidebarItemContent>
            </VaSidebarItem>
          </template>
        </VaCollapse>

      </VaAccordion>

      <VaSpacer />

      
    </VaSidebar>
  </div>
</template>

<style>
  @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
  
  #sidebar{
    box-sizing: border-box;
    width: 100%;
    max-width: 240px;
    min-height: auto; /* 🔥 Se adapta al contenido */
    overflow-y: auto;
    overflow-x: hidden;
   }
</style>