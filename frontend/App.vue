<script>

import WidgetUserMulti from "./src/widgets/User/WidgetUserMulti.vue";
import WidgetUserNew from "./src/widgets/User/WidgetUserNew.vue";
import AdminDetail from "./src/views/AdminDetail.vue";
import BuyerDetail from "./src/views/BuyerDetail.vue";
import SellerDetail from "./src/views/SellerDetail.vue";
export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "WidgetUserNew": WidgetUserNew,
    "AdminDetail": AdminDetail,
    "BuyerDetail": BuyerDetail,
    "SellerDetail": SellerDetail,
  }
}

</script>


<template>
  <div>
    <AdminDetail admin="0" />
    <BuyerDetail buyer="0" />
    <SellerDetail seller="0" />
    <WidgetUserMulti />
    <WidgetUserNew />
 </div>

</template>
