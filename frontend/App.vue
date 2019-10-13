<script>

import WidgetUserMulti from "./src/widgets/User/WidgetUserMulti.vue";
import WidgetItemMulti from "./src/widgets/Item/WidgetItemMulti.vue";
import WidgetUserNew from "./src/widgets/User/WidgetUserNew.vue";
import WidgetLoginNew from "./src/widgets/Auth/WidgetLoginNew.vue";
import AdminDetail from "./src/views/AdminDetail.vue";
import BuyerDetail from "./src/views/BuyerDetail.vue";
import ItemDetail from "./src/views/ItemDetail.vue";
import SellerDetail from "./src/views/SellerDetail.vue";
import WidgetCategoryMulti from "./src/widgets/Category/WidgetCategoryMulti.vue";
export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "WidgetUserNew": WidgetUserNew,
    "AdminDetail": AdminDetail,
    "BuyerDetail": BuyerDetail,
    "ItemDetail": ItemDetail,
    "SellerDetail": SellerDetail,
    "WidgetLoginNew": WidgetLoginNew,
    "WidgetItemMulti": WidgetItemMulti,
    "WidgetCategoryMulti": WidgetCategoryMulti,
  }
}

</script>


<template>
  <div id="app">
    <nav>
        <router-link to='/'>Home</router-link>
        <router-link to='/items/0'>Item 1</router-link>
        <router-link to='/items/1'>Item 2</router-link>
    </nav>
    <router-view />
  </div>
</template>
