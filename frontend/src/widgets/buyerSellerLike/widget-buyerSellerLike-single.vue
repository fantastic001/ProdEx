<script>
import BuyersellerlikeService from "./service";

export default {
    name: "WidgetBuyersellerlikeSingle",
    props: ["buyerSellerLike"],
    data: function () {
        return BuyersellerlikeService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-buyerSellerLike-single"> 
        
    </div>

</template>

<style scoped> 



</style>