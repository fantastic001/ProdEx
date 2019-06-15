<script>
import MessageService from "./service";

export default {
    name: "WidgetMessageSingleEdit",
    props: ["message"],
    data: function () {
        return MessageService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-message-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>