<script setup>
    import logo from '@/assets/img/logo-srtln.png'
</script>

<template>
    <header class="header">
        <nav>
            <ul class="nav-links">
                <li><a href="">Carrito</a></li>
                <li><a href="">Corazon</a></li>
                <li><RouterLink to="/login">Perfil</RouterLink></li>
            </ul>
        </nav>
        <div class="logo">
            <RouterLink to="/"><img v-bind:src="logo" alt="Logo SRTLN"></RouterLink>
        </div>
        <a href="#" class="btn"><button>Contacto</button></a>
    </header>
</template>

<style scoped>
  @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');


  *{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: "Indie Flower", serif;
  }

  .header{
    background-color: #AE83EB;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 5px 10%;
  }

  .header .logo{
    cursor: pointer;
  }

  .header .logo img{
    height: 70px;
    width: auto;
    transition: all 0.3s;
  }

  .header .logo img:hover{
    transform: scale(1,2);
  }

  .header .nav-links{
    list-style: none;
  }

  .header .nav-links li{
    display: inline-block;
    padding: 0 20;
  }

  .header .nav-links a{
    font-size: 700;
  }
</style>