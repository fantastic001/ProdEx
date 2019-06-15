<script>
import BuyerfavoriteitemService from "./service";

export default {
    name: "WidgetBuyerfavoriteitemSingle",
    props: ["id"],
    data: function () {
        return BuyerfavoriteitemService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-buyerFavoriteItem-single"> 
        
    </div>

</template>

<style scoped> 



</style>