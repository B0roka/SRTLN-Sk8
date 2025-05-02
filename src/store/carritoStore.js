import { defineStore } from 'pinia';

export const useCarritoStore = defineStore('carrito', {
    state: () => ({
        carrito: [], //lista de productos en el carrito
        envio: 200, //costo fijo del envio 
    }),
    getters: {
        totalProductos() {
            return this.carrito.reduce((total, producto) => {
                const precioNumerico = parseFloat(producto.precio.replace('$', '').replace(',', ''));
                return total + precioNumerico;
            }, 0);
        },
        totalConEnvio() {
            return this.totalProductos + this.envio;
        }
    },
    actions: {
        toggleCarrito(producto) {
            const index = this.carrito.findIndex(prod => prod.id == producto.id);
            if (index == -1) {
                this.carrito.push(producto); //agregar al carrito
            } else {
                this.carrito.splice(index, 1); //eliminar del carrito
            }
        },
    },
})