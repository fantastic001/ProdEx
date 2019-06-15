<script>
import FromadminmessageService from "./service";
import WidgetFromadminmessageSingle from "./widget-fromAdminMessage-single.vue"


export default {
    name: "WidgetFromadminmessageMulti",
    data: function () {
        return {items: FromadminmessageService.list()};
    },
    components: {
    	"WidgetFromadminmessageSingle": WidgetFromadminmessageSingle
    }
}
</script>>

<template>
    <div class="widget-fromAdminMessage-multi"> 
      <WidgetFromadminmessageSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>