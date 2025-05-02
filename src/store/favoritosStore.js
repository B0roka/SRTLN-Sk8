import { defineStore } from "pinia";

export const useFavoritosStore = defineStore('favoritos', {
    state: () => ({
        favoritos: [], //almacen de los productos favoritos
    }),
    actions: {
        toggleFavorito(producto) {
            const index = this.favoritos.findIndex((fav) => fav.id == producto.id);
            if (index == -1) {
                this.favoritos.push(producto); //agregar producto a favoritos
            } else {
                this.favoritos.splice(index, 1); //Eliminar producto de favoritos
            }
        },
    },
});