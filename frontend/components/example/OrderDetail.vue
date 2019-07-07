<script>


import WidgetOrderReviewMulti from "../widgets/OrderReview/WidgetOrderReviewMulti.vue"


import OrderService from "../widgets/Order/service"
import WidgetOrderSingle from "../widgets/Order/WidgetOrderSingle.vue"
import WidgetOrderSingleEdit from "../widgets/Order/WidgetOrderSingleEdit.vue"
import WidgetOrderMulti from "../widgets/Order/WidgetOrderMulti.vue"
import WidgetOrderNew from "../widgets/Order/WidgetOrderNew.vue"


export default {
    name: "OrderDetail",
    props: ["order"],
    data: function () {
            return {
		data: {}
	    };
	}
    },
    mounted: function () 
    {
    	OrderService.get(order).then(response => this.data = response.data)
    }
    components: {
        
        "WidgetOrderReviewMulti": WidgetOrderReviewMulti,
        
        "WidgetOrderSingle": WidgetOrderSingle,
        "WidgetOrderNew": WidgetOrderNew,
        "WidgetOrderSingleEdit": WidgetOrderSingleEdit,
        "WidgetOrderMulti": WidgetOrderMulti
    }
}
</script>>

<template>
    <div class="Order-detail"> 
        <WidgetOrderSingle :order="order" />

        
        <WidgetOrderReviewMulti :filter="x => x.order == order"/>
        
        
    </div>

</template>

<style scoped> 



</style>