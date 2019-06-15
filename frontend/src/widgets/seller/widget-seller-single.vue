<script>
import SellerService from "./service";

export default {
    name: "WidgetSellerSingle",
    props: ["id"],
    data: function () {
        return SellerService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-seller-single"> 
        
    </div>

</template>

<style scoped> 



</style>