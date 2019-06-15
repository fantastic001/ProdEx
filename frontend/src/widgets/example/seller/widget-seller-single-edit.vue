<script>
import SellerService from "./service";

export default {
    name: "WidgetSellerSingleEdit",
    props: ["seller"],
    data: function () {
        return SellerService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-seller-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>