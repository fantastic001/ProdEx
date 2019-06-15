<script>

import WidgetUserMulti from "./src/widgets/user/widget-user-multi.vue";
import WidgetOrderMulti from "./src/widgets/order/widget-order-multi.vue";
export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "WidgetOrderMulti": WidgetOrderMulti,
  }
}

</script>


<template>
  <div>
    <h1>Hello World!</h1>
    <WidgetUserMulti />
    <h1>Orders</h1>
    <WidgetOrderMulti />
  </div>

</template>
