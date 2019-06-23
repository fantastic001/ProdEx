<script>

import WidgetUserMulti from "./src/widgets/user/widget-user-multi.vue";
import WidgetOrderMulti from "./src/widgets/order/widget-order-multi.vue";
import WidgetItemMulti from "./src/widgets/item/widget-item-multi.vue";
import BuyerDetail from "./src/views/buyerDetail.vue";
import SellerDetail from "./src/views/sellerDetail.vue";


export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "BuyerDetail": BuyerDetail,
    "SellerDetail": SellerDetail,
    "WidgetItemMulti": WidgetItemMulti
  }
}

</script>


<template>
  <div>
    <h1>Hello World!</h1>
    <WidgetUserMulti />
    <h1>Buyer:</h1>
    <BuyerDetail id="0" />

    <h1>This is seller</h1>
    <SellerDetail id="0" />

    <p>Items</p>
    <WidgetItemMulti />
  </div>

</template>
