<script>
import MessageService from "./service";
import WidgetMessageSingle from "./widget-message-single.vue"


export default {
    name: "WidgetMessageMulti",
    data: function () {
        return {items: MessageService.list()};
    },
    components: {
    	"WidgetMessageSingle": WidgetMessageSingle
    }
}
</script>>

<template>
    <div class="widget-message-multi"> 
      <WidgetMessageSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>