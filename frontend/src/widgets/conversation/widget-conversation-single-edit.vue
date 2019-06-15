<script>
import ConversationService from "./service";

export default {
    name: "WidgetConversationSingleEdit",
    props: ["id"],
    data: function () {
        return ConversationService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-conversation-single-edit"> 
        
    </div>

</template>

<style scoped> 



</style>