<script>
import ItemService from "./service";

export default {
    name: "WidgetItemSingle",
    props: ["id"],
    data: function () {
        return ItemService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-item-single"> 
        
    </div>

</template>

<style scoped> 



</style>