<script>
import OrderreviewService from "./service";

export default {
    name: "WidgetOrderreviewSingle",
    props: ["id"],
    data: function () {
        return OrderreviewService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-orderReview-single"> 
        
    </div>

</template>

<style scoped> 



</style>