import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router';
import { library } from '@fortawesome/fontawesome-svg-core';
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';
import { fas } from '@fortawesome/free-solid-svg-icons';
import { createVuestic } from 'vuestic-ui';
import 'vuestic-ui/styles/essential.css';
import 'vuestic-ui/styles/typography.css';

library.add(fas);

createApp(App)
.component('font-awesome-icon', FontAwesomeIcon)
.use(router)
.use(createVuestic())
.mount('#app');
