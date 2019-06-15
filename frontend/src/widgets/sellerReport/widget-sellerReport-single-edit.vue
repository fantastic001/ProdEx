<script>
import SellerreportService from "./service";

export default {
    name: "WidgetSellerreportSingleEdit",
    props: ["sellerReport"],
    data: function () {
        return SellerreportService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-sellerReport-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>