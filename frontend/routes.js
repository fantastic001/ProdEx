import Home from './src/views/Home.vue';
import ItemDetail from './src/views/ItemDetail.vue';

const routes = [
    { path: '/', component: Home },
    { path: '/items/:id', component: ItemDetail}
];


export default routes;
