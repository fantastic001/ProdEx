<script>



import BuyerSellerLikeService from "../widgets/BuyerSellerLike/service"
import WidgetBuyerSellerLikeSingle from "../widgets/BuyerSellerLike/WidgetBuyerSellerLikeSingle.vue"
import WidgetBuyerSellerLikeSingleEdit from "../widgets/BuyerSellerLike/WidgetBuyerSellerLikeSingleEdit.vue"
import WidgetBuyerSellerLikeMulti from "../widgets/BuyerSellerLike/WidgetBuyerSellerLikeMulti.vue"
import WidgetBuyerSellerLikeNew from "../widgets/BuyerSellerLike/WidgetBuyerSellerLikeNew.vue"


export default {
    name: "BuyerSellerLikeDetail",
    props: ["buyersellerlike"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	BuyerSellerLikeService.get(buyersellerlike).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetBuyerSellerLikeSingle": WidgetBuyerSellerLikeSingle,
        "WidgetBuyerSellerLikeNew": WidgetBuyerSellerLikeNew,
        "WidgetBuyerSellerLikeSingleEdit": WidgetBuyerSellerLikeSingleEdit,
        "WidgetBuyerSellerLikeMulti": WidgetBuyerSellerLikeMulti
    }
}
</script>>

<template>
    <div class="BuyerSellerLike-detail"> 
        <WidgetBuyerSellerLikeSingle :buyersellerlike="buyersellerlike" />

        
    </div>

</template>

<style scoped> 



</style>