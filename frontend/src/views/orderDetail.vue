<script>


import OrderreviewService from "../widgets/orderReview/service"
import WidgetOrderreviewSingle from "../widgets/orderReview/widget-orderReview-single.vue"


import OrderService from "../widgets/order/service"
import WidgetOrderSingle from "../widgets/order/widget-order-single.vue"
import WidgetOrderNew from "../widgets/order/widget-order-new.vue"
import WidgetOrderSingleEdit from "../widgets/order/widget-order-single-edit.vue"
import WidgetOrderMulti from "../widgets/order/widget-order-multi.vue"


export default {
    name: "OrderDetail",
    props: ["id"],
    data: function () {
        var order = OrderService.get(this.id);
        return {
            
            orderReviews: OrderreviewService.list().filter(orderReview => orderReview.order == order.id),
            
            order: order
        }
    },
    components: {
        
        "WidgetOrderreviewSingle": WidgetOrderreviewSingle,
        
        "WidgetOrderSingle": WidgetOrderSingle,
        "WidgetOrderNew": WidgetOrderNew,
        "WidgetOrderSingleEdit": WidgetOrderSingleEdit,
        "WidgetOrderMulti": WidgetOrderMulti
       
    }
}
</script>>

<template>
    <div class="order-detail"> 
        <WidgetOrderSingle v-bind:id="order.id" />

        
        <WidgetOrderreviewSingle v-for="(item, index) in orderReviews" :key="item.id" v-bind:id="item" />
        
        
    </div>

</template>

<style scoped> 



</style>