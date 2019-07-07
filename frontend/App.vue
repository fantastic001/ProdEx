<script>

import WidgetUserMulti from "./src/widgets/User/WidgetUserMulti.vue";
import AdminDetail from "./src/views/AdminDetail.vue";
export default {
  name: "App",
  components: {
    "WidgetUserMulti": WidgetUserMulti,
    "AdminDetail": AdminDetail,
  }
}

</script>


<template>
  <div>
    <AdminDetail admin="0" />
    <WidgetUserMulti />
 </div>

</template>
