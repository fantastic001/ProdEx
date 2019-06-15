<script>
import FromadminmessageService from "./service";

export default {
    name: "WidgetFromadminmessageSingleEdit",
    props: ["fromAdminMessage"],
    data: function () {
        return FromadminmessageService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-fromAdminMessage-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>