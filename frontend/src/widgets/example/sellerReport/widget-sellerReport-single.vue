<script>
import SellerreportService from "./service";

export default {
    name: "WidgetSellerreportSingle",
    props: ["sellerReport"],
    data: function () {
        return SellerreportService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-sellerReport-single"> 
        
    </div>

</template>

<style scoped> 



</style>