<script>
import MessageService from "./service";

export default {
    name: "WidgetMessageSingle",
    props: ["id"],
    data: function () {
        return MessageService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-message-single"> 
        
    </div>

</template>

<style scoped> 



</style>