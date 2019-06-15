<script>
import CityService from "./service";

export default {
    name: "WidgetCitySingle",
    props: ["city"],
    data: function () {
        return CityService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-city-single"> 
        
    </div>

</template>

<style scoped> 



</style>