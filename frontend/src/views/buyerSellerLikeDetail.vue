<script>



import BuyersellerlikeService from "../widgets/buyerSellerLike/service"
import WidgetBuyersellerlikeSingle from "../widgets/buyerSellerLike/widget-buyerSellerLike-single.vue"
import WidgetBuyersellerlikeNew from "../widgets/buyerSellerLike/widget-buyerSellerLike-new.vue"
import WidgetBuyersellerlikeSingleEdit from "../widgets/buyerSellerLike/widget-buyerSellerLike-single-edit.vue"
import WidgetBuyersellerlikeMulti from "../widgets/buyerSellerLike/widget-buyerSellerLike-multi.vue"


export default {
    name: "BuyersellerlikeDetail",
    props: ["id"],
    data: function () {
        var buyerSellerLike = BuyersellerlikeService.get(this.id);
        return {
            
            buyerSellerLike: buyerSellerLike
        }
    },
    components: {
        
        "WidgetBuyersellerlikeSingle": WidgetBuyersellerlikeSingle,
        "WidgetBuyersellerlikeNew": WidgetBuyersellerlikeNew,
        "WidgetBuyersellerlikeSingleEdit": WidgetBuyersellerlikeSingleEdit,
        "WidgetBuyersellerlikeMulti": WidgetBuyersellerlikeMulti
       
    }
}
</script>>

<template>
    <div class="buyerSellerLike-detail"> 
        <WidgetBuyersellerlikeSingle v-bind:id="buyerSellerLike.id" />

        
    </div>

</template>

<style scoped> 



</style>