<script>
import ItemreportService from "./service";
import WidgetItemreportSingle from "./widget-itemReport-single.vue"


export default {
    name: "WidgetItemreportMulti",
    data: function () {
        return {items: ItemreportService.list()};
    },
    components: {
    	"WidgetItemreportSingle": WidgetItemreportSingle
    }
}
</script>>

<template>
    <div class="widget-itemReport-multi"> 
      <WidgetItemreportSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>