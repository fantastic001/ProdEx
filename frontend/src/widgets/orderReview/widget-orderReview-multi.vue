<script>
import OrderreviewService from "./service";
import WidgetOrderreviewSingle from "./widget-orderReview-single.vue"


export default {
    name: "WidgetOrderreviewMulti",
    data: function () {
        return {items: OrderreviewService.list()};
    },
    components: {
    	"WidgetOrderreviewSingle": WidgetOrderreviewSingle
    }
}
</script>>

<template>
    <div class="widget-orderReview-multi"> 
      <WidgetOrderreviewSingle
      	v-for="item in items"
      	v-bind:orderReview="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>