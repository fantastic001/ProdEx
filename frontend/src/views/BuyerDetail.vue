<script>

import BuyerService from "../widgets/buyer/service"
import OrderService from "../widgets/order/service"
import WidgetBuyerSingle from "../widgets/buyer/widget-buyer-single.vue"
import WidgetOrderSingle from "../widgets/order/widget-order-single.vue"

export default {
    name: "BuyerDetail",
    props: ["id"],
    data: function () {
        var buyer = BuyerService.get(this.id);
        return {
            buyer: buyer,
            orders: OrderService.list().filter(order => order.buyer == buyer.id)
        }
    },
    components: {
        "WidgetBuyerSingle": WidgetBuyerSingle,
        "WidgetOrderSingle": WidgetOrderSingle
    }
}
</script>>

<template>
    <div class="buyer-detail"> 
        <WidgetBuyerSingle v-bind:id="buyer.id" />
        <WidgetOrderSingle v-for="(item, index) in orders" :key="item.id" v-bind:id="item" />
    </div>

</template>

<style scoped> 



</style>