<script>
import CityService from "./service";

export default {
    name: "WidgetCitySingleEdit",
    props: ["city"],
    data: function () {
        return CityService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-city-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>