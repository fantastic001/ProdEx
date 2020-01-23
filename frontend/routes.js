import Home from './src/views/Home.vue';
import ItemDetail from './src/views/ItemDetail.vue';
import Login from './src/views/Login.vue';
import Logout from './src/views/Logout.vue';
import Registration from  "./src/views/Registration.vue";
const routes = [
    { path: '/', component: Home },
    { path: '/login', component: Login },
    { path: '/logout', component: Logout },
    { path: '/registration', component: Registration },
    { path: '/items/:id', component: ItemDetail, props: true},
];


export default routes;
