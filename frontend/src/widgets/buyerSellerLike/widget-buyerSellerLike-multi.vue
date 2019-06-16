<script>
import BuyersellerlikeService from "./service";
import WidgetBuyersellerlikeSingle from "./widget-buyerSellerLike-single.vue"


export default {
    name: "WidgetBuyersellerlikeMulti",
    data: function () {
        return {items: BuyersellerlikeService.list()};
    },
    components: {
    	"WidgetBuyersellerlikeSingle": WidgetBuyersellerlikeSingle
    }
}
</script>>

<template>
    <div class="widget-buyerSellerLike-multi"> 
      <WidgetBuyersellerlikeSingle
      	v-for="item in items"
      	v-bind:buyerSellerLike="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>