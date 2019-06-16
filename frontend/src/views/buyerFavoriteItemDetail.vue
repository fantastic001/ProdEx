<script>



import BuyerfavoriteitemService from "../widgets/buyerFavoriteItem/service"
import WidgetBuyerfavoriteitemSingle from "../widgets/buyerFavoriteItem/widget-buyerFavoriteItem-single.vue"
import WidgetBuyerfavoriteitemNew from "../widgets/buyerFavoriteItem/widget-buyerFavoriteItem-new.vue"
import WidgetBuyerfavoriteitemSingleEdit from "../widgets/buyerFavoriteItem/widget-buyerFavoriteItem-single-edit.vue"
import WidgetBuyerfavoriteitemMulti from "../widgets/buyerFavoriteItem/widget-buyerFavoriteItem-multi.vue"


export default {
    name: "BuyerfavoriteitemDetail",
    props: ["id"],
    data: function () {
        var buyerFavoriteItem = BuyerfavoriteitemService.get(this.id);
        return {
            
            buyerFavoriteItem: buyerFavoriteItem
        }
    },
    components: {
        
        "WidgetBuyerfavoriteitemSingle": WidgetBuyerfavoriteitemSingle,
        "WidgetBuyerfavoriteitemNew": WidgetBuyerfavoriteitemNew,
        "WidgetBuyerfavoriteitemSingleEdit": WidgetBuyerfavoriteitemSingleEdit,
        "WidgetBuyerfavoriteitemMulti": WidgetBuyerfavoriteitemMulti
       
    }
}
</script>>

<template>
    <div class="buyerFavoriteItem-detail"> 
        <WidgetBuyerfavoriteitemSingle v-bind:id="buyerFavoriteItem.id" />

        
    </div>

</template>

<style scoped> 



</style>