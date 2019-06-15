<script>
import OrderreviewService from "./service";

export default {
    name: "WidgetOrderreviewSingleEdit",
    props: ["orderReview"],
    data: function () {
        return OrderreviewService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-orderReview-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>