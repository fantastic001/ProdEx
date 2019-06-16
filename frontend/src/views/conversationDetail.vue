<script>



import ConversationService from "../widgets/conversation/service"
import WidgetConversationSingle from "../widgets/conversation/widget-conversation-single.vue"
import WidgetConversationNew from "../widgets/conversation/widget-conversation-new.vue"
import WidgetConversationSingleEdit from "../widgets/conversation/widget-conversation-single-edit.vue"
import WidgetConversationMulti from "../widgets/conversation/widget-conversation-multi.vue"


export default {
    name: "ConversationDetail",
    props: ["id"],
    data: function () {
        var conversation = ConversationService.get(this.id);
        return {
            
            conversation: conversation
        }
    },
    components: {
        
        "WidgetConversationSingle": WidgetConversationSingle,
        "WidgetConversationNew": WidgetConversationNew,
        "WidgetConversationSingleEdit": WidgetConversationSingleEdit,
        "WidgetConversationMulti": WidgetConversationMulti
       
    }
}
</script>>

<template>
    <div class="conversation-detail"> 
        <WidgetConversationSingle v-bind:id="conversation.id" />

        
    </div>

</template>

<style scoped> 



</style>