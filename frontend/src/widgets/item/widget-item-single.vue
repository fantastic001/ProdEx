<script>
import ItemService from "./service";

export default {
    name: "WidgetItemSingle",
    props: ["item"],
    data: function () {
        return ItemService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-item-single"> 
        Item {{ name }}
    </div>

</template>

<style scoped> 



</style>