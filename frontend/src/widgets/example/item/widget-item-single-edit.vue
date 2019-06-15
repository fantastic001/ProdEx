<script>
import ItemService from "./service";

export default {
    name: "WidgetItemSingleEdit",
    props: ["id"],
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