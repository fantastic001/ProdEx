<script>
import OrderService from "./service";

export default {
    name: "WidgetOrderSingleEdit",
    props: ["id"],
    data: function () {
        return OrderService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-order-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>