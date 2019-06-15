<script>
import ItemService from "./service";
import WidgetItemSingle from "./widget-item-single.vue"


export default {
    name: "WidgetItemMulti",
    data: function () {
        return {items: ItemService.list()};
    },
    components: {
    	"WidgetItemSingle": WidgetItemSingle
    }
}
</script>>

<template>
    <div class="widget-item-multi"> 
      <WidgetItemSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>