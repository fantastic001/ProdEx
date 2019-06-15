<script>
import ToadminmessageService from "./service";

export default {
    name: "WidgetToadminmessageSingle",
    props: ["toAdminMessage"],
    data: function () {
        return ToadminmessageService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-toAdminMessage-single"> 
        
    </div>

</template>

<style scoped> 



</style>