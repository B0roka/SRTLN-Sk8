import './assets/main.css'

import { createApp } from 'vue';
import { createPinia } from 'pinia';
import App from './App.vue';
import router from './router';
import { library } from '@fortawesome/fontawesome-svg-core';
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';
import { fas } from '@fortawesome/free-solid-svg-icons';
import { fab } from '@fortawesome/free-brands-svg-icons';
import { far } from '@fortawesome/free-regular-svg-icons';
import { createVuestic } from 'vuestic-ui';
import 'vuestic-ui/styles/essential.css';
import 'vuestic-ui/styles/typography.css';

library.add(fas);
library.add(fab);
library.add(far);

//variable de pinia
const pinia = createPinia();

createApp(App)
.component('font-awesome-icon', FontAwesomeIcon)
.use(router)
.use(createVuestic())
.use(pinia)
.mount('#app');
