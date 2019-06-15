<script>
import BuyerfavoriteitemService from "./service";

export default {
    name: "WidgetBuyerfavoriteitemSingleEdit",
    props: ["buyerFavoriteItem"],
    data: function () {
        return BuyerfavoriteitemService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-buyerFavoriteItem-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>