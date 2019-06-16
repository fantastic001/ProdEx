<script>
import BuyersellerlikeService from "./service";

export default {
    name: "WidgetBuyersellerlikeSingleEdit",
    props: ["buyerSellerLike"],
    data: function () {
        return BuyersellerlikeService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-buyerSellerLike-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>