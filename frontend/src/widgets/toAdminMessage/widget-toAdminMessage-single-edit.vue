<script>
import ToadminmessageService from "./service";

export default {
    name: "WidgetToadminmessageSingleEdit",
    props: ["id"],
    data: function () {
        return ToadminmessageService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-toAdminMessage-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>