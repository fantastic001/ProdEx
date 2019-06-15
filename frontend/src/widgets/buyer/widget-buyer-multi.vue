<script>
import BuyerService from "./service";
import WidgetBuyerSingle from "./widget-buyer-single.vue"


export default {
    name: "WidgetBuyerMulti",
    data: function () {
        return {items: BuyerService.list()};
    },
    components: {
    	"WidgetBuyerSingle": WidgetBuyerSingle
    }
}
</script>>

<template>
    <div class="widget-buyer-multi"> 
      <WidgetBuyerSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>