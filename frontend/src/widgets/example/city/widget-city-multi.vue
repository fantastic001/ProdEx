<script>
import CityService from "./service";
import WidgetCitySingle from "./widget-city-single.vue"


export default {
    name: "WidgetCityMulti",
    data: function () {
        return {items: CityService.list()};
    },
    components: {
    	"WidgetCitySingle": WidgetCitySingle
    }
}
</script>>

<template>
    <div class="widget-city-multi"> 
      <WidgetCitySingle
      	v-for="item in items"
      	v-bind:city="item"
      	v-bind:key="item.id"/>
    </div>

</template>

<style scoped> 



</style>