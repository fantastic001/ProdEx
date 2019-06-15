<script>
import ItemreportService from "./service";

export default {
    name: "WidgetItemreportSingleEdit",
    props: ["id"],
    data: function () {
        return ItemreportService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-itemReport-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>