<script>

import WidgetUserMulti from "./src/widgets/user/widget-user-multi.vue";
import WidgetOrderMulti from "./src/widgets/order/widget-order-multi.vue";
import BuyerDetail from "./src/views/buyerDetail.vue";
export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "BuyerDetail": BuyerDetail
  }
}

</script>


<template>
  <div>
    <h1>Hello World!</h1>
    <WidgetUserMulti />
    <h1>Buyer:</h1>
    <BuyerDetail id="0" />
  </div>

</template>
