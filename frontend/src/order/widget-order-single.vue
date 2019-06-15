<script>
import OrderService from "./service";

export default {
    name: "WidgetOrderSingle",
    props: ["id"],
    data: function () {
        return OrderService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-order-single"> 
        
    </div>

</template>

<style scoped> 



</style>