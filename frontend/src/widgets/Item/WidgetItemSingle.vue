<script>
import ItemService from "./service";

export default {
    name: "WidgetItemSingle",
    props: ["item"],
    data: function () {
        return {
            data: {}
        }
    },
    mounted: function () 
    {
        ItemService.get(this.item).then(response => this.data = response.data);
    }
}
</script>

<template>
    <div class="widget-item-single"> 
    Item (id={{ data.id }}):

    <h2>{{data.name }}</h2>

    </div>

</template>

<style scoped> 



</style>
