<script>
import ToadminmessageService from "./service";
import WidgetToadminmessageSingle from "./widget-toAdminMessage-single.vue"


export default {
    name: "WidgetToadminmessageMulti",
    data: function () {
        return {items: ToadminmessageService.list()};
    },
    components: {
    	"WidgetToadminmessageSingle": WidgetToadminmessageSingle
    }
}
</script>>

<template>
    <div class="widget-toAdminMessage-multi"> 
      <WidgetToadminmessageSingle
      	v-for="item in items"
      	v-bind:toAdminMessage="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>