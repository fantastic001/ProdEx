<script>
import ConversationService from "./service";

export default {
    name: "WidgetConversationSingle",
    props: ["conversation"],
    data: function () {
        return ConversationService.get(this.id);
    },
}
</script>>

<template>
    <div class="widget-conversation-single"> 
        
    </div>

</template>

<style scoped> 



</style>