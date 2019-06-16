<script>



import SellerreportService from "../widgets/sellerReport/service"
import WidgetSellerreportSingle from "../widgets/sellerReport/widget-sellerReport-single.vue"
import WidgetSellerreportNew from "../widgets/sellerReport/widget-sellerReport-new.vue"
import WidgetSellerreportSingleEdit from "../widgets/sellerReport/widget-sellerReport-single-edit.vue"
import WidgetSellerreportMulti from "../widgets/sellerReport/widget-sellerReport-multi.vue"


export default {
    name: "SellerreportDetail",
    props: ["id"],
    data: function () {
        var sellerReport = SellerreportService.get(this.id);
        return {
            
            sellerReport: sellerReport
        }
    },
    components: {
        
        "WidgetSellerreportSingle": WidgetSellerreportSingle,
        "WidgetSellerreportNew": WidgetSellerreportNew,
        "WidgetSellerreportSingleEdit": WidgetSellerreportSingleEdit,
        "WidgetSellerreportMulti": WidgetSellerreportMulti
       
    }
}
</script>>

<template>
    <div class="sellerReport-detail"> 
        <WidgetSellerreportSingle v-bind:id="sellerReport.id" />

        
    </div>

</template>

<style scoped> 



</style>