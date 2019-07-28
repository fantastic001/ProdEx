<script>

import WidgetUserMulti from "./src/widgets/User/WidgetUserMulti.vue";
import AdminDetail from "./src/views/AdminDetail.vue";
import BuyerDetail from "./src/views/BuyerDetail.vue";
export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "AdminDetail": AdminDetail,
    "BuyerDetail": BuyerDetail,
  }
}

</script>


<template>
  <div>
    <AdminDetail admin="0" />
    <BuyerDetail buyer="0" />
    <WidgetUserMulti />
 </div>

</template>
