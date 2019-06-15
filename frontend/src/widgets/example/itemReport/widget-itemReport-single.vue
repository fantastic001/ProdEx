<script>
import ItemreportService from "./service";

export default {
    name: "WidgetItemreportSingle",
    props: ["itemReport"],
    data: function () {
        return ItemreportService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-itemReport-single"> 
        
    </div>

</template>

<style scoped> 



</style>