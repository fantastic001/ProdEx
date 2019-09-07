<script>
import OrderService from "./service";
import WidgetBuyerSingle from "../Buyer/WidgetBuyerSingle.vue";
import WidgetItemSingle from "../Item/WidgetItemSingle.vue";

export default {
    name: "WidgetOrderSingle",
    props: ["order"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        OrderService.get(this.order).then(response => this.data = response.data);
    },
    components: {
    	"WidgetBuyerSingle": WidgetBuyerSingle,
	"WidgetItemSingle": WidgetItemSingle
    }
}
</script>

<template>
    <div class="widget-order-single"> 
    <WidgetBuyerSingle :buyer="this.buyer" />
    <WidgetItemSingle :item="this.item" />
    </div>

</template>

<style scoped> 



</style>
