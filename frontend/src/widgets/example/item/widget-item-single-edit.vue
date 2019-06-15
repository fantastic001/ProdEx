<script>
import ItemService from "./service";

export default {
    name: "WidgetItemSingleEdit",
    props: ["item"],
    data: function () {
        return ItemService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-item-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>