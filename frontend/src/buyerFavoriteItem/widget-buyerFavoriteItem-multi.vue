<script>
import BuyerfavoriteitemService from "./service";
import WidgetBuyerfavoriteitemSingle from "./widget-buyerFavoriteItem-single.vue"


export default {
    name: "WidgetBuyerfavoriteitemMulti",
    data: function () {
        return {items: BuyerfavoriteitemService.list()};
    },
    components: {
    	"WidgetBuyerfavoriteitemSingle": WidgetBuyerfavoriteitemSingle
    }
}
</script>>

<template>
    <div class="widget-buyerFavoriteItem-multi"> 
      <WidgetBuyerfavoriteitemSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>