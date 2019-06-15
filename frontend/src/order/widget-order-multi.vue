<script>
import OrderService from "./service";
import WidgetOrderSingle from "./widget-order-single.vue"


export default {
    name: "WidgetOrderMulti",
    data: function () {
        return {items: OrderService.list()};
    },
    components: {
    	"WidgetOrderSingle": WidgetOrderSingle
    }
}
</script>>

<template>
    <div class="widget-order-multi"> 
      <WidgetOrderSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>