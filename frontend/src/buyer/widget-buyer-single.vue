<script>
import BuyerService from "./service";

export default {
    name: "WidgetBuyerSingle",
    props: ["id"],
    data: function () {
        return BuyerService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-buyer-single"> 
        
    </div>

</template>

<style scoped> 



</style>