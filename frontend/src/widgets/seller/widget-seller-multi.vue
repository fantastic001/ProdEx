<script>
import SellerService from "./service";
import WidgetSellerSingle from "./widget-seller-single.vue"


export default {
    name: "WidgetSellerMulti",
    data: function () {
        return {items: SellerService.list()};
    },
    components: {
    	"WidgetSellerSingle": WidgetSellerSingle
    }
}
</script>>

<template>
    <div class="widget-seller-multi"> 
      <WidgetSellerSingle
      	v-for="item in items"
      	v-bind:seller="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>