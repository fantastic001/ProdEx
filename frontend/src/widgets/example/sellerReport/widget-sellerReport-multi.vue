<script>
import SellerreportService from "./service";
import WidgetSellerreportSingle from "./widget-sellerReport-single.vue"


export default {
    name: "WidgetSellerreportMulti",
    data: function () {
        return {items: SellerreportService.list()};
    },
    components: {
    	"WidgetSellerreportSingle": WidgetSellerreportSingle
    }
}
</script>>

<template>
    <div class="widget-sellerReport-multi"> 
      <WidgetSellerreportSingle
      	v-for="item in items"
      	v-bind:id="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>