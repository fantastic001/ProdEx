<script>



import ItemreportService from "../widgets/itemReport/service"
import WidgetItemreportSingle from "../widgets/itemReport/widget-itemReport-single.vue"
import WidgetItemreportNew from "../widgets/itemReport/widget-itemReport-new.vue"
import WidgetItemreportSingleEdit from "../widgets/itemReport/widget-itemReport-single-edit.vue"
import WidgetItemreportMulti from "../widgets/itemReport/widget-itemReport-multi.vue"


export default {
    name: "ItemreportDetail",
    props: ["id"],
    data: function () {
        var itemReport = ItemreportService.get(this.id);
        return {
            
            itemReport: itemReport
        }
    },
    components: {
        
        "WidgetItemreportSingle": WidgetItemreportSingle,
        "WidgetItemreportNew": WidgetItemreportNew,
        "WidgetItemreportSingleEdit": WidgetItemreportSingleEdit,
        "WidgetItemreportMulti": WidgetItemreportMulti
       
    }
}
</script>>

<template>
    <div class="itemReport-detail"> 
        <WidgetItemreportSingle v-bind:id="itemReport.id" />

        
    </div>

</template>

<style scoped> 



</style>