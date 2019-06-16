<script>



import OrderreviewService from "../widgets/orderReview/service"
import WidgetOrderreviewSingle from "../widgets/orderReview/widget-orderReview-single.vue"
import WidgetOrderreviewNew from "../widgets/orderReview/widget-orderReview-new.vue"
import WidgetOrderreviewSingleEdit from "../widgets/orderReview/widget-orderReview-single-edit.vue"
import WidgetOrderreviewMulti from "../widgets/orderReview/widget-orderReview-multi.vue"


export default {
    name: "OrderreviewDetail",
    props: ["id"],
    data: function () {
        var orderReview = OrderreviewService.get(this.id);
        return {
            
            orderReview: orderReview
        }
    },
    components: {
        
        "WidgetOrderreviewSingle": WidgetOrderreviewSingle,
        "WidgetOrderreviewNew": WidgetOrderreviewNew,
        "WidgetOrderreviewSingleEdit": WidgetOrderreviewSingleEdit,
        "WidgetOrderreviewMulti": WidgetOrderreviewMulti
       
    }
}
</script>>

<template>
    <div class="orderReview-detail"> 
        <WidgetOrderreviewSingle v-bind:id="orderReview.id" />

        
    </div>

</template>

<style scoped> 



</style>