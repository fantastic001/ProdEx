<script>
import BuyerService from "./service";

export default {
    name: "WidgetBuyerSingleEdit",
    props: ["buyer"],
    data: function () {
        return BuyerService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-buyer-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>