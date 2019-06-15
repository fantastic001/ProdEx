<script>
import FromadminmessageService from "./service";

export default {
    name: "WidgetFromadminmessageSingle",
    props: ["fromAdminMessage"],
    data: function () {
        return FromadminmessageService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-fromAdminMessage-single"> 
        
    </div>

</template>

<style scoped> 



</style>