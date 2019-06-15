<script>
import BuyerService from "./service";
import WidgetOrderSingle from "../order/widget-order-single.vue";

export default {
    name: "WidgetBuyerSingle",
    props: ["buyer"],
    data: function () {
        return BuyerService.get(this.id);
    },
    components: {
        "WidgetOrderSingle": WidgetOrderSingle
    }
}
</script>>

<template>
    <div class="widget-buyer-single"> 
        Buyer: 
    </div>

</template>

<style scoped> 



</style>