<script>

import WidgetUserSingle from "./src/user/widget-user-single.vue";

export default {
  name: "App",
  components: {
    "WidgetUserSingle": WidgetUserSingle
  }
}

</script>


<template>
  <div>
    <h1>Hello World!</h1>
    <WidgetUserSingle id="0" />
  </div>
</template>
