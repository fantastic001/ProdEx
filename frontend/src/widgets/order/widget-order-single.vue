<script>
import OrderService from "./service";
import WidgetItemSingle from "../item/widget-item-single.vue";


export default {
    name: "WidgetOrderSingle",
    props: ["id"],
    data: function () {
        return OrderService.get(this.id);
    },
    components: {
        "WidgetItemSingle": WidgetItemSingle
    }
}
</script>>

<template>
    <div class="widget-order-single"> 
        <p>Order</p>
        <WidgetItemSingle v-bind:id="item"/>
    </div>

</template>

<style scoped> 



</style>